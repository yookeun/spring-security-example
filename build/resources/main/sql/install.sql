CREATE DATABASE  testme;

use testme;


CREATE TABLE users
(
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(45) NOT NULL,
  enabled TINYINT NOT NULL DEFAULT 1,
  PRIMARY KEY(id),
  UNIQUE KEY(username)
);

CREATE TABLE user_roles
(
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  role VARCHAR(45) NOT NULL,
  PRIMARY KEY (id),
  UNIQUE KEY uni_username_role(role, username),
  KEY fk_username_idx(username),
  CONSTRAINT fk_username FOREIGN KEY(username) REFERENCES users (username)
);

INSERT INTO users(username, password, enabled) VALUES('kim','1111',true);
INSERT INTO users(username, password, enabled) VALUES('lee','2222',true);

INSERT INTO user_roles(username, role) VALUES('kim','ROLE_ADMIN');
INSERT INTO user_roles(username, role) VALUES('lee','ROLE_USER');
