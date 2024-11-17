FROM openjdk:17-jdk-slim

WORKDIR /app

# Copier le fichier .jar généré
COPY build/libs/*.jar app.jar

# Exposer le port
EXPOSE 8080

# Commande pour exécuter l'application
CMD ["java", "-jar", "app.jar"]
