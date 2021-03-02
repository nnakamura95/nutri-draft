TRUNCATE client.data CASCADE;

INSERT INTO client.data(id, client_number, "name", email, health_condition, phone, date_of_birth, age, gender, address) VALUES
(1, '55ba2780102749ad85e192cd47433e82','test1', 'test1@gmail.com', 'test1 is very healthy', '415-897-4438', '1990-01-01', 31, 'male', '12345 Cherry Ave, Town, CA 20199')
,(2, '90455fccd1f745a8b7efeb470f0a1dee','test2', 'test2@outlook.com', 'test2 is on treatment', '571-097-0438', '1993-01-02', 28, 'other', '12342 Clara Dr, Town, VA 10199')
,(3, '10c61a7fc16a4c55b706a68fe90000d1','test3', 'test3@hotmail.com', 'test3 needs immediate consultation', '415-897-4438', '1995-03-01', 26, 'female', '12345 Cherry Ave, Town, CA 20199');

SELECT SETVAL('client.client_id_seq',(SELECT MAX(id) FROM client.data));

