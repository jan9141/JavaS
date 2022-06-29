
/* Drop Tables */

DROP TABLE contract CASCADE CONSTRAINTS;
DROP TABLE car CASCADE CONSTRAINTS;




/* Create Tables */

CREATE TABLE car
(
	car_no varchar2(7) NOT NULL,
	car_type varchar2(3) NOT NULL,
	car_last_check_date date,
	car_expire_date date,
	PRIMARY KEY (car_no)
);


CREATE TABLE contract
(
	contract_no number(10,0) NOT NULL,
	contract_car_no varchar2(7) NOT NULL,
	contract_customer_no number(10,0) NOT NULL,
	contract_start_office_no number(10,0) NOT NULL,
	contract_start_km number(10,0) NOT NULL,
	contract_end_office_no number(10,0),
	contract_end_km number(10,0),
	PRIMARY KEY (contract_no)
);



/* Create Foreign Keys */

ALTER TABLE contract
	ADD FOREIGN KEY (contract_car_no)
	REFERENCES car (car_no)
;



