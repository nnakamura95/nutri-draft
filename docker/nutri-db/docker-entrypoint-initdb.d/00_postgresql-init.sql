CREATE ROLE "nutri" LOGIN PASSWORD 'nutri-password';

CREATE DATABASE nutri_db
    OWNER "nutri"
    ENCODING 'UTF-8'
    LC_COLLATE 'ja_JP.UTF-8'
    LC_CTYPE 'ja_JP.UTF-8'
    TEMPLATE template0;
