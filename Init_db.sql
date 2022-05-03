CREATE SCHEMA `lab4` ;

CREATE TABLE `lab4`.`adress` (
  `idAdress` INT NOT NULL,
  `Country` VARCHAR(45) NULL,
  `City` VARCHAR(45) NULL,
  PRIMARY KEY (`idAdress`));
  CREATE TABLE `lab4`.`student` (
    `idStudent` INT NOT NULL,
    `name` VARCHAR(45) NULL,
    `brithday` DATETIME NULL,
    `course` INT NULL,
    PRIMARY KEY (`idStudent`));