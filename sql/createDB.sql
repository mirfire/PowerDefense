-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.6.17 - MySQL Community Server (GPL)
-- SE du serveur:                Win64
-- HeidiSQL Version:             9.2.0.4947
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Export de la structure de la base pour projet_java
CREATE DATABASE IF NOT EXISTS `projet_java` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `projet_java`;


-- Export de la structure de table projet_java. maps
CREATE TABLE IF NOT EXISTS `maps` (
  `mapID` int(10) NOT NULL AUTO_INCREMENT,
  `mapName` tinytext NOT NULL,
  `backgroundPath` tinytext NOT NULL,
  `width` tinyint(4) NOT NULL,
  `height` tinyint(4) NOT NULL,
  PRIMARY KEY (`mapID`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

-- Export de données de la table projet_java.maps : ~1 rows (environ)
/*!40000 ALTER TABLE `maps` DISABLE KEYS */;
INSERT INTO `maps` (`mapID`, `mapName`, `backgroundPath`, `width`, `height`) VALUES
	(1, 'Carte 1', 'resources/maps/niveau_1.jpeg', 15, 15);
/*!40000 ALTER TABLE `maps` ENABLE KEYS */;


-- Export de la structure de table projet_java. spawnpoint
CREATE TABLE IF NOT EXISTS `spawnpoint` (
  `mapID` int(11) NOT NULL,
  `x` tinyint(4) DEFAULT NULL,
  `y` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`mapID`),
  CONSTRAINT `FK_mapID` FOREIGN KEY (`mapID`) REFERENCES `maps` (`mapID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table projet_java.spawnpoint : ~1 rows (environ)
/*!40000 ALTER TABLE `spawnpoint` DISABLE KEYS */;
INSERT INTO `spawnpoint` (`mapID`, `x`, `y`) VALUES
	(1, 1, 3);
/*!40000 ALTER TABLE `spawnpoint` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
