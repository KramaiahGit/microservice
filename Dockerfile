FROM openjdk:11
EXPOSE 8881
add D:\workspace\springboot-project-1\target\springboot-project-1-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "/app.jar"]