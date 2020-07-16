-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.4.11-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             10.2.0.5599
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;

-- Volcando estructura para tabla sala_videojuegos.alquiler
CREATE TABLE IF NOT EXISTS `alquiler` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `total` double NOT NULL,
  `fecha` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.cliente
CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nit` varchar(12) DEFAULT NULL,
  `nombre` varchar(45) NOT NULL,
  `direccion` varchar(60) NOT NULL,
  `telefono` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.compras
CREATE TABLE IF NOT EXISTS `compras` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nfactura` varchar(25) NOT NULL,
  `total` double NOT NULL,
  `fecha` date NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `Login_id` int(11) NOT NULL,
  `Proveedor_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Compras_Login1_idx` (`Login_id`),
  KEY `fk_Compras_Proveedor1_idx` (`Proveedor_id`),
  CONSTRAINT `fk_Compras_Login1` FOREIGN KEY (`Login_id`) REFERENCES `login` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compras_Proveedor1` FOREIGN KEY (`Proveedor_id`) REFERENCES `proveedor` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.detalle_alquier
CREATE TABLE IF NOT EXISTS `detalle_alquier` (
  `Video_Juegos_id` int(11) NOT NULL,
  `Alquiler_id` int(11) NOT NULL,
  `descuentos` double NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_Video_Juegos_has_Alquiler_Alquiler1_idx` (`Alquiler_id`),
  KEY `fk_Video_Juegos_has_Alquiler_Video_Juegos1_idx` (`Video_Juegos_id`),
  CONSTRAINT `fk_Video_Juegos_has_Alquiler_Alquiler1` FOREIGN KEY (`Alquiler_id`) REFERENCES `alquiler` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Video_Juegos_has_Alquiler_Video_Juegos1` FOREIGN KEY (`Video_Juegos_id`) REFERENCES `video_juegos` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.detalle_compra
CREATE TABLE IF NOT EXISTS `detalle_compra` (
  `Compras_id` int(11) NOT NULL,
  `Producto_id` int(11) NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_Compras_has_Producto_Producto1_idx` (`Producto_id`),
  KEY `fk_Compras_has_Producto_Compras1_idx` (`Compras_id`),
  CONSTRAINT `fk_Compras_has_Producto_Compras1` FOREIGN KEY (`Compras_id`) REFERENCES `compras` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Compras_has_Producto_Producto1` FOREIGN KEY (`Producto_id`) REFERENCES `producto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.detalle_venta
CREATE TABLE IF NOT EXISTS `detalle_venta` (
  `Venta_id` int(11) NOT NULL,
  `Producto_id` int(11) NOT NULL,
  `descuento` double NOT NULL,
  `id` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`id`),
  KEY `fk_Venta_has_Producto_Producto1_idx` (`Producto_id`),
  KEY `fk_Venta_has_Producto_Venta_idx` (`Venta_id`),
  CONSTRAINT `fk_Venta_has_Producto_Producto1` FOREIGN KEY (`Producto_id`) REFERENCES `producto` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_has_Producto_Venta` FOREIGN KEY (`Venta_id`) REFERENCES `venta` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.login
CREATE TABLE IF NOT EXISTS `login` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `usuario` varchar(45) NOT NULL,
  `contraseña` varchar(45) NOT NULL,
  `administrador` tinyint(4) NOT NULL,
  `Usuario_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Login_Usuario1_idx` (`Usuario_id`),
  CONSTRAINT `fk_Login_Usuario1` FOREIGN KEY (`Usuario_id`) REFERENCES `usuario` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.producto
CREATE TABLE IF NOT EXISTS `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `codigo` varchar(45) NOT NULL,
  `nombre` varchar(45) NOT NULL,
  `descripcion` varchar(45) DEFAULT NULL,
  `precio` double NOT NULL,
  `cantidad` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.proveedor
CREATE TABLE IF NOT EXISTS `proveedor` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `empresa` varchar(45) NOT NULL,
  `telefono` varchar(45) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  `direccion` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `dpi` varchar(15) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.venta
CREATE TABLE IF NOT EXISTS `venta` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nfactura` varchar(45) NOT NULL,
  `total` double NOT NULL,
  `fecha` date NOT NULL,
  `anulada` tinyint(4) NOT NULL,
  `Cliente_id` int(11) NOT NULL,
  `Login_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Venta_Cliente1_idx` (`Cliente_id`),
  KEY `fk_Venta_Login1_idx` (`Login_id`),
  CONSTRAINT `fk_Venta_Cliente1` FOREIGN KEY (`Cliente_id`) REFERENCES `cliente` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `fk_Venta_Login1` FOREIGN KEY (`Login_id`) REFERENCES `login` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

-- Volcando estructura para tabla sala_videojuegos.video_juegos
CREATE TABLE IF NOT EXISTS `video_juegos` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(45) NOT NULL,
  `cantidad` int(11) NOT NULL,
  `precio` double NOT NULL,
  `Login_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_Video_Juegos_Login1_idx` (`Login_id`),
  CONSTRAINT `fk_Video_Juegos_Login1` FOREIGN KEY (`Login_id`) REFERENCES `login` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- La exportación de datos fue deseleccionada.

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
