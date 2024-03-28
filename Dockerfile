# Use a base image with Java and Maven installed
FROM maven:3.8.4-openjdk-17 AS build
WORKDIR /app

# Copy the Maven configuration files and build the application
COPY pom.xml .
COPY src src
RUN mvn clean package -DskipTests

# Create a lightweight container for the application
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copy the built JAR file from the build stage
COPY --from=build /app/target/mybinge-0.0.1-SNAPSHOT.jar app.jar

# Expose the port your application runs on
EXPOSE 8080

# Define the command to run your application
CMD ["java", "-jar", "app.jar"]

