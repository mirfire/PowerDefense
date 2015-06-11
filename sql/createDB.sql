-- --------------------------------------------------------
-- Hôte :                        127.0.0.1
-- Version du serveur:           5.6.17 - MySQL Community Server (GPL)
-- SE du serveur:                Win32
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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

-- Export de données de la table projet_java.maps : ~0 rows (environ)
/*!40000 ALTER TABLE `maps` DISABLE KEYS */;
INSERT INTO `maps` (`mapID`, `mapName`, `backgroundPath`, `width`, `height`) VALUES
	(1, 'Carte 1', 'resources/maps/niveau_1.jpeg', 15, 15),
	(2, 'Carte 2', 'resources/maps/niveau_1.jpeg', 15, 15),
	(3, 'Carte 3', 'resources/maps/niveau_1.jpeg', 15, 15),
	(4, 'Carte 4', 'resources/maps/niveau_1.jpeg', 15, 15);
/*!40000 ALTER TABLE `maps` ENABLE KEYS */;


-- Export de la structure de table projet_java. spawnpoint
CREATE TABLE IF NOT EXISTS `spawnpoint` (
  `mapID` int(11) NOT NULL,
  `x` tinyint(4) DEFAULT NULL,
  `y` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`mapID`),
  CONSTRAINT `FK_mapID` FOREIGN KEY (`mapID`) REFERENCES `maps` (`mapID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Export de données de la table projet_java.spawnpoint : ~0 rows (environ)
/*!40000 ALTER TABLE `spawnpoint` DISABLE KEYS */;
INSERT INTO `spawnpoint` (`mapID`, `x`, `y`) VALUES
	(1, 1, 2),
	(2, 1, 2),
	(3, 1, 2),
	(4, 1, 2);
/*!40000 ALTER TABLE `spawnpoint` ENABLE KEYS */;


-- Export de la structure de table projet_java. workstation
CREATE TABLE IF NOT EXISTS `workstation` (
  `mapID` int(11) NOT NULL,
  `x` tinyint(4) DEFAULT NULL,
  `y` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`mapID`),
  CONSTRAINT `workstation_ibfk_1` FOREIGN KEY (`mapID`) REFERENCES `maps` (`mapID`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1 ROW_FORMAT=COMPACT;

-- Export de données de la table projet_java.workstation : ~0 rows (environ)
/*!40000 ALTER TABLE `workstation` DISABLE KEYS */;
INSERT INTO `workstation` (`mapID`, `x`, `y`) VALUES
	(1, 14, 15),
	(2, 14, 15),
	(3, 14, 15),
	(4, 14, 15);
/*!40000 ALTER TABLE `workstation` ENABLE KEYS */;
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
