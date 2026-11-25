# Architektura
terminal (React Native + SQLite) --REST/LAN--> serwer pokładowy (Spring Boot + PostgreSQL) --REST--> centrala (Spring Boot + PostgreSQL)

## Decyzje do uzupełnienia
- HTTP czy HTTPS w sieci LAN
- Synchronizacja pokład → centrala (UUID, retry, idempotentność)
- Jak terminal zna adres serwera pokładowego (ustawienia / wykrywanie)
- Gdzie leżą filmy i gry (pliki na serwerze pokładowym)