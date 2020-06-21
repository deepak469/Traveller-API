FROM openjdk:8
ADD target/traveller-0.0.1-SNAPSHOT.jar traveller-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "traveller-0.0.1-SNAPSHOT.jar"]