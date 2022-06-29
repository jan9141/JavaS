
/* Drop Tables */

DROP TABLE member1 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE member1
(
	no number(6) NOT NULL,
	name varchar2(20) NOT NULL,
	phone varchar2(13) NOT NULL,
	grade char(1) NOT NULL,
	city char(2) NOT NULL,
	PRIMARY KEY (no)
);



