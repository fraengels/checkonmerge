FROM openjdk:11-jdk-stretch
ARG APPLICATION_NAME="checkonmerge"

EXPOSE 8080
ARG JAR_FILE="/target/${APPLICATION_NAME}".jar
ADD $JAR_FILE checkonmerge.jar
ENTRYPOINT ["java", "-jar", "/checkonmerge.jar"]