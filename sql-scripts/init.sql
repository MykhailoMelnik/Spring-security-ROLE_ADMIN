create table persons
(
    id         bigserial primary key,
    first_name text not null,
    Last_name  text not null
);

ALTER TABLE persons
    ADD COLUMN email TEXT;
ALTER TABLE persons
    ADD COLUMN
        password TEXT;


CREATE TABLE roles
(
    id        BIGSERIAL PRIMARY KEY,
    name      TEXT,
    person_id BIGINT REFERENCES persons
);