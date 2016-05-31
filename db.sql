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
img_id1 bigint(20) unsigned not null,
img_id2 bigint(20) unsigned not null,
img_id3 bigint(20) unsigned not null
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


