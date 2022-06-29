
/* Drop Tables */

DROP TABLE Member CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE Member
(
	userId char(25) NOT NULL,
	userPw char(25) NOT NULL,
	userAge number(10,0) NOT NULL,
	userName char(25) NOT NULL,
	PRIMARY KEY (userId)
);



