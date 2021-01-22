use dbms;
create table Employee1(eid  int primary key,name varchar(20),SALARY bigint,PHONE bigint,	EMAIL varchar(30));
insert  into Employee1 values('50014', 'virat', '55000', '6243637666', 'v@yahoo.com'); 
insert  into Employee1 values('50015', 'laya', '60000',  '6328290767', 'pooja@tcs.com');
insert  into Employee1 values( '50016', 'pooja', '65000', '6412943868', 'ab@gmail.com');
insert  into Employee1 values( '50017', 'anil', '70000','6497596969', 'anil@gmail.com');
insert  into Employee1 values('50018', 'sunil', '75000', '6582250070', 'sunil@gmail.com');


# first i am created table and inserted into table and by select statement i am executing it
select * from Employee1;

# i am deleting one emplyee using id
delete from Employee1 where eid =50014;


select * from Employee1;

#adding columns using altertable

Alter table Employee1 add age int;
Alter table Employee1 add dob date;
Alter table Employee1 add  designation  varchar(20);
select * from Employee1;

#updating details using update statement
update Employee1 set age="24",dob='1998-01-12',designation="CC" where eid="50015";
update Employee1 set age="25",dob='1997-07-18',designation="Prof." where eid="50016";
update Employee1 set age="26",dob='1996-05-23',designation="Ass.Prof" where eid="50017";
update Employee1 set age="27",dob='1995-04-19',designation="CC" where eid="50018";

select * from Employee1;

# finally dropping the table
drop table Employee1;










