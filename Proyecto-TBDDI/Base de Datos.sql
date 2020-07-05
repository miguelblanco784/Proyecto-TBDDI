-- MySQL dump 10.13  Distrib 8.0.20, for Win64 (x86_64)
--
-- Host: localhost    Database: teoriabdd
-- ------------------------------------------------------
-- Server version	8.0.20

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `carroceria`
--

DROP TABLE IF EXISTS `carroceria`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `carroceria` (
  `idCarroceria` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Modelo_idModelo` int NOT NULL,
  PRIMARY KEY (`idCarroceria`),
  KEY `fk_Carroceria_Modelo1_idx` (`Modelo_idModelo`),
  CONSTRAINT `fk_Carroceria_Modelo1` FOREIGN KEY (`Modelo_idModelo`) REFERENCES `modelo` (`idModelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `carroceria`
--

LOCK TABLES `carroceria` WRITE;
/*!40000 ALTER TABLE `carroceria` DISABLE KEYS */;
/*!40000 ALTER TABLE `carroceria` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `clientes`
--

DROP TABLE IF EXISTS `clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `clientes` (
  `idClientes` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Concesionario_idConcesionario` int NOT NULL,
  PRIMARY KEY (`idClientes`),
  KEY `fk_Clientes_Concesionario1_idx` (`Concesionario_idConcesionario`),
  CONSTRAINT `fk_Clientes_Concesionario1` FOREIGN KEY (`Concesionario_idConcesionario`) REFERENCES `concesionario` (`idConcesionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `clientes`
--

LOCK TABLES `clientes` WRITE;
/*!40000 ALTER TABLE `clientes` DISABLE KEYS */;
INSERT INTO `clientes` VALUES (1,'Luis Gerardo','9999999',1),(2,'Miguel Blanco','88888888',2);
/*!40000 ALTER TABLE `clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `color`
--

DROP TABLE IF EXISTS `color`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `color` (
  `idColor` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Modelo_idModelo` int NOT NULL,
  PRIMARY KEY (`idColor`),
  KEY `fk_Color_Modelo1_idx` (`Modelo_idModelo`),
  CONSTRAINT `fk_Color_Modelo1` FOREIGN KEY (`Modelo_idModelo`) REFERENCES `modelo` (`idModelo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `color`
--

LOCK TABLES `color` WRITE;
/*!40000 ALTER TABLE `color` DISABLE KEYS */;
/*!40000 ALTER TABLE `color` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concesionario`
--

DROP TABLE IF EXISTS `concesionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `concesionario` (
  `idConcesionario` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Status` varchar(1) DEFAULT NULL,
  `Correo` varchar(45) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idConcesionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concesionario`
--

LOCK TABLES `concesionario` WRITE;
/*!40000 ALTER TABLE `concesionario` DISABLE KEYS */;
INSERT INTO `concesionario` VALUES (1,'BMW Luxury Motors','0','bmw@luxury.com','800-800-800'),(2,'BMW Tampa','0','bmw@tampa.com','801-801-801'),(3,'BMW SPS','0','bmw@sps.com','501-501-501'),(4,'BMW TGU','0','bmw@tgu.com','502-502-502'),(5,'BMW Praga','0','bmw@praga.com','909-909-909');
/*!40000 ALTER TABLE `concesionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `concesionario_has_marca`
--

DROP TABLE IF EXISTS `concesionario_has_marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `concesionario_has_marca` (
  `Concesionario_idConcesionario` int NOT NULL,
  `Marca_idMarca` int NOT NULL,
  KEY `fk_Concesionario_has_Marca_Marca1_idx` (`Marca_idMarca`),
  KEY `fk_Concesionario_has_Marca_Concesionario1_idx` (`Concesionario_idConcesionario`),
  CONSTRAINT `fk_Concesionario_has_Marca_Concesionario1` FOREIGN KEY (`Concesionario_idConcesionario`) REFERENCES `concesionario` (`idConcesionario`),
  CONSTRAINT `fk_Concesionario_has_Marca_Marca1` FOREIGN KEY (`Marca_idMarca`) REFERENCES `marca` (`idMarca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `concesionario_has_marca`
--

LOCK TABLES `concesionario_has_marca` WRITE;
/*!40000 ALTER TABLE `concesionario_has_marca` DISABLE KEYS */;
INSERT INTO `concesionario_has_marca` VALUES (2,1);
/*!40000 ALTER TABLE `concesionario_has_marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detalle_factura_clientes`
--

DROP TABLE IF EXISTS `detalle_factura_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `detalle_factura_clientes` (
  `Precio` int NOT NULL,
  `Factura_Clientes_idFactura_Clientes` int NOT NULL,
  `Inventario_Concesionario_idInventario_Concesionario` int NOT NULL,
  KEY `fk_Detalle_Factura_Clientes_Factura_Clientes1_idx` (`Factura_Clientes_idFactura_Clientes`),
  KEY `fk_Detalle_Factura_Clientes_Inventario_Concesionario1` (`Inventario_Concesionario_idInventario_Concesionario`),
  CONSTRAINT `fk_Detalle_Factura_Clientes_Factura_Clientes1` FOREIGN KEY (`Factura_Clientes_idFactura_Clientes`) REFERENCES `factura_clientes` (`idFactura_Clientes`),
  CONSTRAINT `fk_Detalle_Factura_Clientes_Inventario_Concesionario1` FOREIGN KEY (`Inventario_Concesionario_idInventario_Concesionario`) REFERENCES `inventario_concesionario` (`idInventario_Concesionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detalle_factura_clientes`
--

LOCK TABLES `detalle_factura_clientes` WRITE;
/*!40000 ALTER TABLE `detalle_factura_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `detalle_factura_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empresa`
--

DROP TABLE IF EXISTS `empresa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empresa` (
  `Tipo_Empresa` varchar(45) NOT NULL,
  `Clientes_idClientes` int NOT NULL,
  KEY `fk_Empresa_Clientes1` (`Clientes_idClientes`),
  CONSTRAINT `fk_Empresa_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empresa`
--

LOCK TABLES `empresa` WRITE;
/*!40000 ALTER TABLE `empresa` DISABLE KEYS */;
INSERT INTO `empresa` VALUES ('Bufete Legal',1);
/*!40000 ALTER TABLE `empresa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `factura_clientes`
--

DROP TABLE IF EXISTS `factura_clientes`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `factura_clientes` (
  `idFactura_Clientes` int NOT NULL,
  `Fecha` date DEFAULT NULL,
  `Total` varchar(45) DEFAULT NULL,
  `Impuesto` varchar(45) DEFAULT NULL,
  `SubTotal` varchar(45) DEFAULT NULL,
  `Concesionario_idConcesionario` int NOT NULL,
  `Clientes_idClientes` int NOT NULL,
  PRIMARY KEY (`idFactura_Clientes`),
  KEY `fk_Factura_Clientes_Concesionario1_idx` (`Concesionario_idConcesionario`),
  KEY `fk_Factura_Clientes_Clientes1_idx` (`Clientes_idClientes`),
  CONSTRAINT `fk_Factura_Clientes_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`),
  CONSTRAINT `fk_Factura_Clientes_Concesionario1` FOREIGN KEY (`Concesionario_idConcesionario`) REFERENCES `concesionario` (`idConcesionario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `factura_clientes`
--

LOCK TABLES `factura_clientes` WRITE;
/*!40000 ALTER TABLE `factura_clientes` DISABLE KEYS */;
/*!40000 ALTER TABLE `factura_clientes` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventario_concesionario`
--

DROP TABLE IF EXISTS `inventario_concesionario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `inventario_concesionario` (
  `idInventario_Concesionario` int NOT NULL,
  `Status` varchar(1) DEFAULT NULL,
  `Concesionario_idConcesionario` int NOT NULL,
  `Vehiculo_VIN` int NOT NULL,
  PRIMARY KEY (`idInventario_Concesionario`),
  KEY `fk_Inventario_Concesionario_Concesionario1_idx` (`Concesionario_idConcesionario`),
  KEY `fk_Inventario_Concesionario_Vehiculo1_idx` (`Vehiculo_VIN`),
  CONSTRAINT `fk_Inventario_Concesionario_Concesionario1` FOREIGN KEY (`Concesionario_idConcesionario`) REFERENCES `concesionario` (`idConcesionario`),
  CONSTRAINT `fk_Inventario_Concesionario_Vehiculo1` FOREIGN KEY (`Vehiculo_VIN`) REFERENCES `vehiculo` (`VIN`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventario_concesionario`
--

LOCK TABLES `inventario_concesionario` WRITE;
/*!40000 ALTER TABLE `inventario_concesionario` DISABLE KEYS */;
/*!40000 ALTER TABLE `inventario_concesionario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `marca`
--

DROP TABLE IF EXISTS `marca`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `marca` (
  `idMarca` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Status` int DEFAULT NULL,
  PRIMARY KEY (`idMarca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `marca`
--

LOCK TABLES `marca` WRITE;
/*!40000 ALTER TABLE `marca` DISABLE KEYS */;
INSERT INTO `marca` VALUES (1,'Rolls Royce',0),(2,'Mini',0);
/*!40000 ALTER TABLE `marca` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `modelo`
--

DROP TABLE IF EXISTS `modelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `modelo` (
  `idModelo` int NOT NULL,
  `Nombre` varchar(70) DEFAULT NULL,
  `Tipo_Motor` varchar(45) DEFAULT NULL,
  `Transmision` varchar(45) DEFAULT NULL,
  `Marca_idMarca` int NOT NULL,
  PRIMARY KEY (`idModelo`),
  UNIQUE KEY `Transmision_UNIQUE` (`Transmision`),
  KEY `fk_Modelo_Marca_idx` (`Marca_idMarca`),
  CONSTRAINT `fk_Modelo_Marca` FOREIGN KEY (`Marca_idMarca`) REFERENCES `marca` (`idMarca`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `modelo`
--

LOCK TABLES `modelo` WRITE;
/*!40000 ALTER TABLE `modelo` DISABLE KEYS */;
/*!40000 ALTER TABLE `modelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `parte`
--

DROP TABLE IF EXISTS `parte`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `parte` (
  `idParte` int NOT NULL,
  `Nombre` varchar(45) NOT NULL,
  `Planta_idPlanta` int NOT NULL,
  `Modelo_idModelo` int NOT NULL,
  PRIMARY KEY (`idParte`),
  KEY `fk_Parte_Planta1_idx` (`Planta_idPlanta`),
  KEY `fk_Parte_Modelo1_idx` (`Modelo_idModelo`),
  CONSTRAINT `fk_Parte_Modelo1` FOREIGN KEY (`Modelo_idModelo`) REFERENCES `modelo` (`idModelo`),
  CONSTRAINT `fk_Parte_Planta1` FOREIGN KEY (`Planta_idPlanta`) REFERENCES `planta` (`idPlanta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `parte`
--

LOCK TABLES `parte` WRITE;
/*!40000 ALTER TABLE `parte` DISABLE KEYS */;
/*!40000 ALTER TABLE `parte` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `Sexo` varchar(1) NOT NULL,
  `Ingreso` double DEFAULT NULL,
  `Clientes_idClientes` int NOT NULL,
  KEY `fk_Persona_Clientes1` (`Clientes_idClientes`),
  CONSTRAINT `fk_Persona_Clientes1` FOREIGN KEY (`Clientes_idClientes`) REFERENCES `clientes` (`idClientes`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES ('M',200000.1,1);
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pieza`
--

DROP TABLE IF EXISTS `pieza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pieza` (
  `idPieza` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idPieza`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pieza`
--

LOCK TABLES `pieza` WRITE;
/*!40000 ALTER TABLE `pieza` DISABLE KEYS */;
/*!40000 ALTER TABLE `pieza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pieza_has_modelo`
--

DROP TABLE IF EXISTS `pieza_has_modelo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pieza_has_modelo` (
  `Pieza_idPieza` int NOT NULL,
  `Modelo_idModelo` int NOT NULL,
  KEY `fk_Pieza_has_Modelo_Modelo1_idx` (`Modelo_idModelo`),
  KEY `fk_Pieza_has_Modelo_Pieza1_idx` (`Pieza_idPieza`),
  CONSTRAINT `fk_Pieza_has_Modelo_Modelo1` FOREIGN KEY (`Modelo_idModelo`) REFERENCES `modelo` (`idModelo`),
  CONSTRAINT `fk_Pieza_has_Modelo_Pieza1` FOREIGN KEY (`Pieza_idPieza`) REFERENCES `pieza` (`idPieza`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pieza_has_modelo`
--

LOCK TABLES `pieza_has_modelo` WRITE;
/*!40000 ALTER TABLE `pieza_has_modelo` DISABLE KEYS */;
/*!40000 ALTER TABLE `pieza_has_modelo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `planta`
--

DROP TABLE IF EXISTS `planta`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `planta` (
  `idPlanta` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Tipo_Planta` varchar(45) DEFAULT NULL,
  `Direccion` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`idPlanta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `planta`
--

LOCK TABLES `planta` WRITE;
/*!40000 ALTER TABLE `planta` DISABLE KEYS */;
/*!40000 ALTER TABLE `planta` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor`
--

DROP TABLE IF EXISTS `proveedor`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor` (
  `idProveedor` int NOT NULL,
  `Nombre` varchar(45) DEFAULT NULL,
  `Contacto` varchar(100) DEFAULT NULL,
  `Telefono` varchar(45) DEFAULT NULL,
  `Correo` varchar(45) DEFAULT NULL,
  `Status` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor`
--

LOCK TABLES `proveedor` WRITE;
/*!40000 ALTER TABLE `proveedor` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedor` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `proveedor_has_pieza`
--

DROP TABLE IF EXISTS `proveedor_has_pieza`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `proveedor_has_pieza` (
  `Proveedor_idProveedor` int NOT NULL,
  `Pieza_idPieza` int NOT NULL,
  KEY `fk_Proveedor_has_Pieza_Pieza1_idx` (`Pieza_idPieza`),
  KEY `fk_Proveedor_has_Pieza_Proveedor1_idx` (`Proveedor_idProveedor`),
  CONSTRAINT `fk_Proveedor_has_Pieza_Pieza1` FOREIGN KEY (`Pieza_idPieza`) REFERENCES `pieza` (`idPieza`),
  CONSTRAINT `fk_Proveedor_has_Pieza_Proveedor1` FOREIGN KEY (`Proveedor_idProveedor`) REFERENCES `proveedor` (`idProveedor`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `proveedor_has_pieza`
--

LOCK TABLES `proveedor_has_pieza` WRITE;
/*!40000 ALTER TABLE `proveedor_has_pieza` DISABLE KEYS */;
/*!40000 ALTER TABLE `proveedor_has_pieza` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehiculo`
--

DROP TABLE IF EXISTS `vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehiculo` (
  `VIN` int NOT NULL,
  `Precio` int DEFAULT NULL,
  `Status` int DEFAULT NULL,
  `Modelo_idModelo` int NOT NULL,
  `Planta_idPlanta` int NOT NULL,
  PRIMARY KEY (`VIN`),
  KEY `fk_Vehiculo_Modelo1_idx` (`Modelo_idModelo`),
  KEY `fk_Vehiculo_Planta1_idx` (`Planta_idPlanta`),
  CONSTRAINT `fk_Vehiculo_Modelo1` FOREIGN KEY (`Modelo_idModelo`) REFERENCES `modelo` (`idModelo`),
  CONSTRAINT `fk_Vehiculo_Planta1` FOREIGN KEY (`Planta_idPlanta`) REFERENCES `planta` (`idPlanta`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehiculo`
--

LOCK TABLES `vehiculo` WRITE;
/*!40000 ALTER TABLE `vehiculo` DISABLE KEYS */;
/*!40000 ALTER TABLE `vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2020-07-05 15:56:30
