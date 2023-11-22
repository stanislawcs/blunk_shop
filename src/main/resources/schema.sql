create table if not exists users(
    id bigint generated by default as identity primary key,
    name varchar(255) not null,
    tg_username varchar(255) not null unique,
    password varchar(255) not null
);

create table if not exists roles(
    id bigint generated by default as identity primary key,
    name varchar(255) not null
);

create table users_roles(
    user_id bigint not null,
    role_id bigint not null,
    primary key (user_id,role_id),
    constraint fk_users_roles_users foreign key (user_id) references users(id) on delete cascade on update no action,
    constraint fk_users_roles_roles foreign key (role_id) references roles(id) on delete cascade on update no action
);

create table if not exists orders(
    id bigint generated by default as identity primary key,
    user_id bigint not null,
    constraint fk_orders_users foreign key (user_id) references users(id) on delete cascade on update no action
);


