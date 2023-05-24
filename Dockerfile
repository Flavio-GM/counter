FROM eclipse-temurin:17-jre-alpine

COPY target/*.jar counter.jar

EXPOSE 8080

ENTRYPOINT [ "java", "-jar", "counter.jar" ]

