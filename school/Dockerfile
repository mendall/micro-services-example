# Use the official maven/Java 17 image to create a build artifact.
FROM maven:3.8.3-openjdk-17-slim AS BUILD
WORKDIR /build/
# Copy POM and source code to the container
COPY pom.xml .
COPY src ./src/
# Build the application
RUN mvn package -DskipTests

# Use OpenJDK 17 to run your application
FROM openjdk:17-jdk-slim
# Specify the port
EXPOSE 8070
# Copy JAR file from the builder stage
COPY --from=BUILD /build/target/*.jar app.jar
# Start the application
CMD ["java", "-jar", "app.jar"]