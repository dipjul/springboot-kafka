# Kafka on Springboot Demo application

**Apache Kafka Setup**
- Download the binary & extract it
- Go inside the kafka folder
- Execute `.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties` on cmd prompt for zookeeper
- If you get some error related to input size then put the kafka folder in your C drive
- Execute `.\bin\windows\kafka-server-start.bat .\config\server.properties` on a different cmd prompt for kafka brokers
- Optional:
  - Execute `.\bin\windows\kafka-console-consumer.bat --topic sampleTopic --from-beginning --bootstrap-server localhost:9092` on a different cmd prompt for kafka consumer
  - Execute `.\bin\windows\kafka-console-consumer.bat --topic sampleJsonTopic --from-beginning --bootstrap-server localhost:9092` on a different cmd prompt for kafka consumer

**REST API**
- **GET** `localhost:8080/api/v1/kafka/message/publish`
  - *RequestParam*: message
  - Eg. `localhost:8080/api/v1/kafka/message/publish?message=hello%20world`
- **POST**  `localhost:8080/api/v1/kafka/jsonMessage/publish`
  - *RequestBody*: User
  - Eg.  `localhost:8080/api/v1/kafka/jsonMessage/publish`
    - Body: {
            "id" : 1,
            "firstName" : "deep",
            "lastName" : "rman"
            }
