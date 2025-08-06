FROM openjdk:17;
COPY target/unit-test-0.0.1-SNAPSHOT app.jar
ENDPOINT ["java","-jar","app.jar"]