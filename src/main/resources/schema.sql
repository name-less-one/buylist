create table if not exists buy_list (
     id int PRIMARY KEY AUTO_INCREMENT
    ,user_id varchar(8) not null
    ,category varchar(8) not null
    ,item_name varchar(256) not null
    ,quantity int not null
    ,isBuyed boolean not null
    ,registered_date datetime not null
    ,created_at datetime not null
    ,updated_at datetime not null
);