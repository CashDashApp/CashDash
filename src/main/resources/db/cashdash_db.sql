
DROP DATABASE IF EXISTS cashdash;
CREATE DATABASE cashdash;

use cashdash;


-- Disable foreign key checks
SET
FOREIGN_KEY_CHECKS=0;
-- Table: category
DROP TABLE IF EXISTS category;
CREATE TABLE category
(
    id   INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NULL
);

-- Table products
DROP TABLE IF EXISTS products;
CREATE TABLE products
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(50) NOT NULL,
    stock       INT DEFAULT 0,
    category_id INT         NOT NULL,
    description VARCHAR(256),
    price DOUBLE DEFAULT 0.0,
    FOREIGN KEY (category_id) REFERENCES category (id)
);

-- Table orders
DROP TABLE IF EXISTS orders;
CREATE TABLE orders
(
    id         INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT     NOT NULL,
    count      TINYINT NOT NULL,
    FOREIGN KEY (product_id) REFERENCES products (id)
);

-- Table users
DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id       INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(50) NOT NULL,
    username VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(70) NOT NULL
);

-- Table transactions
DROP TABLE IF EXISTS transactions;
CREATE TABLE transactions
(
    id               VARCHAR(50) PRIMARY KEY,
    user_id          INT,
    transaction_date DATE,
    FOREIGN KEY (user_id) REFERENCES users (id)
);

-- Table orders
DROP TABLE IF EXISTS orders;
CREATE TABLE orders
(
    id             INT AUTO_INCREMENT PRIMARY KEY,
    transaction_id VARCHAR(50),
    product_id     INT,
    product_total  INT,
    FOREIGN KEY (transaction_id) REFERENCES transactions (id),
    FOREIGN KEY (product_id) REFERENCES products (id)
);

-- Table equipments
DROP TABLE IF EXISTS equipments;
CREATE TABLE equipments
(
    id          INT AUTO_INCREMENT PRIMARY KEY,
    name        VARCHAR(50) NOT NULL,
    stock       INT DEFAULT 0,
    condition VARCHAR(50),
    description VARCHAR(256)
);


-- Seeder for category table
INSERT INTO category (name)
VALUES ('Electronics'),
       ('Clothing'),
       ('Home and Garden'),
       ('Books'),
       ('Toys');

-- Seeder for products table
INSERT INTO products (name, stock, category_id, description, price)
VALUES ('Smartphone', 50, 1, 'Latest model with advanced features', 699.99),
       ('T-Shirt', 100, 2, 'Cotton, round neck, assorted colors', 19.99),
       ('Garden Chair', 30, 3, 'Comfortable outdoor chair', 49.99),
       ('Programming Book', 20, 4, 'Introduction to programming', 29.99),
       ('Toy Car', 50, 5, 'Remote-controlled car for kids', 39.99);

-- Seeder for users table
INSERT INTO users (id, fullname, username, password)
VALUES ('user1', 'John Doe', 'john_doe', 'hashed_password_1'),
       ('user2', 'Jane Smith', 'jane_smith', 'hashed_password_2'),
       ('user3', 'Bob Johnson', 'bob_johnson', 'hashed_password_3');

-- Seeder for transactions table
INSERT INTO transactions (id, user_id, transaction_date)
VALUES ('trans1', 1, '2024-01-04'),
       ('trans2', 2, '2024-01-04'),
       ('trans3', 3, '2024-01-04');

-- Seeder for orders table
INSERT INTO orders (transaction_id, product_id, product_total)
VALUES ('trans1', 1, 2),
       ('trans1', 3, 1),
       ('trans2', 2, 3),
       ('trans3', 4, 1),
       ('trans3', 5, 2);

-- Seeder for equipments table
INSERT INTO equipments (name, stock,condition, description)
VALUES ('Laptop', 1,'Good', 'High-performance laptop'),
       ('Printer Thermal', 3,'New' ,'Printer Thermal'),
       ('Coffee Maker', 4, 'Not Good','Automatic coffee maker'),


-- Enable foreign key checks after seeding
SET
FOREIGN_KEY_CHECKS=1;
