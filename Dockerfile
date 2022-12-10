FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY ./target/year.jar year.jar
ENTRYPOINT ["java","-jar","/year.jar","&"]