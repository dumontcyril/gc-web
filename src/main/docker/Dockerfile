FROM openjdk:8-jre-alpine

COPY *.jar /orsys/app.jar

ENV SERVER_PORT=8080

EXPOSE ${SERVER_PORT}

ENTRYPOINT ["java", "-jar", "/orsys/app.jar"]