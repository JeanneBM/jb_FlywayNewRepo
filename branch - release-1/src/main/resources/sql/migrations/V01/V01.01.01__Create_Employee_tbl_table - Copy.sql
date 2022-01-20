--
-- Table structure for table employee_tbl
--

CREATE TABLE Employee_tbl (
  EMPLOYEE_ID int(11) NOT NULL AUTO_INCREMENT,
  EMPLOYEE_FULLNAME varchar(100) NOT NULL,
  EMPLOYEE_DESIGNATION varchar(100) NOT NULL,
  EMPLOYEE_SALARY decimal(10,2) NOT NULL,
  PRIMARY KEY (EMPLOYEE_ID)
);
