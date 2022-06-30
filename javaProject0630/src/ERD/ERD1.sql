
/* Drop Tables */

DROP TABLE member0630 CASCADE CONSTRAINTS;
DROP TABLE product_0630 CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE member0630
(
	memberNo number(6) NOT NULL,
	userName varchar2(20),
	userPhone varchar2(13),
	addr varchar2(60),
	inDay date,
	grade char(1),
	city char(2),
	PRIMARY KEY (memberNo)
);


CREATE TABLE product_0630
(
	custno number(6) NOT NULL,
	salenol number(8),
	pcost number(8),
	amount number(4),
	price number(8),
	pcode varchar2(4),
	sdate date,
	PRIMARY KEY (custno)
);



