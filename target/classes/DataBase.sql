--
-- База данных: `Rele_storage`
--
DROP DATABASE releSystemDatabase;
CREATE DATABASE IF NOT EXISTS releSystemDatabase;
USE releSystemDatabase;
-- --------------------------------------------------------

--
-- Структура таблицы `category`
--

CREATE TABLE IF NOT EXISTS `category` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `relay`
--

DROP TABLE IF EXISTS relay;
CREATE TABLE IF NOT EXISTS `relay` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `serial_number` INT(11) NOT NULL,
  `type_id` INT(11) NOT NULL,
  `unit_id` INT(11) NOT NULL,
  `station_id` INT(11) NOT NULL,
  `manufacture_date` DATE NOT NULL,
  `last_service` DATE NOT NULL,
  `next_service` DATE NOT NULL,
  `responible` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `serial_UNIQUE` (`serial_number`),
  KEY `fk_type_idx` (`type_id`),
  KEY `fk_unit_idx` (`unit_id`),
  KEY `fk_station_idx` (`station_id`),
  CONSTRAINT `fk_type` FOREIGN KEY (`type_id`) REFERENCES `rele_type` (`id`) ,
  CONSTRAINT `fk_unit_1` FOREIGN KEY (`unit_id`) REFERENCES `unit` (`id`) ,
  CONSTRAINT `fk_station` FOREIGN KEY (`station_id`) REFERENCES `station` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `rele_type`
--
DROP TABLE rele_type;
CREATE TABLE IF NOT EXISTS `rele_type` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `station`
--

CREATE TABLE IF NOT EXISTS `station` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `station_name` varchar(45) CHARACTER SET utf8 NOT NULL,
  `unit_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_unit_idx` (`unit_id`),
  CONSTRAINT `fk_unit` FOREIGN KEY (`unit_id`) REFERENCES `unit` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `stuff`
--

CREATE TABLE IF NOT EXISTS `stuff` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `stuff_number` int(11) NOT NULL,
  `name` varchar(45) CHARACTER SET latin1 DEFAULT NULL,
  `second_name` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `last_name` varchar(45) CHARACTER SET utf8 DEFAULT NULL,
  `fk_category` varchar(45) CHARACTER SET utf8 NOT NULL,
  `fk_unit` varchar(45) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `unit`
--

CREATE TABLE IF NOT EXISTS `unit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Структура таблицы `users`
--

CREATE TABLE IF NOT EXISTS `users` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `category` varchar(20) CHARACTER SET utf8 NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
