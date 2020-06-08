
CREATE SCHEMA `Goal`;
USE `Goal`;
create table category (id bigint not null, name varchar(255), primary key (id));
create table expense (id bigint not null, description varchar(255), expensedate timestamp, location varchar(255), category_id bigint, user_id bigint, primary key (id));
create table user (id bigint not null, email varchar(255), name varchar(255), primary key (id));
ALTER TABLE `Goal`.`expense` 
ADD INDEX `foreign_user_idx` (`user_id` ASC) VISIBLE,
ADD INDEX `foreign_category_idx` (`category_id` ASC) VISIBLE;
ALTER TABLE `Goal`.`expense` 
ADD CONSTRAINT `userforeignkey`
  FOREIGN KEY (`user_id`)
  REFERENCES `Goal`.`user` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION,
ADD CONSTRAINT `categoryforeignkey`
  FOREIGN KEY (`category_id`)
  REFERENCES `Goal`.`category` (`id`)
  ON DELETE NO ACTION
  ON UPDATE NO ACTION;

insert into user values (1,'Siamak', 'Codeengine11@gmail.com');
insert into user values (2,'John', 'John@john.com');
insert into user values (3,'Adam', 'adam@adam.com');


insert into category values (1,'Travel');
insert into category values (2,'Auto Loan');
insert into category  values (3,'Food');
insert into category  values (4,'Donations');


insert into expense values (100,'New York Business Trip','2019-06-16','New York',1,1);
insert into expense values (101,'Ford Mustang Payment','2019-06-15','Los Angeles',2,2);
insert into expense values(102,'Grand Canyon Trip With Family','2019-06-15','Arizona',3,1);

ALTER TABLE `Goal`.`expense` 
CHANGE COLUMN `id` `id` BIGINT NOT NULL AUTO_INCREMENT ;