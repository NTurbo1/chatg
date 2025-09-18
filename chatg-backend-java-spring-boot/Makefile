include make.config

# Default/local-dev values
export CHATG_POSTGRES_USER?=root
export CHATG_POSTGRES_PASSWORD?=root
export CHATG_POSTGRES_DB?=chatg_db
export CHATG_POSTGRES_DB_PORT?=5432
export CHATG_POSTGRES_DATA_CONTAINER_PATH?=/var/lib/postgresql/data

run:
	docker compose up -d
	mvn spring-boot:run