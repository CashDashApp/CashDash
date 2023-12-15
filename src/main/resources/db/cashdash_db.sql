SET FOREIGN_KEY_CHECKS=0;

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
--    image_url VARCHAR(256),
    price DOUBLE DEFAULT 0.0,
    FOREIGN KEY(category_id) REFERENCES category(id)
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
