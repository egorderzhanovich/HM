CREATE SCHEMA IF NOT EXISTS test;
USE test;

DROP TABLE IF EXISTS employees;
CREATE TABLE employees(id BIGINT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(100),surname VARCHAR(100),job_position VARCHAR(100));

INSERT INTO employees(name, surname, job_position) VALUES ('Andrei','Zaharenko','therapist');
INSERT INTO employees(name, surname, job_position) VALUES ('Kristina','Stechko','therapist');
INSERT INTO employees(name, surname, job_position) VALUES ('Nika','Zarinskaya','therapist');
INSERT INTO employees(name, surname, job_position) VALUES ('Alexey','Kornilov','therapist');
INSERT INTO employees(name, surname, job_position) VALUES ('Sergey','Nesterenok','therapist');