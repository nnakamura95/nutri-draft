#!/bin/bash

set -e

psql -v ON_ERROR_STOP=1 --username "$POSTGRES_USER" --dbname "$POSTGRES_DB" <<-EOSQL
    CREATE DATABASE nutridatabse;
    GRANT ALL PRIVILEGES ON DATABASE nutridatabse TO nutri;
EOSQL
