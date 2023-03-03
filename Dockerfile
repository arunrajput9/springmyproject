FROM openjdk
RUN mkdir /app
WORKDIR /app
COPY target/Spring_project-0.0.1-SNAPSHOT.jar /app
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "Spring_project-0.0.1-SNAPSHOT.jar"]
