-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 02-03-2021 a las 12:40:42
-- Versión del servidor: 5.6.34
-- Versión de PHP: 5.6.32

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bdejemplouno`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tpersonas`
--

CREATE TABLE `tpersonas` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tpersonas`
--

INSERT INTO `tpersonas` (`dni`, `nombre`) VALUES
('11111111A', 'Pepe JUAN');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tvehiculos`
--

CREATE TABLE `tvehiculos` (
  `matricula` varchar(8) NOT NULL,
  `modelo` varchar(50) NOT NULL,
  `dni` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `tvehiculos`
--

INSERT INTO `tvehiculos` (`matricula`, `modelo`, `dni`) VALUES
('1111-AAA', 'AUDI', '11111111A');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tpersonas`
--
ALTER TABLE `tpersonas`
  ADD PRIMARY KEY (`dni`);

--
-- Indices de la tabla `tvehiculos`
--
ALTER TABLE `tvehiculos`
  ADD PRIMARY KEY (`matricula`),
  ADD KEY `dni` (`dni`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tvehiculos`
--
ALTER TABLE `tvehiculos`
  ADD CONSTRAINT `tvehiculos_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `tpersonas` (`dni`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
