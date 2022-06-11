-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: softkachallenge
-- ------------------------------------------------------
-- Server version	8.0.29

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
-- Dumping data for table `answer`
--

LOCK TABLES `answer` WRITE;
/*!40000 ALTER TABLE `answer` DISABLE KEYS */;
INSERT INTO `answer` VALUES (1,'Luigi',1,1),(2,'Donkey Kong',0,1),(3,'Waluigi',0,1),(4,'Homero',0,1),(5,'2',0,2),(6,'1',0,2),(7,'4',1,2),(8,'8',0,2),(9,'Robotech',0,3),(10,'Tails',0,3),(11,'Knucles',0,3),(12,'Dr. Robotnik',1,3),(13,'PS1',1,4),(14,'SNES',0,4),(15,'Xbox',0,4),(16,'GameBoy',0,4),(17,'17',0,5),(18,'Raccon City',1,5),(19,'Metropoly',0,5),(20,'Residen City',0,5),(21,'Henri de Toulouse-Lautrec ',0,6),(22,'Vincent Van Gohg',1,6),(23,'Salvador Dali',0,6),(24,'Paul Cezane',0,6),(25,'Miguel Angel',1,7),(26,'Francisco Goya',0,7),(27,'Claude Monet',0,7),(28,'Cravaggio',0,7),(29,'Leonora Carrington ',0,8),(30,'Remedios Varo ',0,8),(31,'Frida Kahlo ',0,8),(32,'Virginia Woolf',1,8),(33,'Vincent van Gogh ',1,9),(34,'Marcel Duchamp ',0,9),(35,'Edgar Degas ',0,9),(36,'Paul Gauguin ',0,9),(37,'Leonardo Da Vinci',1,10),(38,'Leonora Carrington ',0,10),(39,'Salvador Dali',0,10),(40,'Paul Cezane',0,10),(41,'En busca del valle encantado',0,11),(42,'King Kong ',0,11),(43,'Parque Jurásico ',1,11),(44,'Godzilla ',0,11),(45,'Yo, Robot',0,12),(46,'Cortocircuito',0,12),(47,'Terminator',1,12),(48,'Robocop',0,12),(49,'El laberinto del Fauno',0,13),(50,'El Señor de los Anillos',1,13),(51,'La Torre Oscura ',0,13),(52,'El misterio del anillo ',0,13),(53,'Errol',0,14),(54,'Hedwig',1,14),(55,'Crookshanks',0,14),(56,'Scabbers',0,14),(57,'Perdió su pierna izquierda.',0,15),(58,'Perdió su brazo derecho.',1,15),(59,'Perdió su pierna derecha.',0,15),(60,'Él perdió.',0,15),(61,'Perros ',1,16),(62,'Roedores',0,16),(63,'Gatos ',0,16),(64,'Hormigas',0,16),(65,'Evidencia un sentimiento morboso de celos exagerados',0,17),(66,'Evidencia una forma peculiar del complejo de inferioridad en la que se hace cualquier cosa con tal de destacar. ',0,17),(67,'Evidencia un sentimiento romántico/sexual del niño hacia la madre, viendo al padre como rival ',1,17),(68,'Ninguna de las opciones',0,17),(69,'Por su estudio sobre los koalas en Australia ',0,18),(70,'Por su estudio sobre los osos polares en el Artico ',0,18),(71,'Por su estudio sobre los primates en Tanzania ',1,18),(72,'Por ganar un premio nobel',0,18),(73,'Los indios ',1,19),(74,'Los árabes ',0,19),(75,'Los romanos ',0,19),(76,'Los mayas',0,19),(77,'Del fondo marino ',0,20),(78,'Del magma de los volcanes ',1,20),(79,'De las minas ',0,20),(80,'Del quarzo',0,20),(81,'Iridio ',0,21),(82,'Wolframio ',0,21),(83,'Osmio ',1,21),(84,'Radio',0,21),(85,'Por ser el primer cometa descubierto por el hombre. ',0,22),(86,'Por ser el primer cometa reconocido con órbita cíclica. ',1,22),(87,'Por su gran cola de 35º de longitud, de ahí que se conozca como el Gran Cometa ',0,22),(88,'Ninguna de las opciones',0,22),(89,'De ácido sulfúrico y ácido nítrico ',1,23),(90,'De ácido sulfúrico y úrico ',0,23),(91,'De ácido nítrico y clorhídrico ',0,23),(92,'De acido urico y clorhidrico',0,23),(93,'El Compsognathus ',0,24),(94,'El Lesothosaurus ',0,24),(95,'El Pisanosaurus ',0,24),(96,'El piranosauru',0,24),(97,'positiva',1,25),(98,'negativa',0,25),(99,'neutra',0,25),(100,'ambigua',0,25);
/*!40000 ALTER TABLE `answer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'video juegos','facil'),(2,'arte','normal'),(3,'peliculas','dificil'),(4,'ciencia','heroica'),(5,'fisica','legendaria');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `game`
--

LOCK TABLES `game` WRITE;
/*!40000 ALTER TABLE `game` DISABLE KEYS */;
INSERT INTO `game` VALUES (1,'2022-06-10 01:38:49','victoria','crzoul',200);
/*!40000 ALTER TABLE `game` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `player`
--

LOCK TABLES `player` WRITE;
/*!40000 ALTER TABLE `player` DISABLE KEYS */;
INSERT INTO `player` VALUES ('crzoul');
/*!40000 ALTER TABLE `player` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `question`
--

LOCK TABLES `question` WRITE;
/*!40000 ALTER TABLE `question` DISABLE KEYS */;
INSERT INTO `question` VALUES (1,'Como se llama el hermano de Mario Bros? ',1),(2,'Cuantas entradas para mandos tiene Nintendo 64? ',1),(3,'Como se llama el nemesis de Sonic? ',1),(4,'Cual fue la primera consola de PlayStation? ',1),(5,'Como se llama la ciudad en la que desenvuelve Resident Evil? ',1),(6,'Como se llama el pintor que se corto la oreja?',2),(7,'Quien pinto la Capilla Sixtina de El Vaticano?',2),(8,'Quien de ellas no fue una pintora famosa?',2),(9,'Quien pinto \"La noche estrellada\"\"?\"',2),(10,'Quien pinto \"La Gioconda\"\"?\"',2),(11,'Los dinosaurios se pusieron de moda gracias a esta pelicula.',3),(12,'El modelo T-800 conforma uno de los robots mas famosos de la historia de la ciencia ficcion. Aparece en...',3),(13,'Un anillo para gobernarlos a todos. Un anillo para encontrarlos, para atraerlos a todos y atarlos en las tinieblas. A que famosa pelicula nos referimos?',3),(14,'Como se llamaba el buho mascota de Harry Potter?',3),(15,'Que le pasa a Anakin Skywalker durante la batalla con el Conde Dooku?',3),(16,'Que animal utiliza el Premio Nobel de medicina Ivan Pavlov en sus experimentos? ',4),(17,'Que es el complejo de Edipo? ',4),(18,'Por que es conocida la biologa britinica Jane Goodall? ',4),(19,'Quienes crearon el numero 0?',4),(20,'De donde procede la famosa piedra pomez? ',4),(21,'Cual es el elemento quimico mas denso? ',5),(22,'Por que es famoso el cometa Halley? ',5),(23,'De que este compuesta la lluvia acida? ',5),(24,'El dinosaurio mas pequeno que existio sobre la faz de la Tierra fue... ',5),(25,'Un proton es una particula subatamica de carga ... ',5);
/*!40000 ALTER TABLE `question` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `round`
--

LOCK TABLES `round` WRITE;
/*!40000 ALTER TABLE `round` DISABLE KEYS */;
INSERT INTO `round` VALUES (1,1,10);
/*!40000 ALTER TABLE `round` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-11 10:02:23
