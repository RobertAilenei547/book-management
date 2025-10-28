# Simple Dockerfile that runs the fat JAR produced by Maven
FROM eclipse-temurin:21-jre
ARG JAR_FILE=target/book-management-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} /app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
