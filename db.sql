create table t_file(
 id serial primary key,
name varchar(300),
type int,
intro text,
img_src varchar(300)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_menu(
id serial primary key,
name varchar(300),
type int,
img_id bigint(20) unsigned not null,
foreign key(img_id) references t_file(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_recruit(
id serial primary key,
name varchar(300),
address varchar(500),
intro text,
other text,
publish_date date,
state int
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_news(
id serial primary key,
name varchar(300),
intro text,
publish_date date,
type int,
img_id1 bigint(20) unsigned,
img_id2 bigint(20) unsigned,
img_id3 bigint(20) unsigned,
img_id4 bigint(20) unsigned,
img_id5 bigint(20) unsigned,
img_id6 bigint(20) unsigned,
img_id7 bigint(20) unsigned
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_job_application(
id serial primary key,
name varchar(300),
sex int,
birth date,
education varchar(30),
address varchar(500),
tel varchar(30),
mail varchar(30),
file_id bigint(20) unsigned not null,
img_id bigint(20) unsigned not null,
foreign key(img_id) references t_file(id),
foreign key(file_id) references t_file(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_user(
id serial primary key,
user_name varchar(30),
password varchar(300),
application_id bigint(20) unsigned not null,
register_date date,
type int
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_user_application(
id serial primary key,
state int,-- 0所有,1未处理，2已处理
record text,
first_relation varchar(30),
first_cell_phone varchar(30),
first_work_phone varchar(30),
first_family_phone varchar(30),
second_relation varchar(30),
second_cell_phone varchar(30),
second_work_phone varchar(30),
second_family_phone varchar(30),
insurance_company varchar(300),
insurance_number varchar(300),
insurance_project varchar(300)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

create table t_token(
id serial primary key,
token varchar(300),
user_id bigint(20) unsigned not null,
login_date timestamp,
foreign key(user_id) references t_user(id)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

alter table t_menu add column time_type int
alter table t_job_application add column school varchar(300)
alter table t_job_application add column experience numeric(4,2)
alter table t_job_application add column applicated_date date 
insert into t_file( id,type) values(11,-1);--代表空文件
--t_file type 1-6主页6张图， 7 菜品， 8 新闻， 9 简历， 10 照片，11空文件
--t_news type 0主页 1 新闻，
insert into t_file(id,name,type,intro,img_src) values(1,'test1',1,'test','src');
insert into t_file(id,name,type,intro,img_src) values(2,'test2',2,'test','src');
insert into t_file(id,name,type,intro,img_src) values(3,'test3',3,'test','src');
insert into t_file(id,name,type,intro,img_src) values(4,'test4',4,'test','src');
insert into t_file(id,name,type,intro,img_src) values(5,'test5',5,'test','src');
insert into t_file(id,name,type,intro,img_src) values(6,'test6',6,'test','src');

insert into t_news(name,intro,publish_date ,type ,img_id1 ,img_id2 ,img_id3 ) values('主页','主页','2016-06-01',0,15,15,15);

insert into t_news(name,intro,publish_date ,type ,img_id1 ,img_id2 ,img_id3 ) values('主页','主页','2016-06-01',1,15,15,15);


select {n.*},{f1.*},{f2.*),{f3.*} 
  from (select * from t_news where type = 0) n
  