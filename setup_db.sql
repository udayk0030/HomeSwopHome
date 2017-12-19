CREATE TABLE `HomeSwopHome`.`UserInfo` (
  `id_user` INT NOT NULL AUTO_INCREMENT,
  `email` VARCHAR(45) NOT NULL,
  `firstName` VARCHAR(45) NOT NULL,
  `lastName` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NOT NULL,
  `tel` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id_user`));
