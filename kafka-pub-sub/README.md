Kafka Installation

Start zookeeper:
.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties
Look for "binding to port 0.0.0.0./0.0.0.0:2181"

Start Kafka:
.\bin\windows\kafka-server-start.bat .\config\server.properties


Send message to topic:
.\bin\windows\kafka-console-producer.bat --broker-list localhost:9092 --topic techforum-topic

Listen all messages:
.\bin\windows\kafka-console-consumer.bat --bootstrap-server localhost:9092 --topic techforum-topic --from-beginning