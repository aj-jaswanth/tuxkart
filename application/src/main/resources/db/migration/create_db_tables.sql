create table CUSTOMER(
    ID int not null ,
    NAME varchar(100) not null,
    EMAIL varchar(50) not null UNIQUE ,
    PRIMARY KEY (ID )
);

create table PRODUCT(
ID int not null AUTO_INCREMENT,
NAME VARCHAR(100) not null,
COST FLOAT not null,
BRAND_ID INT
);

create table BRAND(
ID int not null,
NAME VARCHAR(100) not null,
);

create table INVENTORY(
PRODUCT_ID int not null,
STOCK int not NULL
);

create table TRANSACTION(
TXN_ID int not null AUTO_INCREMENT,
USER_ID int not null,
PRODUCT_ID int not null,
TXN_KEY VARCHAR(100)

)


