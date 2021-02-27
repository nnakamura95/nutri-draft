# nutri

### Run PostgreSQL with Docker
```
cd docker/nutri-db
docker-compose up
```

### Database name
```
nutri
```
- Port: 5432
- Super User
  > User: postgres  
  Password: postgres
- App User
  > User: nutri  
  Password: nutri

### Initialize database • Flyway Migration
```
./gradlew flywayClean
./gradlew flywayMigrate
```

### Start vue client command
```
./gradlew nutri-client:jsServe
```

### Run API
```
./gradlew nutri-api:bootRun
```
