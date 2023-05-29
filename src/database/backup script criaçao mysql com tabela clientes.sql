-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema petaltech
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema petaltech
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `petaltech` DEFAULT CHARACTER SET utf8mb4 ;
USE `petaltech` ;

-- -----------------------------------------------------
-- Table `petaltech`.`clientes`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `petaltech`.`clientes` (
  `idCliente` INT(11) NOT NULL AUTO_INCREMENT,
  `cpf` VARCHAR(14) NULL DEFAULT NULL,
  `nome` VARCHAR(30) NULL DEFAULT NULL,
  `telefone` VARCHAR(30) NULL DEFAULT NULL,
  `email` VARCHAR(30) NULL DEFAULT NULL,
  `sexo` VARCHAR(10) NULL DEFAULT NULL,
  `data` DATE NULL DEFAULT NULL,
  `cep` VARCHAR(10) NULL DEFAULT NULL,
  `uf` VARCHAR(2) NULL DEFAULT NULL,
  `bairro` VARCHAR(30) NULL DEFAULT NULL,
  `rua` VARCHAR(30) NULL DEFAULT NULL,
  `numero` INT(11) NULL DEFAULT NULL,
  `complemento` VARCHAR(50) NULL DEFAULT NULL,
  PRIMARY KEY (`idCliente`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `petaltech`.`itemvenda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `petaltech`.`itemvenda` (
  `idVenda` INT(11) NULL DEFAULT NULL,
  `idItemVenda` INT(11) NOT NULL AUTO_INCREMENT,
  `idProduto` INT(11) NULL DEFAULT NULL,
  `qtdProduto` INT(11) NULL DEFAULT NULL,
  `valorunit` DOUBLE NULL DEFAULT NULL,
  `valor` DOUBLE NULL DEFAULT NULL,
  PRIMARY KEY (`idItemVenda`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `petaltech`.`produtos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `petaltech`.`produtos` (
  `IDproduto` INT(11) NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(100) NULL DEFAULT NULL,
  `precoCompra` DOUBLE NULL DEFAULT NULL,
  `qtdEstoque` INT(11) NULL DEFAULT NULL,
  `precoVenda` DOUBLE NULL DEFAULT NULL,
  `descricao` VARCHAR(100) NULL DEFAULT NULL,
  PRIMARY KEY (`IDproduto`))
ENGINE = InnoDB
AUTO_INCREMENT = 4
DEFAULT CHARACTER SET = utf8mb4;


-- -----------------------------------------------------
-- Table `petaltech`.`venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `petaltech`.`venda` (
  `idVenda` INT(11) NOT NULL AUTO_INCREMENT,
  `idCliente` INT(11) NULL DEFAULT NULL,
  `data` DATE NULL DEFAULT NULL,
  PRIMARY KEY (`idVenda`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
