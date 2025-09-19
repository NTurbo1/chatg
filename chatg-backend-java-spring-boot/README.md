# ChatG Backend

Provides backend services and api for the ChatG chatting system using Java and Spring Boot.

## Environment variables
| Name                                   | Description                                                            |
|----------------------------------------|------------------------------------------------------------------------|
| **CHATG_POSTGRES_USER**                | A database admin user                                                  |
| **CHATG_POSTGRES_PASSWORD**            | The password of the admin user                                         |
| **CHATG_POSTGRES_DB**                  | The database name                                                      |
| **CHATG_POSTGRES_DB_PORT**             | The database server port                                               |
| **CHATG_POSTGRES_DATA_CONTAINER_PATH** | Path to the database data storage location in the system's file system |
| **CHATG_PGADMIN_EMAIL**                | A PgAdmin login email                                                  |
| **CHATG_PGADMIN_PASSWORD**             | A PgAdmin login password                                               |
| **CHATG_PGADMIN_PORT**                 | The PgAdmin port in the host system                                    |
| **CHATG_PGADMIN_DATA_CONTAINER_PATH**  | The PgAdmin data storage location path in the container                |
| **CHATG_DATASOURCE_URL**               | A datasource url used for the db server connection                     |
