create table invoices
(
	id integer not null,
   client varchar(255) not null,
   vatrate integer not null,
   invdate timestamp not null,
   primary key(id)
);   

create table lineitems
(
	id integer not null,
    quantity integer not null,
    description varchar(255) not null,
    unitprice bigint not null
); 