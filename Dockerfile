FROM openjdk:11
ARG JAR_FILE
EXPOSE 8881
COPY D:\workspace\springboot-project-1\target\springboot-project-1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]