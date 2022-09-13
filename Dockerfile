FROM openjdk:11
LABEL maintainer="salma"
ADD target/cindh_project-0.0.1-SNAPSHOT.jar cindh-app.jar
ENTRYPOINT ["java","-jar","cindh-app.jar"]
