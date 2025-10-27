create table "employees" (
    id BIGINT not null,
    name varchar(50) not null,
    primary key (id)
);

create table departments (
    id BIGINT not null,
    title varchar(50) not null,
    primary key (id)
);