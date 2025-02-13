FROM openjdk:17-jdk-slim AS build
WORKDIR /app

COPY . .
RUN ./mvnw clean package -DskipTests

FROM openjdk:17-jdk-slim
WORKDIR /app

COPY --from=build /app/target/pokemon-0.0.1-SNAPSHOT.jar pokemon-0.0.1-SNAPSHOT.jar

EXPOSE 8080
CMD ["java", "-jar", "pokemon-0.0.1-SNAPSHOT.jar"]
