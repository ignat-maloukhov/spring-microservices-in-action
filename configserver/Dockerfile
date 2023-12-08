FROM openjdk:17-jdk-slim
MAINTAINER Ignat Maloukhov
COPY target/configserver-0.0.1-SNAPSHOT.jar configserver.jar
ENTRYPOINT ["java","-jar","/configserver.jar"]