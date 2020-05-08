# Dockerfile
FROM openjdk:11.0.7-slim

# Add Maintainer Info
LABEL maintainer="niklas.wiken@gmail.com"

# Add a volume pointing to /tmp
VOLUME /tmp

WORKDIR /src/app

# Make port 8080 available to the world outside this container
EXPOSE 8080

# The application's jar file
COPY build/libs/*.jar /src/app/togglz.jar

# Run the jar file
ENTRYPOINT ["java","-jar","-Dspring.profiles.active=docker", "togglz.jar"]