FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} simple-docker-example.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar","simple-docker-example.jar"]