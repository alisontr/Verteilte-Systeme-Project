# VS-PROJECT-FINAL

## BEFORE SETUP
-setup project sdk Java 11
-4GB RAM Einstellung in Docker unter Preferences/Advanced

##CHECK IF RUNNING
Alisons:demo alison$ ./mvnw clean package

## BUILD IMAGES AND CHECK
Alisons:demo alison$ cd ../docker
Alisons:docker alison$ docker-compose build
Alisons:docker alison$ docker images

## BUILD AND VIEW CONTAINER
Alisons:docker alison$ docker-compose up -d
Alisons:docker alison$ docker ps

##ACCESS
Silvester Events - Anwendung , durch Zuul : http://localhost:8080/
Eureka: http://localhost:8761/
