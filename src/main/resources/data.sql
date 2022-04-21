Insert Into users (name, email, password)
values ('admin', 'admin@gmail.com', 'admin'),
       ('user', 'user@gmail.com', 'user'),
       ('guest', 'guest@gmail.com', 'guest');

Insert Into user_role (user_id, role)
values (1000, 'ADMIN'),
       (1001, 'USER'),
       (1002, 'USER');

Insert Into dish (title, price)
values ('яичница глазунья', 150.00),
('омлет', 200.00),
('кофе', 100.00);

Insert Into restaurant (name, address)
values ('Плакучая ива', 'Плакучая, 5'),
       ('Орущий карась', 'Люксембургская, 10'),
       ('Танцующий олень', 'Площадь ленина, 1');