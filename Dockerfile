# Use an official Gradle image to build the application
FROM gradle:7.5.0-jdk11 AS build

# Set the working directory
WORKDIR /home/gradle/project

# Copy only the necessary files to cache dependencies
COPY build.gradle.kts settings.gradle.kts /home/gradle/project/

# Download dependencies
RUN gradle build -x test --no-daemon || return 0

# Copy the entire project
COPY . /home/gradle/project

# Build the application
RUN gradle build -x test --no-daemon

# Use an official OpenJDK image to run the application
FROM openjdk:11-jre-slim

# Set the working directory
WORKDIR /app

# Copy the built application from the build stage
COPY --from=build /home/gradle/project/build/libs/*.jar app.jar

# Expose the application port
EXPOSE 8080

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
