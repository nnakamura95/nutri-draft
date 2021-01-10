DROP SCHEMA IF EXISTS client CASCADE;

CREATE SCHEMA client;

SET search_path TO client;

CREATE TABLE client (
                         id       int primary key,
                         client_number varchar UNIQUE NOT NULL,
                         name     varchar,
                         email    varchar,
                         health_condition varchar,
                         created_at timestamp without time zone DEFAULT now() NOT NULL
);

CREATE SEQUENCE client_id_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;
