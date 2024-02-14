# JavularBack
# CRUD Template using Angular, Java, hibernate, postgreSQL, docker
Front: https://github.com/ahsatal-pierre/javularFront

## docker-compose.yml
update environments with your password, username and db name

## intro
mvn clean package -DskipTests
docker compose build

## database
(if "docker volume inspect pgdata" gives error, try "docker volume create pgdata" before)
docker compose up -d java_db

## app 
docker compose up java_app

## check if all is running 
docker ps -a

## tests
In Postman try: 
- POST localhost:8080/api/users
body: 
{
    "name":"name",
    "email":"name@gmail.com"
}
- GET localhost:8080/api/users
- GET localhost:8080/api/users/1
- PUT localhost:8080/api/users/1
body: 
{
    "name":"another name"
}
- DELETE localhost:8080/api/users/1
