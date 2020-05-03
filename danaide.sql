-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         8.0.20 - MySQL Community Server - GPL
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.0.0.5919
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Volcando estructura de base de datos para prueba_danaide
CREATE DATABASE IF NOT EXISTS `prueba_danaide` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `prueba_danaide`;

-- Volcando datos para la tabla prueba_danaide.cliente: ~3 rows (aproximadamente)
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
INSERT IGNORE INTO `cliente` (`id`, `dni`, `nombre`, `apellido`, `direccion`, `tipo_cliente`) VALUES
	(1, 95938753, 'FRANCISCO', 'CASTAÑEDA', 'LANUS', 0),
	(2, 95938754, 'PEDRO', 'MARIÑA', 'CAPITAL', 1),
	(3, 95938752, 'RAUL', 'LOPEZ', 'CAPITAL', 1);
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;

-- Volcando datos para la tabla prueba_danaide.detalle_venta: ~6 rows (aproximadamente)
/*!40000 ALTER TABLE `detalle_venta` DISABLE KEYS */;
INSERT IGNORE INTO `detalle_venta` (`id`, `id_venta`, `id_producto`, `fecha_venta`) VALUES
	(1, 1, 3, '2020-01-02'),
	(2, 1, 4, '2020-01-02'),
	(3, 2, 5, '2020-01-03'),
	(4, 2, 4, '2020-01-03'),
	(5, 3, 1, '2020-02-05'),
	(6, 3, 1, '2020-02-05'),
	(7, 4, 2, '2020-01-02');
/*!40000 ALTER TABLE `detalle_venta` ENABLE KEYS */;

-- Volcando datos para la tabla prueba_danaide.producto: ~5 rows (aproximadamente)
/*!40000 ALTER TABLE `producto` DISABLE KEYS */;
INSERT IGNORE INTO `producto` (`id`, `cod_producto`, `descripcion`, `cantidad`, `precio`) VALUES
	(1, 14451840, 'Laptop Dell', 5, 100000),
	(2, 34575122, 'Laptop Toshiba', 5, 200000),
	(3, 475487454, 'Laptop Acer', 5, 300000),
	(4, 4575754, 'Laptop Asus', 10, 150000),
	(5, 48745754, 'Laptop Lenovo', 5, 250000);
/*!40000 ALTER TABLE `producto` ENABLE KEYS */;

-- Volcando datos para la tabla prueba_danaide.promociones: ~2 rows (aproximadamente)
/*!40000 ALTER TABLE `promociones` DISABLE KEYS */;
INSERT IGNORE INTO `promociones` (`id`, `fecha`) VALUES
	(1, '2020-03-02'),
	(2, '2020-04-02'),
	(3, '2020-05-02');
/*!40000 ALTER TABLE `promociones` ENABLE KEYS */;

-- Volcando datos para la tabla prueba_danaide.venta: ~0 rows (aproximadamente)
/*!40000 ALTER TABLE `venta` DISABLE KEYS */;
INSERT IGNORE INTO `venta` (`id`, `monto_pagado_neto`, `monto_pagado_bruto`, `id_cliente`, `fecha_compra`) VALUES
	(1, 800000, 800000, 1, '2020-03-02'),
	(2, 900000, 900000, 1, '2020-04-03'),
	(3, 600000, 800000, 2, '2020-05-02'),
	(4, 500000, 700000, 1, '2020-01-02'),
	(5, 500000, 700000, 1, '2020-03-02');
/*!40000 ALTER TABLE `venta` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
