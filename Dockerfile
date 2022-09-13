FROM openjdk:11
EXPOSE 9898
ADD target/docker-jenkins-example.jar docker-jenkins-example.jar
ENTRYPOINT ["java", "-jar", "/docker-jenkins-example.jar"]