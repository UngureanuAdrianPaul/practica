-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 16-01-2024 a las 12:25:03
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `prueba`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor`
--

CREATE TABLE `conductor` (
  `dni` int(11) NOT NULL,
  `permiso` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `conductor`
--

INSERT INTO `conductor` (`dni`, `permiso`, `nombre`) VALUES
(1, 1, 'Andres'),
(2, 2, 'Fran'),
(3, 3, 'Santiago'),
(4, 4, 'Jose Ramon'),
(5, 5, 'Juan Carlos');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `conductor_permiso`
--

CREATE TABLE `conductor_permiso` (
  `conductor` int(11) NOT NULL,
  `tipo_permiso` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `conductor_permiso`
--

INSERT INTO `conductor_permiso` (`conductor`, `tipo_permiso`) VALUES
(1, 'A'),
(1, 'B'),
(2, 'B'),
(3, 'A1'),
(4, 'A2'),
(5, 'B');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_permiso`
--

CREATE TABLE `tipo_permiso` (
  `tipo` char(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `tipo_permiso`
--

INSERT INTO `tipo_permiso` (`tipo`) VALUES
('A'),
('A1'),
('A2'),
('B'),
('B1'),
('B2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `matricula` char(7) NOT NULL,
  `bastidor` char(20) DEFAULT NULL,
  `marca` varchar(30) NOT NULL,
  `modelo` varchar(30) NOT NULL,
  `propietario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `vehiculo`
--

INSERT INTO `vehiculo` (`matricula`, `bastidor`, `marca`, `modelo`, `propietario`) VALUES
('1234abc', 'jdj', 'mercedes', 'benz', 1),
('4567abd', '3', 'Seat', 'Cordoba', 2),
('46djhy', 'hbw', 'seat', 'cupra', 2);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `conductor`
--
ALTER TABLE `conductor`
  ADD PRIMARY KEY (`dni`),
  ADD UNIQUE KEY `permiso` (`permiso`);

--
-- Indices de la tabla `conductor_permiso`
--
ALTER TABLE `conductor_permiso`
  ADD PRIMARY KEY (`conductor`,`tipo_permiso`),
  ADD KEY `fk_tipo_permiso` (`tipo_permiso`);

--
-- Indices de la tabla `tipo_permiso`
--
ALTER TABLE `tipo_permiso`
  ADD PRIMARY KEY (`tipo`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`matricula`),
  ADD UNIQUE KEY `bastidor` (`bastidor`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `conductor_permiso`
--
ALTER TABLE `conductor_permiso`
  ADD CONSTRAINT `fk_conductor` FOREIGN KEY (`conductor`) REFERENCES `conductor` (`dni`),
  ADD CONSTRAINT `fk_tipo_permiso` FOREIGN KEY (`tipo_permiso`) REFERENCES `tipo_permiso` (`tipo`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
