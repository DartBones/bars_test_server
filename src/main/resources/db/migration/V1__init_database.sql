create table documents (
   rec_id varchar(1024) primary key not null unique,
   number int not null unique,
   date timestamptz not null,
   update_date timestamptz null
);

insert into
    documents (rec_id, number, date, update_date)
values ('1q', 1, '2023-03-23 20:18:17', null),
       ('2q', 2, '2023-03-23 20:18:17', '2024-04-23 20:18:17'),
       ('3q', 3, '2023-03-23 20:18:17', now()),
       ('4q', 4, '2023-03-23 20:18:17', null),
       ('5q', 5, '2023-03-23 20:18:17', '2024-06-23 20:18:17'),
       ('6q', 6, '2023-03-23 20:18:17', null),
       ('7q', 7, '2023-03-23 20:18:17', now()),
       ('8q', 8, '2023-03-23 20:18:17', '2024-05-23 20:18:17');