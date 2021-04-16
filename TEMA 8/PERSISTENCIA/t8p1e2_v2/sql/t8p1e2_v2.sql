-- phpMyAdmin SQL Dump
-- version 4.7.5
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 16-04-2021 a las 07:48:26
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
-- Base de datos: `t8p1e2_v2`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `acontecimiento`
--

CREATE TABLE `acontecimiento` (
  `nombre` varchar(50) NOT NULL,
  `lugar` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `horaI` time(5) NOT NULL,
  `horaF` time(5) NOT NULL,
  `aforo` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asistentes`
--

CREATE TABLE `asistentes` (
  `dni` varchar(9) NOT NULL,
  `nif` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empresa`
--

CREATE TABLE `empresa` (
  `nif` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `razonSocial` varchar(50) NOT NULL,
  `cnae` int(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `persona`
--

CREATE TABLE `persona` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` varchar(9) NOT NULL,
  `nif_empresa` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `acontecimiento`
--
ALTER TABLE `acontecimiento`
  ADD PRIMARY KEY (`nombre`);

--
-- Indices de la tabla `asistentes`
--
ALTER TABLE `asistentes`
  ADD PRIMARY KEY (`dni`,`nif`);

--
-- Indices de la tabla `empresa`
--
ALTER TABLE `empresa`
  ADD PRIMARY KEY (`nif`);

--
-- Indices de la tabla `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`dni`),
  ADD KEY `nif_empresa` (`nif_empresa`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `persona`
--
ALTER TABLE `persona`
  ADD CONSTRAINT `persona_ibfk_1` FOREIGN KEY (`nif_empresa`) REFERENCES `empresa` (`nif`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
