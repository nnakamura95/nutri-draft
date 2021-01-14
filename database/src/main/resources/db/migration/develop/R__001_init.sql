TRUNCATE client.client CASCADE;

INSERT INTO client.client(id, client_number, "name", email, health_condition) VALUES
(1, '55ba2780102749ad85e192cd47433e82','test1', 'test1@gmail.com', 'test1 is very healthy')
,(2, '90455fccd1f745a8b7efeb470f0a1dee','test2', 'test2@outlook.com', 'test2 is on treatment')
,(3, '10c61a7fc16a4c55b706a68fe90000d1','test3', 'test3@hotmail.com', 'test3 needs immediate consultation');

SELECT SETVAL('client.client_id_seq',(SELECT MAX(id) FROM client.client));

