insert into users(name,tg_username,password) values('Stanislaw','stanislawcs','$2a$10$7KX1blLnfvO32cT19LtFvenr15okiAh.1n1vpYWQ2xYU.eY.Viw7y'),
                                                    ('Artem','ser.funy','$2a$10$NLsPn8MjBkmL0xJUz2VK7ezkM0AIzX9sYO9QeQDRx7emb/513kjjC');

insert into roles(name) values ('ROLE_USER'),('ROLE_ADMIN');

insert into users_roles values(1,1);
insert into users_roles values(1,2);
insert into users_roles values(2,1);

insert into orders(user_id) values(1);
insert into orders(user_id) values(1);
insert into orders (user_id) values(2);