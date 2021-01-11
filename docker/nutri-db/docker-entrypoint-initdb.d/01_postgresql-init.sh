export PGUSER="$POSTGRES_USER";export PGPASSWORD="$POSTGRES_PASSWORD";psql nutri_db << EOF
  -- create user for readonly
  CREATE ROLE "nutri-readonly" LOGIN PASSWORD 'nutri-password';
  GRANT CONNECT ON DATABASE nutri_db TO "nutri-readonly";
  GRANT USAGE ON SCHEMA public TO "nutri-readonly";
  ALTER DEFAULT PRIVILEGES FOR USER "nutri" GRANT SELECT ON TABLES TO "nutri-readonly";
EOF
