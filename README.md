# Getting Started

## Java Anwendung
- `shop.App` aus IDE heraus starten

## Datenbank

- Postgres wird mit Docker Compose automatisch beim Start der Anwendung hochgefahren
- Port ändert sich, da von Spring Boot vergeben

## Observability

docker run -d --name jaeger -e COLLECTOR_OTLP_ENABLED=true -p 16686:16686 -p 4317:4317 -p 4318:4318 jaegertracing/all-in-one:latest

