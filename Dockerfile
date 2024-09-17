FROM maven:3.9.9-ibm-semeru-17-focal AS build
WORKDIR /home/maven/project
COPY pom.xml .
COPY src ./src
RUN mvn clean package spring-boot:repackage

FROM openjdk:17-jdk-slim
WORKDIR /app
COPY --from=build /home/maven/project/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]