# README #

### What is this repository for? ###
Demo app to show how to persist HTTP session in redis

### How do I get set up? ###

* Build with maven
mvn package

* Run the jar in **dev** mode
java  -Dspring.profiles.active=dev  -jar target/cirrus-up-cloud-demo-redis-session-1.0-SNAPSHOT.jar

### How to create a tunnel to your AWS ElastiCache Redis cluster ###
* [here](http://bit.ly/2Q8UCKx)

### Endpoint ###
* curl -X GET http://localhost:8080/get

