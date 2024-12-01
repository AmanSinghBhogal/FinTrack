-- Creating a database:
CREATE DATABASE IF NOT EXISTS FinTrack_Dev;

-- Using this newly created database:
USE FinTrack_Dev;

-- Creating User Table:
CREATE TABLE IF NOT EXISTS USERS (
	uid VARCHAR(36) PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    password VARCHAR(256) NOT NULL,
    age INT(2) NOT NULL,
    gender ENUM('M', 'F') NOT NULL,
    wallet DOUBLE,
    email VARCHAR(50) NOT NULL,
    mob VARCHAR(14) NOT NULL,
    cur VARCHAR(10) DEFAULT 'INR'
);

-- Creating Budget Allocation Table:
CREATE TABLE IF NOT EXISTS BUDGET_ALLOC (
    bid VARCHAR(36) PRIMARY KEY,
	uid VARCHAR(36) ,
    year INT(4) NOT NULL,
    month ENUM('Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'),
	rent DOUBLE,
    water DOUBLE,
    electricity DOUBLE,
    travel DOUBLE,
    entertainment DOUBLE,
    medical DOUBLE,
    debt DOUBLE,
    food DOUBLE,
    savings DOUBLE,
    investment DOUBLE,
    mob_internet DOUBLE,
    shopping DOUBLE,
    income DOUBLE,
    FOREIGN KEY (uid) REFERENCES USERS(uid)
);

-- Creating Expense Table:
CREATE TABLE IF NOT EXISTS Expense (
    eid VARCHAR(36) PRIMARY KEY,
	uid varchar(36),
    date DATE NOT NULL,
	dineout DOUBLE,
    vegetable DOUBLE,
    dairy DOUBLE,
    fruits DOUBLE,
    meat DOUBLE,
    travel DOUBLE,
    personal DOUBLE,
    entertainment DOUBLE,
    cloths DOUBLE,
    furniture DOUBLE,
    electronics DOUBLE,
    grooming DOUBLE,
    other DOUBLE,
    FOREIGN KEY (uid) REFERENCES USERS(uid)
);

-- Creating Expenses_desc Table:
CREATE TABLE IF NOT EXISTS Expenses_desc (
    edid VARCHAR(36) PRIMARY KEY,
	uid VARCHAR(36),
    date DATE,
    dineout_desc VARCHAR(500),
    vegetable_desc VARCHAR(500),
    dairy_desc VARCHAR(500),
    fruits_desc VARCHAR(500),
    meat_desc VARCHAR(500),
    travel_desc VARCHAR(500),
    personal_desc VARCHAR(500),
    entertainment_desc VARCHAR(500),
    cloths_desc VARCHAR(500),
    furniture_desc VARCHAR(500),
    electronics_desc VARCHAR(500),
    grooming_desc VARCHAR(500),
    other_desc VARCHAR(500),
    FOREIGN KEY (uid) REFERENCES USERS(uid)
);

-- Creating Table Fixed_Charges:
CREATE TABLE IF NOT EXISTS Fixed_Charges (
    fid VARCHAR(36) PRIMARY KEY,
	uid VARCHAR(36),
    date DATE,
    rent DOUBLE,
    water DOUBLE,
    electricity DOUBLE,
    internet DOUBLE,
    investment DOUBLE,
    savings DOUBLE,
    debt DOUBLE,
    gas DOUBLE,
    FOREIGN KEY (uid) REFERENCES USERS(uid)
);

-- Creating Table Investment:
CREATE TABLE IF NOT EXISTS Investment (
    iid VARCHAR(36) PRIMARY KEY,
	uid VARCHAR(36),
    date DATE,
    name VARCHAR(250) NOT NULL,
    category ENUM('Real Estate', 'Gold', 'Digital Gold', 'Cryptocurrency', 'Bonds', 'Stocks', 'Funds'),
    description VARCHAR(500),
    FOREIGN KEY (uid) REFERENCES USERS(uid)
);