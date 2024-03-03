FROM openjdk:17

WORKDIR /app

COPY gRPC_server-0.0.1-SNAPSHOT.jar /app/gRPC_server-0.0.1-SNAPSHOT.jar

EXPOSE 8080 6565

CMD ["java", "-jar", "/app/gRPC_server-0.0.1-SNAPSHOT.jar"]