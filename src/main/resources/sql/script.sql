create database product_db;

create table product (
    id serial primary key,
    name varchar,
    description varchar
);

insert into product (id, name, description) values (1, 'mercedes', 'car');
insert into product (id, name, description) values (2, 'boeing747', 'plane');
insert into product (id, name, description) values (3, 'Admiral Kuznetsov', 'war ship');
insert into product (id, name, description) values (4, 'SpaceX', 'private company');
insert into product (id, name, description) values (5, 'Rolex', 'clock');
insert into product (id, name, description) values (6, 'Facebook', 'social net');

