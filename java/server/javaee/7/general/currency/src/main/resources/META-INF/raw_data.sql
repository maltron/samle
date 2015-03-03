create database if not exists general character set utf8 collate utf8_unicode_ci; 
#create table if not exists CURRENCY(CURRENCY bigint not null auto_increment, FIRST_NAME varchar(30) not null, LAST_NAME varchar(30) not null, STATUS BOOLEAN default 0, unique(FIRST_NAME, LAST_NAME), primary key(PERSON_ID)) Engine=InnoDB charset=utf8 collate=utf8_unicode_ci;
#insert into TABLE_PERSON(FIRST_NAME, LAST_NAME) values('Mauricio','Leal');
#insert into TABLE_PERSON(FIRST_NAME, LAST_NAME) values('Nadia','Ulanova');
#insert into TABLE_PERSON(FIRST_NAME, LAST_NAME) values('Nichole','Leal');