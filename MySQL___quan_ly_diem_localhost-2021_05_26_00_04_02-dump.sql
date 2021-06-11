-- MySQL dump 10.13  Distrib 8.0.25, for Linux (x86_64)
--
-- Host: 127.0.0.1    Database: quan_ly_diem
-- ------------------------------------------------------
-- Server version	8.0.25-0ubuntu0.20.04.1

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `student_info`
--

DROP TABLE IF EXISTS `student_info`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_info` (
  `Id` int NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Gender` varchar(50) NOT NULL,
  `Date` varchar(50) NOT NULL,
  `Lop` varchar(50) NOT NULL,
  `Address` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_info`
--

LOCK TABLES `student_info` WRITE;
/*!40000 ALTER TABLE `student_info` DISABLE KEYS */;
INSERT INTO `student_info` VALUES (10,'Nguyen Thi Q','Female','14/04/2000','CNTT07','75 Xuan Khoat'),(11,'Nguyen Van D','Male','15/06/2000','CNTT09','12 Nguyen Xuan Khoat'),(12,'Nguyen Thi S','Female','21/06/2000','CNTT03','74 Nguyen Thai Binh'),(13,'Nguyen Thi Pi','Male','12/10/2000','CNTT05','26 Nguyen Thai Binh'),(23,'Nguyen Thi Phuc','Female','22/09/2001','CNTT09','77 Xuan Khoat'),(33,'Nguyen Thi T','Female','12/10/2000','CNTT05','74 Nguyen Thai Binh'),(44,'Nguyen Van R','Male','21/06/2000','CNTT02','74 Nguyen Thai Binh'),(55,'Nguyen Van K','Male','22/07/2000','CNTTT01','74 Cong Hoa'),(65,'Nguyen Van K','Female','22/04/2000','CNTTT01','12 Nguyen Xuan Khoat'),(66,'Nguyen Thi F','Female','22/14/2000','CNTT02','74 Cong Hoa'),(77,'Nguyen Van H','Male','22/08/2000','CNTT02','77 Xuan Hong'),(88,'Nguyen Thi H','Female','22/04/2000','CNTT02','78 Xuan Dieu');
/*!40000 ALTER TABLE `student_info` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student_mark`
--

DROP TABLE IF EXISTS `student_mark`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student_mark` (
  `Id` int NOT NULL,
  `Name` varchar(50) NOT NULL,
  `Tenmon` varchar(50) NOT NULL,
  `Diem15` float NOT NULL,
  `Diem45` float NOT NULL,
  `Diemthi` float NOT NULL,
  `Diemtongket` float NOT NULL,
  `Xeploai` varchar(50) NOT NULL,
  `MaMh` int NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student_mark`
--

LOCK TABLES `student_mark` WRITE;
/*!40000 ALTER TABLE `student_mark` DISABLE KEYS */;
INSERT INTO `student_mark` VALUES (11,'Nguyen Thi F','Toan Cao Cap',9,9,9,9,'Gioi',111),(12,'Nguyen Van K','Toan Cao Cap 2',10,5,10,10,'Kha',112),(13,'Nguyen Van R','Mac Lenin',5,10,6,7,'Kha',113),(18,'Nguyen Quoc O','Mac Lenin',10,10,10,10,'Xuat Sac',113),(19,'Nguyen Quoc Nam','Toan Cao Cap 2',10,5,10,9,'Gioi',112),(20,'Nguyen Quoc Tuan','Lap Trinh Java',5,5,5,5,'Yeu',115),(21,'Nguyen Van Thanh','Mac Lenin',10,10,5,7,'Kha',113),(24,'Nguyen Quoc I','Toan Cao Cap 2',10,5,6,6.6,'Trung Binh',112);
/*!40000 ALTER TABLE `student_mark` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `subject`
--

DROP TABLE IF EXISTS `subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `subject` (
  `stt` int NOT NULL,
  `tenmh` varchar(50) NOT NULL,
  `mamh` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `subject`
--

LOCK TABLES `subject` WRITE;
/*!40000 ALTER TABLE `subject` DISABLE KEYS */;
INSERT INTO `subject` VALUES (1,'Toan Cao Cap','111'),(2,'Toan Cao Cap 2','112'),(4,'Lap Trinh Can Ban','114'),(5,'Lap Trinh Java','115'),(6,'Anh Van','116'),(7,'Toan Roi Rac','117'),(8,'Toan Roi Rac 2','118'),(9,'Lap Trinh Do Hoa','119');
/*!40000 ALTER TABLE `subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES ('tnmt','tnmt'),('tnmt123','tnmt123'),('tnmt1','tnmt1'),('tnmt2','tnmt2'),('bvhieu','bvhieu');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-26  0:04:02
