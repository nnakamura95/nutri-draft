DROP SCHEMA IF EXISTS client CASCADE;

CREATE SCHEMA client;

SET search_path TO client;

CREATE TABLE data (
                         id       int primary key,
                         client_number varchar UNIQUE NOT NULL,
                         name     varchar,
                         email    varchar,
                         health_condition varchar
);

CREATE SEQUENCE client_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
