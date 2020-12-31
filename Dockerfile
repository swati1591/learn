FROM openjdk:11
ADD build/libs/learn-0.0.1-SNAPSHOT.jar learn.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "learn.jar"]