CREATE DATABASE exam2022;
CREATE USER user10 WITH ENCRYPTED PASSWORD '119';
GRANT ALL PRIVILEGES ON DATABASE exam2022 TO user10;

\c exam2022 user10

CREATE TABLE table7 (
    id SERIAL PRIMARY KEY,
    title10 VARCHAR(255),
    hight smallint
);
