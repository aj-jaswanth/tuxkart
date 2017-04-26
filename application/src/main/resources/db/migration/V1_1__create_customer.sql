create table CUSTOMER(
    ID int not null ,
    NAME varchar(100) not null,
    EMAIL varchar(50) not null UNIQUE,
    PRIMARY KEY (ID)
);
