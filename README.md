![docker-version] ![postgre-version] ![java-version] ![springboot-version] [![linkedin-shield]][linkedin-url]

### Use case

The example application includes two core services: School and Student, each with its own dedicated database. Access to these microservices is exclusively managed through the Gateway microservice. During startup, both services fetch their configurations from the config-server and register with the discovery service. Inter-service communication is facilitated via Kafka messages and HTTP requests. All logs are sent through Logstash to Elasticsearch, allowing for visualization in a Kibana dashboard. Wave Scope integrated for additional visualization.

### Architecture

Below is the architectural diagram for microservices sample project.

![alt tag](https://github.com/mendall/micro-services-example/blob/main/documents/Architecture-diagram.jpg?raw=true)

### Technology

Microservices sample project uses a number of open source projects to work properly:

* [SpringBoot] - Application framework
* [Docker] - Containerization platform
* [Logstash] - Log collector
* [Elasticsearch] - Log indexer
* [Kibana] - Data visualization
* [Swagger] - API documentation
* [Kafka] - asynchronous microservices messaging.
* [PostgreSQL] - Database

### Tools

* [Java] - Programming
* [Maven] - Build
* [Git] - Version control
* [Docker] - Deployment

### Development

Below are the steps to bring up the development environment and get started.

1) Install Git, Java, Maven and Docker</br>
2) Clone the project using https://github.com/mendall/micro-services-example.git</br>
3) Build and run project with docker-compose up --build
4) Access the Application at http://localhost/</br></br>

### Services url

1) Student and School microservices available via Gateway - localhost:8222
2) Zookeeper - localhost:2181
3) Postgresql - localhost:5432
4) Pgadmin - localhost:5050
5) Kafka - localhost:9092
6) Discovery - localhost:8761
7) Wave-Scope - localhost:4040
8) Elasticsearch - localhost:9200
9) Logstash - localhost:5000
10) Kibana - localhost:5601

### API Endpoints

* POST localhost:8222/api/v1/schools: Create a new school
* GET localhost:8222/api/v1/schools: Retrieve all schools
* GET localhost:8222/api/v1/schools/with-students/{school-id}: Retrieve a school with its students by ID
* POST localhost:8222/api/v1/students: Create a new student
* GET localhost:8222/api/v1/students: Retrieve all students
* GET localhost:8222/api/v1/students/school/{school-id}: Retrieve all students by school ID

[//]: # (These are reference links used in the body of this note and get stripped out when the markdown processor does its job.)

[SpringBoot]: <https://projects.spring.io/spring-boot/>
[Docker]: <https://www.docker.com>
[Maven]: <https://maven.apache.org>
[Git]: <https://git-scm.com>
[Java]: <https://go.java>
[Logstash]: <https://www.elastic.co/products/logstash>
[Elasticsearch]: <https://www.elastic.co/products/elasticsearch>
[Kibana]: <https://www.elastic.co/products/kibana>
[Swagger]: <https://swagger.io/>
[Kafka]: <https://spring.io/projects/spring-kafka>
[PostgreSQL]: <https://www.postgresql.org/>

[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?colorB=blue&logo=linkedin
[linkedin-url]: https://www.linkedin.com/in/vladyslav-konovalov-451b6614a
[java-version]: https://img.shields.io/badge/java-17-yellow
[postgre-version]: https://img.shields.io/badge/postgresql-16.3-blue?logo=postgresql
[docker-version]: https://img.shields.io/badge/docker-26.1.1-blue?logo=docker
[springboot-version]: https://img.shields.io/badge/springboot-3.3.1-green?logo=springboot
