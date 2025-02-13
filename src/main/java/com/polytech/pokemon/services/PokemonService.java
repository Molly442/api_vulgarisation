package com.polytech.pokemon.services;

import com.polytech.pokemon.dtos.PokemonDTO;
import com.polytech.pokemon.dtos.PokemonResponseDTO;
import com.polytech.pokemon.entities.Pokemon;
import com.polytech.pokemon.entities.PokemonSpecies;
import com.polytech.pokemon.repository.PokemonColorRepository;
import com.polytech.pokemon.repository.PokemonRepository;
import com.polytech.pokemon.repository.PokemonShapeRepository;
import com.polytech.pokemon.repository.PokemonSpeciesRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PokemonService {

    private final PokemonRepository pokemonRepository;
    private final PokemonSpeciesRepository pokemonSpeciesRepository;
    private final PokemonColorRepository pokemonColorRepository;
    private final PokemonShapeRepository pokemonShapeRepository;

    public PokemonService(PokemonRepository pokemonRepository, PokemonSpeciesRepository pokemonSpeciesRepository, PokemonColorRepository pokemonColorRepository, PokemonShapeRepository pokemonShapeRepository) {
        this.pokemonRepository = pokemonRepository;
        this.pokemonSpeciesRepository = pokemonSpeciesRepository;
        this.pokemonColorRepository = pokemonColorRepository;
        this.pokemonShapeRepository = pokemonShapeRepository;
    }

    public List<PokemonResponseDTO> getPokemons() {
        return pokemonRepository.findAll().stream().map(this::toPokemonResponseDTO).collect(Collectors.toList());
    }

    public PokemonResponseDTO getPokemonById(Integer id) {
        return pokemonRepository.findById(id).map(this::toPokemonResponseDTO).orElseThrow();
    }

    @Transactional
    public PokemonResponseDTO addPokemon(PokemonDTO pokemonDTO) {
        PokemonSpecies species = new PokemonSpecies();
        species.setIdentifier(pokemonDTO.getIdentifier());
        species.setGenerationId(pokemonDTO.getGeneration_id());
        species.setEvolutionChainId(pokemonDTO.getEvolution_chain_id());
        species.setHabitatId(pokemonDTO.getHabitat_id());
        species.setGenderRate(pokemonDTO.getGender_rate());
        species.setCaptureRate(pokemonDTO.getCapture_rate());
        species.setBaseHappiness(pokemonDTO.getBase_happiness());
        species.setBaby(pokemonDTO.getIs_baby());
        species.setHatchCounter(pokemonDTO.getHatch_counter());
        species.setHasGenderDifferences(pokemonDTO.getHas_gender_differences());
        species.setGrowthRateId(pokemonDTO.getGrowth_rate_id());
        species.setFormsSwitchable(pokemonDTO.getForms_switchable());
        species.setOrder(pokemonDTO.getOrder());
        species.setConquestOrder(pokemonDTO.getConquest_order());
        species.setId(pokemonSpeciesRepository.findSpecieMaxId() + 1);

        if (pokemonDTO.getColor_id() != null) {
            species.setColor(pokemonColorRepository.findById(pokemonDTO.getColor_id()).orElseThrow());
        }

        if (pokemonDTO.getShape_id() != null) {
            species.setShape(pokemonShapeRepository.findById(pokemonDTO.getShape_id()).orElseThrow());
        }

        if (pokemonDTO.getEvolves_from_species_id() != null) {
            PokemonSpecies evolvesFrom = pokemonSpeciesRepository.findById(pokemonDTO.getEvolves_from_species_id())
                    .orElseThrow(() -> new IllegalArgumentException("L'espèce d'origine n'existe pas"));
            species.setEvolvesFromSpecies(evolvesFrom);
        }

        species = pokemonSpeciesRepository.save(species);

        Pokemon pokemon = new Pokemon();
        pokemon.setIdentifier(pokemonDTO.getIdentifier());
        pokemon.setHeight(pokemonDTO.getHeight());
        pokemon.setWeight(pokemonDTO.getWeight());
        pokemon.setBaseExperience(pokemonDTO.getBase_experience());
        pokemon.setOrder(pokemonDTO.getOrder());
        pokemon.setIsDefault(pokemonDTO.getIs_default());
        pokemon.setSpecies(species);
        pokemon.setId(pokemonSpeciesRepository.findSpecieMaxId() + 1);
        return toPokemonResponseDTO(pokemonRepository.save(pokemon));
    }

    @Transactional
    public PokemonResponseDTO updatePokemon(Integer id, PokemonDTO pokemonDTO) {
        return pokemonRepository.findById(id).map(pokemon -> {
            if (pokemonDTO.getIdentifier() != null) pokemon.setIdentifier(pokemonDTO.getIdentifier());
            if (pokemonDTO.getHeight() != null) pokemon.setHeight(pokemonDTO.getHeight());
            if (pokemonDTO.getWeight() != null) pokemon.setWeight(pokemonDTO.getWeight());
            if (pokemonDTO.getBase_experience() != null) pokemon.setBaseExperience(pokemonDTO.getBase_experience());
            if (pokemonDTO.getOrder() != null) pokemon.setOrder(pokemonDTO.getOrder());
            if (pokemonDTO.getIs_default() != null) pokemon.setIsDefault(pokemonDTO.getIs_default());

            PokemonSpecies species = pokemon.getSpecies();
            if (species == null) {
                throw new RuntimeException("Pas de species");
            }

            if (pokemonDTO.getGeneration_id() != null) species.setGenerationId(pokemonDTO.getGeneration_id());
            if (pokemonDTO.getEvolution_chain_id() != null)
                species.setEvolutionChainId(pokemonDTO.getEvolution_chain_id());
            if (pokemonDTO.getHabitat_id() != null) species.setHabitatId(pokemonDTO.getHabitat_id());
            if (pokemonDTO.getGender_rate() != null) species.setGenderRate(pokemonDTO.getGender_rate());
            if (pokemonDTO.getCapture_rate() != null) species.setCaptureRate(pokemonDTO.getCapture_rate());
            if (pokemonDTO.getBase_happiness() != null) species.setBaseHappiness(pokemonDTO.getBase_happiness() );
            if (pokemonDTO.getIs_baby() != null) species.setBaby(pokemonDTO.getIs_baby());
            if (pokemonDTO.getHatch_counter() != null) species.setHatchCounter(pokemonDTO.getHatch_counter());
            if (pokemonDTO.getHas_gender_differences() != null)
                species.setHasGenderDifferences(pokemonDTO.getHas_gender_differences());
            if (pokemonDTO.getGrowth_rate_id() != null) species.setGrowthRateId(pokemonDTO.getGrowth_rate_id());
            if (pokemonDTO.getForms_switchable() != null) species.setFormsSwitchable(pokemonDTO.getForms_switchable());
            if (pokemonDTO.getOrder() != null) species.setOrder(pokemonDTO.getOrder());
            if (pokemonDTO.getConquest_order() != null) species.setConquestOrder(pokemonDTO.getConquest_order());

            if (pokemonDTO.getColor_id() != null) {
                species.setColor(pokemonColorRepository.findById(pokemonDTO.getColor_id()).orElseThrow());
            }

            if (pokemonDTO.getShape_id() != null) {
                species.setShape(pokemonShapeRepository.findById(pokemonDTO.getShape_id()).orElseThrow());
            }

            if (!pokemonSpeciesRepository.existsById(species.getId())) {
                species = pokemonSpeciesRepository.save(species);
            }

            pokemonSpeciesRepository.save(species);
            return toPokemonResponseDTO(pokemonRepository.save(pokemon));
        }).orElseThrow();
    }

    @Transactional
    public void deletePokemonById(Integer id) {
        pokemonRepository.deletePokemonTypes(id);
        pokemonRepository.deletePokemon(id);
    }

    public PokemonResponseDTO toPokemonResponseDTO(Pokemon pokemon) {
        PokemonResponseDTO pokemonResponseDTO = new PokemonResponseDTO();
        pokemonResponseDTO.setId(pokemon.getId());
        pokemonResponseDTO.setIdentifier(pokemon.getIdentifier());
        pokemonResponseDTO.setHeight(pokemon.getHeight());
        pokemonResponseDTO.setWeight(pokemon.getWeight());
        pokemonResponseDTO.setBaseExperience(pokemon.getBaseExperience());
        pokemonResponseDTO.setOrder(pokemon.getOrder());
        pokemonResponseDTO.setIsDefault(pokemon.getIsDefault());
        if (pokemon.getSpecies() != null) {
            pokemonResponseDTO.setGenerationId(pokemon.getSpecies().getGenerationId() != null ? pokemon.getSpecies().getGenerationId() : null);
            pokemonResponseDTO.setEvolvesFromSpeciesId(pokemon.getSpecies().getEvolvesFromSpecies() != null ? pokemon.getSpecies().getEvolvesFromSpecies().getId() : null);
            pokemonResponseDTO.setEvolutionChainId(pokemon.getSpecies().getEvolutionChainId());
            pokemonResponseDTO.setHasGenderDifferences(pokemon.getSpecies().getHasGenderDifferences());
            pokemonResponseDTO.setGrowthRateId(pokemon.getSpecies().getGrowthRateId());
            pokemonResponseDTO.setGenderRate(pokemon.getSpecies().getGenderRate());
            pokemonResponseDTO.setCaptureRate(pokemon.getSpecies().getCaptureRate());
            pokemonResponseDTO.setBaseHappiness(pokemon.getSpecies().getBaseHappiness());
            pokemonResponseDTO.setIsBaby(pokemon.getSpecies().getBaby());
            pokemonResponseDTO.setHatchCounter(pokemon.getSpecies().getHatchCounter());
            pokemonResponseDTO.setFormsSwitchable(pokemon.getSpecies().getFormsSwitchable());
            if (pokemon.getSpecies().getColor() != null) {
                pokemonResponseDTO.setColor(pokemon.getSpecies().getColor().getIdentifier());
            }
            if (pokemon.getSpecies().getShape() != null) {
                pokemonResponseDTO.setShapeId(pokemon.getSpecies().getShape().getIdentifier());
            }
            if (pokemon.getSpecies().getHabitatId() != null) {
                pokemonResponseDTO.setHabitatId(pokemon.getSpecies().getHabitatId());
            }
            pokemonResponseDTO.setConquestOrder(pokemon.getSpecies().getConquestOrder());
        }
        return pokemonResponseDTO;
    }
}

