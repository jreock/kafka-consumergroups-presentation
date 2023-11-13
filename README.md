# Kafka Consumer Groups Demo
Companion code to Streaming Data at Scale with Kafka Consumer Groups presentation.

## Slides
The [slides](slides/Streaming-Data-at-Scale-with-Kafka-Consumer-Groups.pdf) can be found in PDF and PPTX (PowerPoint) format in the "slides" directory of the program root

## Instructions

### Initialize Kafka Cluster
```docker-compose -f kafka-cluster.yaml up -d```

### Ensure all containers are up
```docker ps```

### Check application.properties
```
spring:
  kafka:
    bootstrap-servers: "localhost:9091,localhost:9092,localhost:9093,localhost:9094,localhost:9095" 
```
### Execute with Spring Boot
```./gradlew :bootRun --info```
### Uncomment Code
Follow comments in org.kafkademos.kafkapresentation.KafkaPresentationApplication to create various demo scenarios

