# Vaquita

![](https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white)
![](https://img.shields.io/badge/PostgreSQL-316192?style=for-the-badge&logo=postgresql&logoColor=white)
![](https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white)
![](https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white)

Designed and implemented a event management system as a university project.

## Getting Started ✨
1. Clone the repository
```git
$ git clone https://github.com/thara003/vaquita.git
```

2. Open terminal inside the project directory

3. Make sure your connect to db either with the docker setup as mentioned below or with pgadmin and proceed further.

3. Install dependencies and start the server, by running the following command
```bash
$ ./mvnw spring-boot:run
``` 

## Connect to postgres db 👨‍🔧

- [Install pgAdmin4](https://www.pgadmin.org/download/)
- Config [application.properties](src/main/resources/application.properties) file with pgadmin4 credentials
- Run the pgadmin4 server

## Alternative method 👨‍🔧
 You can connect to the postgres db using the docker, which makes the development ease.

- [Install Docker engine](https://docs.docker.com/engine/install/) and run the docker engine 

- Make sure your inside the [docker directory](docker/), and build the postgres docker image, by running the following command
```bash
$ docker compose build
```

- Start docker postgres service
```bash
$ docker compose up -d
```
## Access the application 👩‍💻

In your browser open [localhost:8080/home](localhost:8080/home) you will be redirected to the home page.

## Bugs found 😪

There are some imperfections in the code , which will improved in the course of time⏳.

## License 🧾
This project is licensed under the [MIT Licensed](https://choosealicense.com/licenses/mit/).
