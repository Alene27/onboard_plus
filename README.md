# Projekt inżynierski
Stack: Java 21 + Spring Boot 4, PostgreSQL, React Native (Android), SQLite.
Architektura: terminal ↔(REST/LAN) serwer pokładowy ↔(REST) centrala. Zob. docs/architecture.md

## Start lokalny
cp .env.example .env
docker compose up -d --build

Centrala: http://localhost:8080   Pokład 1: http://localhost:8082
Sprawdzenie: curl localhost:8080/actuator/health

## Git
- Domyślna gałąź: `dev`. Branche robocze: feat/..., fix/... → PR do `dev` (squash).
- Wydanie: PR `dev` → `main` (merge commit), potem tag vX.Y.Z.
- Zmiany w infra/ zatwierdza osoba odpowiedzialna za DevOps.
- Przed PR: `cd backend && ./mvnw verify` oraz `docker compose up --build`.

## Wersje
Java 21, Node z mobile/.nvmrc, JDK 17 do buildu Androida.
