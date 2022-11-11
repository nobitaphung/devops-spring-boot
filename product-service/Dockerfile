#FROM adoptopenjdk/openjdk11:alpine-jre
FROM openjdk:17 as build

ARG APP_NAME="product-service"
ARG APP_VERSION="0.0.1"
ARG JAR_FILE="/build/libs/${APP_NAME}-${APP_VERSION}.jar"

COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar", "app.jar"]
