# nutri

### Start vue client command
```
./gradlew nutri-client:jsServe
```

### Run API
```
./gradlew nutri-api:bootRun
```
### Run PostgreSQL with Docker
```
cd docker/nutri-db
docker-compose up
```
- Port: 55432
- Super User
  > User: postgres  
  Password: postgres
- App User
  > User: nutri  
  Password: nutri-password

### Initialize database • Flyway Migration
```shell
./gradlew flywayClean
./gradlew flywayMigrate
```
