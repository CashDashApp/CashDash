SET FOREIGN_KEY_CHECKS=0;

--Table customers
DROP TABLE IF EXISTS customers;
CREATE TABLE customers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    phone VARCHAR(50),
);

--Table orders
DROP TABLE IF EXISTS orders;
CREATE TABLE orders (
    id INT AUTO_INCREMENT PRIMARY KEY,
    product_id INT NOT NULL,
    count TINYINT NOT NULL,
    FOREIGN KEY(product_id) REFERENCES product(id),
);

-- Table: users --
DROP TABLE IF EXISTS users;

CREATE TABLE users (
    id INT AUTO_INCREMENT PRIMARY KEY,
    fullname VARCHAR(50) NOT NULL,
    username VARCHAR(20) NOT NULL UNIQUE,
    password VARCHAR(70) NOT NULL,
    is_admin TINYINT DEFAULT 0
);

-- Table: category

DROP TABLE IF EXISTS category;

CREATE TABLE category (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NULL
);

-- Table products

DROP TABLE IF EXISTS products;

CREATE TABLE products (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    stock INT DEFAULT 0,
    category_id INT NOT NULL,
    description VARCHAR(256),
    price DOUBLE DEFAULT 0.0,
    FOREIGN KEY(category_id) REFERENCES category(id)
);

-- Table equipments
DROP TABLE IF EXISTS equipments;
CREATE TABLE equipments (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    stock INT DEFAULT 0,
    description VARCHAR(256),
    price DOUBLE DEFAULT 0.0
);

-- Table: transactions
DROP TABLE IF EXISTS transactions;
CREATE TABLE transactions (
    id INT AUTO_INCREMENT PRIMARY KEY,
    user_id INT NOT NULL,
    order_id INT NOT NULL,
    customer_id INT NOT NULL,
    FOREIGN KEY(user_id) REFERENCES users(id),
    FOREIGN KEY(order_id) REFERENCES orders(id),
    FOREIGN KEY(customer_id) REFERENCES customers(id),
    date DATETIME DEFAULT CURRENT_TIMESTAMP,
    status boolean DEFAULT 0
);

INSERT INTO users VALUES (NULL, "Testing User 1", "testing1", "$2y$10$s8/nry7bNBVCPz55ZGOAmeF.DvNetXflWFOUiA7W/FvWpdw/Bic6.", 0);
INSERT INTO users VALUES (NULL, "Testing User 2", "testing2", "$2y$10$s8/nry7bNBVCPz55ZGOAmeF.DvNetXflWFOUiA7W/FvWpdw/Bic6.", 0);
INSERT INTO users VALUES (NULL, "Testing Admin", "testing3", "$2y$10$s8/nry7bNBVCPz55ZGOAmeF.DvNetXflWFOUiA7W/FvWpdw/Bic6.", 1);

INSERT INTO category VALUES (NULL, "Barang");
INSERT INTO category VALUES (NULL, "Makanan");
INSERT INTO category VALUES (NULL, "Minuman");

INSERT INTO products VALUES (NULL, "Meja", 4, (SELECT id FROM category WHERE name = "Barang"), "Meja kayu jati", 500000.0);
INSERT INTO products VALUES (NULL, "Kursi", 5, (SELECT id FROM category WHERE name = "Barang"), "Kursi kayu jati", 400000.0);
INSERT INTO products VALUES (NULL, "Milo", 4, (SELECT id FROM category WHERE name = "Minuman"), "Milo coklat", 10000.0);
INSERT INTO products VALUES (NULL, "Susu", 4, (SELECT id FROM category WHERE name = "Minuman"), "Susu coklat", 12000.0);
INSERT INTO products VALUES (NULL, "Tango", 4, (SELECT id FROM category WHERE name = "Makanan"), "Wafer", 12000.0);
