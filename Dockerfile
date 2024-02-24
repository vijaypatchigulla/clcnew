FROM openjdk:17-jdk-alpine
COPY target/ctcnew-0.0.1-SNAPSHOT.jar .
EXPOSE 8080
CMD ["java","-jar","ctcnew-0.0.1-SNAPSHOT.jar"]
