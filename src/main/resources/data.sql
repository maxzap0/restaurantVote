DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

/*CREATE SEQUENCE global_seq start with 1000;*/

CREATE TABLE users
(
    //ToDo create Global sequens
    /*id               integer not null PRIMARY KEY default nextval('global_seq'),*/
    id         bigint auto_increment PRIMARY KEY,
    name       VARCHAR                 NOT NULL,
    email      VARCHAR                 NOT NULL,
    password   VARCHAR                 NOT NULL,
    registered TIMESTAMP DEFAULT now() NOT NULL,
    enabled    BOOL      DEFAULT TRUE  NOT NULL
);

CREATE TABLE user_roles
(
    user_id INTEGER      NOT NULL,
    role    VARCHAR(255) NOT NULL,
    CONSTRAINT user_roles_idx UNIQUE (user_id, role),
    FOREIGN KEY (user_id) REFERENCES USERS (id) ON DELETE CASCADE
);

CREATE TABLE dish
(
    id    INTEGER auto_increment PRIMARY KEY,
    title VARCHAR(255) NOT NULL,
    //ToDo select data type for price
    price double       NOT NULL,
);

CREATE TABLE restaurant
(
    id      INTEGER auto_increment PRIMARY KEY,
    name    VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

-- Voit
-- -------------------------------
-- id | date | user_id | menu_id |
CREATE TABLE voice
(
    id       INTEGER auto_increment PRIMARY KEY,
    dateTime TIMESTAMP NOT NULL,
    user_id  INTEGER   NOT NULL,
    menu_id  INTEGER   NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (menu_id) REFERENCES menu (id) ON DELETE CASCADE
);

-- Menu
-- ---------------------------
-- id | date | restaraunt_id |
CREATE TABLE menu
(
    id      INTEGER auto_increment PRIMARY KEY,
    date    date    NOT NULL,
    user_id INTEGER NOT NULL,
    menu_id INTEGER NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (menu_id) REFERENCES menu (id) ON DELETE CASCADE
);
-- Menu_Dish
-- -----------------
-- id_menu | id_dish