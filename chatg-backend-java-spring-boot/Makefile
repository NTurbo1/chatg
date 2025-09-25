include make.config

# Default/local-dev values
export CHATG_POSTGRES_USER?=root
export CHATG_POSTGRES_PASSWORD?=root
export CHATG_POSTGRES_DB?=chatg_db
export CHATG_POSTGRES_DB_PORT?=8563
export CHATG_POSTGRES_DATA_CONTAINER_PATH?=/var/lib/postgresql/data

export CHATG_PGADMIN_EMAIL?=admin@admin.com
export CHATG_PGADMIN_PASSWORD?=admin
export CHATG_PGADMIN_PORT?=8342
export CHATG_PGADMIN_DATA_CONTAINER_PATH?=/var/lib/pgadmin

export CHATG_DATASOURCE_URL?=jdbc:postgresql://localhost:$(CHATG_POSTGRES_DB_PORT)/$(CHATG_POSTGRES_DB)

run:
	docker compose up -d
	mvn spring-boot:run

run-debug:
	docker compose up -d
	mvn spring-boot:run -Dspring-boot.run.arguments="--logging.level.io.github.nturbo1=DEBUG"