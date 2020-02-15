# VS-PROJECT-FINAL

## Before Setup
* setup project sdk Java 11
* 4GB RAM Einstellung in Docker unter Preferences/Advanced

## Check
* Alisons:demo alison$ ./mvnw clean package

## Build images and check
* Alisons:demo alison$ cd ../docker 
* Alisons:docker alison$ docker-compose build
* Alisons:docker alison$ docker images

## Build and view Container
* Alisons:docker alison$ docker-compose up -d
* Alisons:docker alison$ docker ps

## Access 
* Silvester Events-Project, durch Zuul : http://localhost:8080/
* Eureka: http://localhost:8761/

## Explanatory note
* If WhiteLabel error occurs, refresh the page and wait a few seconds

## Idea
* You can put your name on the guestlist for the Silvester event when you click on microservice event
* You can view different events listed on the microservice event
* You can order a ticket for the event when you click on microservice order
* You get feedback wether the action was sucessfull or not


Isabel Kaupp, Leonie Dannemann, Alison Trettin
