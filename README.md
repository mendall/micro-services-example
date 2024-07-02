
"Microservices" has become a prominent term in contemporary software architecture. What specific challenges does it address?

Many organizations are undertaking technology migrations, and a primary hurdle is transitioning from monolithic applications to microservices-based architectures.

This microservices-example project illustrates how multiple services can function autonomously, leveraging optimal microservices patterns to achieve enhanced scalability, performance, and resilience.

### Use case

The example application includes two core services: School and Student, each with its own dedicated database. Access to these microservices is exclusively managed through the Gateway microservice. During startup, both services fetch their configurations from the config-server and register with the discovery service. Inter-service communication is facilitated via Kafka messages and HTTP requests. All logs are sent through Logstash to Elasticsearch, allowing for visualization in a Kibana dashboard.