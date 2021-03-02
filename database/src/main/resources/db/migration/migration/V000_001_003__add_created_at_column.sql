ALTER TABLE client.data
    ADD COLUMN created_at timestamp without time zone DEFAULT now() NOT NULL;
