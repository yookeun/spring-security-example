CREATE DATABASE  TEST_DB;

use TEST_DB;


CREATE TABLE test_user
(
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(70) NOT NULL,
  is_admin CHAR(1) NOT NULL DEFAULT 'N',
  PRIMARY KEY(id),
  UNIQUE KEY(username)
);

INSERT INTO test_user (username, password, is_admin) VALUES('admin', 'admin', 'Y');
INSERT INTO test_user (username, password, is_admin) VALUES('test', 'test', 'N');