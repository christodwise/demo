FROM openjdk:11-jre-slim
WORKDIR /app
ADD ./target/demo-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java","-jar","/app/demo-0.0.1-SNAPSHOT.jar"]  
