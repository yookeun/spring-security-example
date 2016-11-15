CREATE DATABASE  TEST_DB;

use TEST_DB;


CREATE TABLE test_user
(
  id INT NOT NULL AUTO_INCREMENT,
  username VARCHAR(45) NOT NULL,
  password VARCHAR(70) NOT NULL,
  isadmin CHAR(1) NOT NULL DEFAULT 'N',
  PRIMARY KEY(id),
  UNIQUE KEY(username)
);

INSERT INTO test_user (username, password, isadmin) VALUES('admin', 'admin', 'Y');
INSERT INTO test_user (username, password, isadmin) VALUES('test', 'test', 'N');