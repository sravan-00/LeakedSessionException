
### Steps to execute this application 

1.  Create Table in Spanner  example ```CREATE TABLE Singers (
    Id   STRING(1024) NOT NULL,
    Name  STRING(1024),
    ) PRIMARY KEY(Id); ```
2. Add GCP Project id, Spanner instance ID and Database name in `src/main/resources/application.properties`
3. Execute `./gradlew boottRun` or other tasks to execute the application
4. Application has GET method path to test `http://localhost:8083/api/singer/one`

