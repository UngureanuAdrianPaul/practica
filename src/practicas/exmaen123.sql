-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-12-2023 a las 11:40:36
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
-- Base de datos: `examen_bd23`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `alumno`
--

CREATE TABLE `alumno` (
  `nombre` varchar(50) NOT NULL,
  `ciclo` varchar(3) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `nota_media` int(11) DEFAULT NULL,
  `id_alum` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `alumno`
--

INSERT INTO `alumno` (`nombre`, `ciclo`, `edad`, `nota_media`, `id_alum`) VALUES
('Jon Zamora', 'DAM', 32, 6, 1),
('Jorge Moreno', 'DAW', 19, 7, 2),
('Santiago', 'SMR', 20, 9, 3),
('Pepe', NULL, NULL, NULL, 4);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `asignatura`
--

CREATE TABLE `asignatura` (
  `cod_asig` int(11) NOT NULL,
  `curso` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `asignatura`
--

INSERT INTO `asignatura` (`cod_asig`, `curso`, `nombre`) VALUES
(1, 2, 'Bases de Datos'),
(2, 1, 'Entornos'),
(3, 1, 'Marcas'),
(4, 1, 'Sistemas');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `seccion`
--

CREATE TABLE `seccion` (
  `id_alum` int(11) NOT NULL,
  `cod_asig` int(11) NOT NULL,
  `centro` varchar(50) NOT NULL,
  `ciudad` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `seccion`
--

INSERT INTO `seccion` (`id_alum`, `cod_asig`, `centro`, `ciudad`) VALUES
(1, 1, 'Afuera', 'Madrid'),
(1, 2, 'Cesur', 'Malaga'),
(1, 3, 'Medac', 'Irun'),
(1, 3, 'Medac', 'Malaga'),
(2, 1, 'Cesur', 'Malaga'),
(2, 2, 'Cesur', 'Malaga'),
(2, 4, 'Cesur', 'Malaga'),
(3, 3, 'Afuera', 'Madrid'),
(3, 4, 'Medac', 'Irun'),
(3, 4, 'Medac', 'Malaga');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `alumno`
--
ALTER TABLE `alumno`
  ADD PRIMARY KEY (`id_alum`);

--
-- Indices de la tabla `asignatura`
--
ALTER TABLE `asignatura`
  ADD PRIMARY KEY (`cod_asig`);

--
-- Indices de la tabla `seccion`
--
ALTER TABLE `seccion`
  ADD PRIMARY KEY (`id_alum`,`cod_asig`,`centro`,`ciudad`),
  ADD KEY `fk_asig` (`cod_asig`);

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `seccion`
--
ALTER TABLE `seccion`
  ADD CONSTRAINT `fk_alumno` FOREIGN KEY (`id_alum`) REFERENCES `alumno` (`id_alum`),
  ADD CONSTRAINT `fk_asig` FOREIGN KEY (`cod_asig`) REFERENCES `asignatura` (`cod_asig`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
