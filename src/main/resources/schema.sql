DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS global_seq;

CREATE SEQUENCE GLOBAL_SEQ START WITH 1000;

CREATE TABLE users
(
    id       INTEGER default GLOBAL_SEQ.nextval primary key,
    name     VARCHAR              NOT NULL,
    email    VARCHAR              NOT NULL,
    password VARCHAR              NOT NULL,
    enabled  BOOL    DEFAULT TRUE NOT NULL
);

CREATE TABLE USER_ROLE
(
    user_id INTEGER      NOT NULL,
    role    VARCHAR(255) NOT NULL,
    CONSTRAINT user_roles_idx UNIQUE (user_id, role),
    FOREIGN KEY (user_id) REFERENCES USERS (id) ON DELETE CASCADE
);

CREATE TABLE dish
(
    id    INTEGER default GLOBAL_SEQ.nextval primary key,
    title VARCHAR(255) NOT NULL,
--     //ToDo select data type for price
    price double       NOT NULL
);

CREATE TABLE restaurant
(
    id      INTEGER default GLOBAL_SEQ.nextval primary key,
    name    VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

-- Menu
-- ---------------------------
-- id | date | restaraunt_id |
CREATE TABLE menu
(
    id            INTEGER default GLOBAL_SEQ.nextval primary key,
    date          date    NOT NULL,
    restaurant_id INTEGER NOT NULL,
    FOREIGN KEY (restaurant_id) REFERENCES restaurant (id) ON DELETE CASCADE
);

-- Voice
-- -------------------------------
-- id | date | user_id | menu_id |
CREATE TABLE voice
(
    id       INTEGER default GLOBAL_SEQ.nextval primary key,
    dateTime TIMESTAMP NOT NULL,
    user_id  INTEGER   NOT NULL,
    menu_id  INTEGER   NOT NULL,
    FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE,
    FOREIGN KEY (menu_id) REFERENCES menu (id) ON DELETE CASCADE
);

-- Menu_Dish
-- -----------------
-- id_menu | id_dish