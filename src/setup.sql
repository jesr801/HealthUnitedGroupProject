DROP DATABASE IF EXISTS HealthUnited;
CREATE DATABASE HealthUnited;
DROP USER IF EXISTS 'healthunited_user'@'localhost';
CREATE USER 'healthunited_user'@'localhost'IDENTIFIED BY '123';
GRANT ALL ON HealthUnited. * TO 'healthunited_user'@'localhost';
USE HealthUnited;
CREATE TABLE employee_info(
  firstName varchar(30) NOT NULL,
  lastName varchar(30) NOT NULL,
  userName varchar(15) NOT NULL,
  jobTitle varchar(45) NOT NULL,
  employeePassword VARBINARY (15) NOT NULL,
  level int (1),
  PRIMARY KEY (userName,employeePassword)
);
CREATE TABLE patient_info(
  firstName varchar(30) NOT NULL,
  lastName varchar(30) NOT NULL,
  dateOfBirth DATETIME,
  phoneNumber varchar(11),
  socialSecurityNumber varchar(9) NOT NULL,
  PRIMARY KEY (firstName,lastName,socialSecurityNumber)
);

INSERT INTO employee_info VALUES ("Sally","Mae","smae","Physician","123",4);
INSERT INTO employee_info VALUES ("Earl","Johnson","ejohn","Nurse","nurse1",3);
INSERT INTO employee_info VALUES ("Mike","Curry","mcurry","ER Billing Staff","red",1);
INSERT INTO employee_info VALUES ("Carl","Baxter","cbax","Nurse","nurse2",4);
INSERT INTO employee_info VALUES ("Will","Jackson","wjackson","Emergency Room Staff","123",2);
INSERT INTO employee_info VALUES ("Dre","Wilson","dwilson","ER Billing Staff","billing",1);
