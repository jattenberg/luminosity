FROM openjdk:8-alpine

COPY target/uberjar/luminosity.jar /luminosity/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/luminosity/app.jar"]
