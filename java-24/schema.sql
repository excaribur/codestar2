

use company;

create table branch
(
    number int auto_increment unique not null,
    name varchar(200) unique not null,
    area float
);

insert into branch(name, area) values('Bang Yai', 48.5);
insert into branch(name, area) values('Rang Sit', 100);