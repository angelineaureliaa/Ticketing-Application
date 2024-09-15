-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: ticketingbaru
-- ------------------------------------------------------
-- Server version	5.5.5-10.4.32-MariaDB

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `acara`
--

DROP TABLE IF EXISTS `acara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `acara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_acara` varchar(255) NOT NULL,
  `kategori` enum('Hiburan','Seminar','Pameran') NOT NULL,
  `lokasi` varchar(255) NOT NULL,
  `tanggal_acara` datetime NOT NULL,
  `kapasitas_awal` int(11) NOT NULL,
  `kapasitas_sisa` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `acara`
--

LOCK TABLES `acara` WRITE;
/*!40000 ALTER TABLE `acara` DISABLE KEYS */;
INSERT INTO `acara` VALUES (1,'konser cuy','Hiburan','garasi rumah','2024-12-16 00:00:00',100,86),(2,'demo disprog','Seminar','Universitas Surabaya','2024-07-10 00:00:00',50,44);
/*!40000 ALTER TABLE `acara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `akun`
--

DROP TABLE IF EXISTS `akun`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `akun` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `password` varchar(45) NOT NULL,
  `nama` varchar(255) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `akun`
--

LOCK TABLES `akun` WRITE;
/*!40000 ALTER TABLE `akun` DISABLE KEYS */;
INSERT INTO `akun` VALUES (1,'bb','bb','babi'),(2,'aa','aa','aa'),(3,'cc','cc','cc'),(4,'dd','dd','baby'),(5,'ee','ee','eeeeeeeeee');
/*!40000 ALTER TABLE `akun` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_acara`
--

DROP TABLE IF EXISTS `reservation_acara`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation_acara` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `acara_id` int(11) NOT NULL,
  `akun_id` int(11) NOT NULL,
  `tanggal_pembelian` varchar(45) NOT NULL,
  `tanggal_acara` varchar(45) NOT NULL,
  `status` enum('Selesai','Pending') NOT NULL,
  PRIMARY KEY (`id`,`acara_id`,`akun_id`),
  KEY `fk_acara_has_akun_akun1_idx` (`akun_id`),
  KEY `fk_acara_has_akun_acara_idx` (`acara_id`),
  CONSTRAINT `fk_acara_has_akun_acara` FOREIGN KEY (`acara_id`) REFERENCES `acara` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_acara_has_akun_akun1` FOREIGN KEY (`akun_id`) REFERENCES `akun` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_acara`
--

LOCK TABLES `reservation_acara` WRITE;
/*!40000 ALTER TABLE `reservation_acara` DISABLE KEYS */;
INSERT INTO `reservation_acara` VALUES (1,1,1,'2024-06-28','2024-12-16','Selesai'),(2,1,1,'2024-07-04','2024-12-16','Selesai'),(3,1,1,'2024-07-04','2024-12-16','Selesai'),(4,1,1,'2024-07-04','2024-12-16','Selesai'),(5,1,1,'2024-07-04','2024-12-16','Pending'),(6,1,2,'2024-07-06','2024-12-16','Pending'),(7,1,2,'2024-07-06','2024-12-16','Pending'),(8,1,2,'2024-07-06','2024-12-16','Pending'),(9,1,1,'2024-07-08','2024-12-16','Pending'),(10,1,1,'2024-07-09','2024-12-16','Pending'),(11,1,1,'2024-07-10','2024-12-16','Pending'),(12,1,1,'2024-07-10','2024-12-16','Pending'),(13,1,4,'2024-07-10','2024-12-16','Pending'),(14,2,4,'2024-07-10','2024-07-10','Selesai'),(15,2,1,'2024-07-10','2024-07-10','Selesai'),(16,2,4,'2024-07-10','2024-07-10','Selesai'),(17,1,5,'2024-07-10','2024-12-16','Pending'),(18,2,5,'2024-07-10','2024-07-10','Selesai'),(19,2,5,'2024-07-10','2024-07-10','Selesai'),(20,2,5,'2024-07-10','2024-07-10','Selesai');
/*!40000 ALTER TABLE `reservation_acara` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `reservation_parkir`
--

DROP TABLE IF EXISTS `reservation_parkir`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `reservation_parkir` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nomor_parkir` varchar(45) NOT NULL,
  `tanggal_pembelian` varchar(45) NOT NULL,
  `tanggal_parkir` varchar(45) NOT NULL,
  `lantai` enum('B2','LG','G') NOT NULL,
  `akun_id` int(11) NOT NULL,
  `tempat_id` int(11) NOT NULL,
  PRIMARY KEY (`id`,`nomor_parkir`),
  KEY `fk_reservation_parkir_akun1_idx` (`akun_id`),
  KEY `fk_reservation_parkir_tempat1_idx` (`tempat_id`),
  CONSTRAINT `fk_reservation_parkir_akun1` FOREIGN KEY (`akun_id`) REFERENCES `akun` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_reservation_parkir_tempat1` FOREIGN KEY (`tempat_id`) REFERENCES `tempat` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `reservation_parkir`
--

LOCK TABLES `reservation_parkir` WRITE;
/*!40000 ALTER TABLE `reservation_parkir` DISABLE KEYS */;
INSERT INTO `reservation_parkir` VALUES (1,'B2','2024-06-28','2024-06-28','B2',1,1),(2,'B3','2024-07-09','2024-06-28','B2',1,1),(3,'B2','2024-07-09','2024-07-18','B2',1,1),(4,'B3','2024-07-10','2024-07-25','B2',1,1),(5,'C1','2024-07-10','2024-07-11','B2',1,1),(6,'C9','2024-07-10','2024-07-10','B2',4,1),(7,'A12','2024-07-10','2024-07-25','B2',5,1),(8,'C7','2024-07-10','2024-07-28','B2',5,1),(9,'B11','2024-07-10','2024-07-25','B2',5,1),(10,'B12','2024-07-10','2024-07-31','B2',5,1),(11,'C8','2024-07-10','2024-07-18','B2',5,1),(12,'B8','2024-07-10','2024-07-31','B2',5,1),(13,'B7','2024-07-10','2024-07-23','B2',5,1);
/*!40000 ALTER TABLE `reservation_parkir` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tempat`
--

DROP TABLE IF EXISTS `tempat`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tempat` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama` varchar(45) NOT NULL,
  `lokasi` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tempat`
--

LOCK TABLES `tempat` WRITE;
/*!40000 ALTER TABLE `tempat` DISABLE KEYS */;
INSERT INTO `tempat` VALUES (1,'Galaxy Mall','bumi'),(2,'Tujungan Plaza','mars');
/*!40000 ALTER TABLE `tempat` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-07-11 12:31:53
