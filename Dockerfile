FROM openjdk:21
WORKDIR /app
COPY target/AikidoTracker.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]

# IVAN BUDANOV