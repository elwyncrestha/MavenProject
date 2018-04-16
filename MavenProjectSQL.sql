show databases;

use hibernatedemo;

show tables;
drop table course_tbl;
drop table hibernate_sequence;

select * from course_tbl;

show fields from course_tbl;

insert into course_tbl(cId,CDuration,cPrice,cTitle) values(2,"4 months",2500,"Ruby");

show databases;
use imsdb;

show tables;
select * from subscription_table;


use hibernatedemo;
show tables;

create database springDB;
drop database springdb;
use springDB;
show tables;
show databases;
select * from course_tbl;

show databases;
use springdb;
show tables;
select * from course_tbl;
select * from student_tbl;
select * from subscription_tbl;

show tables;
show fields from users_login;
desc users_login;
desc user_role;
insert into users_login(id,active,password,username) values(1,1,'admin','admin'),(2,0,'user','user');
insert into user_role(id,authority,uId) values(1,'ROLE_ADMIN',1),(2,'ROLE_ADMIN',2);