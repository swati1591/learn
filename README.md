# learn

Run application with: 

./gradlew bootRun

User postman to call the following REST API: localhost:8085/car

Add payload similar to:


{
    "id": 1,
    "make" : "volkswagen",
    "model": "passat",
    "year": "2015"
}

GET API: localhost:8085/cars

GET BY ID API: localhost:8085/car/1


For Kafka:
Run docker-compose up to get zookeeper and kafka broker up and running

Now, you can start the web app by running ./gradlew bootRun

Endpoint for producing Kafka message: 

http://localhost:8085/kafka/send?message=hello

You will see the message consumed by Kafka consumer in server logs
