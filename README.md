## Running PostgreSQL with Docker

Use the following command to start a PostgreSQL container for local development:

```bash
docker run --name jpa-liquibase-practise -p 5432:5432 -e POSTGRES_DB=jpa-practice -e POSTGRES_USER=user -e POSTGRES_PASSWORD=mysecretpassword -d postgres
