# Getting Started

## Java Anwendung
- Klasse `shop.App` aus IDE heraus starten
- Postgres und Jaeger starten automatisch mit
- Beispiel HTTP Request aus requests.http ausführen

## Datenbank

- Postgres wird mit Docker Compose automatisch beim Start der Anwendung hochgefahren (siehe compose.yml)
- Port ändert sich, da von Spring Boot vergeben
- siehe https://spring.io/blog/2023/06/21/docker-compose-support-in-spring-boot-3-1

## Observability

- Jaeger wird mit Docker Compose automatisch beim Start der Anwendung hochgefahren (siehe compose.yml)
- alternativ: docker run -d --name jaeger -e COLLECTOR_OTLP_ENABLED=true -p 16686:16686 -p 4317:4317 -p 4318:4318 jaegertracing/all-in-one:latest
- Weboberfläche: http://localhost:16686/
