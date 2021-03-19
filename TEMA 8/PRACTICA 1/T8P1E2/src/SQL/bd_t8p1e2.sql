
SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


CREATE TABLE `asistentes` (
  `id_evento` int(5) NOT NULL,
  `dni` varchar(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `empresa` (
  `nif` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `evento` (
  `id` int(5) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `lugar` varchar(50) NOT NULL,
  `fecha` date NOT NULL,
  `h_inicio` time NOT NULL,
  `h_final` time NOT NULL,
  `aforo` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

INSERT INTO `evento` (`id`, `nombre`, `lugar`, `fecha`, `h_inicio`, `h_final`, `aforo`) VALUES
(1, 'Boda', 'Bilbao', '2031-05-02', '20:00:00', '01:00:00', 30);


CREATE TABLE `persona` (
  `dni` varchar(9) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` int(9) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


ALTER TABLE `asistentes`
  ADD PRIMARY KEY (`id_evento`,`dni`),
  ADD KEY `dni` (`dni`);


ALTER TABLE `empresa`
  ADD PRIMARY KEY (`nif`);


ALTER TABLE `evento`
  ADD PRIMARY KEY (`id`);

ALTER TABLE `persona`
  ADD PRIMARY KEY (`dni`);

TO_INCREMENT de la tabla `evento`

ALTER TABLE `evento`
  MODIFY `id` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

ALTER TABLE `asistentes`
  ADD CONSTRAINT `asistentes_ibfk_1` FOREIGN KEY (`dni`) REFERENCES `persona` (`dni`),
  ADD CONSTRAINT `asistentes_ibfk_2` FOREIGN KEY (`id_evento`) REFERENCES `evento` (`id`);
COMMIT;
