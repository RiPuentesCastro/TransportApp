-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-11-2022 a las 21:50:00
-- Versión del servidor: 10.4.25-MariaDB
-- Versión de PHP: 7.4.30

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `transportapp`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cities`
--

CREATE TABLE `cities` (
  `id_city` bigint(11) NOT NULL,
  `alfa-2` varchar(250) NOT NULL,
  `name` varchar(250) NOT NULL,
  `number` int(250) NOT NULL,
  `alfa-3` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `cities`
--

INSERT INTO `cities` (`id_city`, `alfa-2`, `name`, `number`, `alfa-3`) VALUES
(1, 'AD', 'Andorra', 20, 'AND'),
(2, 'AE', 'Emiratos Árabes Unidos', 784, 'ARE'),
(3, 'AF', 'Afganistán', 4, 'AFG'),
(4, 'AG', 'Antigua y Barbuda', 28, 'ATG'),
(5, 'AI', 'Anguila', 660, 'AIA'),
(6, 'AL', 'Albania', 8, 'ALB'),
(7, 'AM', 'Armenia', 51, 'ARM'),
(8, 'AN', 'Antillas Neerlandesas', 530, 'ANT'),
(9, 'AO', 'Angola', 24, 'AGO'),
(10, 'AQ', 'Antártida', 10, 'ATA'),
(11, 'AR', 'Argentina', 32, 'ARG'),
(12, 'AS', 'Samoa Americana', 16, 'ASM'),
(13, 'AT', 'Austria', 40, 'AUT'),
(14, 'AU', 'Australia', 36, 'AUS'),
(15, 'AW', 'Aruba', 533, 'ABW'),
(16, 'AX', 'Islas Áland', 248, 'ALA'),
(17, 'AZ', 'Azerbaiyán', 31, 'AZE'),
(18, 'BA', 'Bosnia y Herzegovina', 70, 'BIH'),
(19, 'BB', 'Barbados', 52, 'BRB'),
(20, 'BD', 'Bangladesh', 50, 'BGD'),
(21, 'BE', 'Bélgica', 56, 'BEL'),
(22, 'BF', 'Burkina Faso', 854, 'BFA'),
(23, 'BG', 'Bulgaria', 100, 'BGR'),
(24, 'BH', 'Bahréin', 48, 'BHR'),
(25, 'BI', 'Burundi', 108, 'BDI'),
(26, 'BJ', 'Benin', 204, 'BEN'),
(27, 'BL', 'San Bartolomé', 652, 'BLM'),
(28, 'BM', 'Bermudas', 60, 'BMU'),
(29, 'BN', 'Brunéi', 96, 'BRN'),
(30, 'BO', 'Bolivia', 68, 'BOL'),
(31, 'BR', 'Brasil', 76, 'BRA'),
(32, 'BS', 'Bahamas', 44, 'BHS'),
(33, 'BT', 'Bhután', 64, 'BTN'),
(34, 'BV', 'Isla Bouvet', 74, 'BVT'),
(35, 'BW', 'Botsuana', 72, 'BWA'),
(36, 'BY', 'Belarús', 112, 'BLR'),
(37, 'BZ', 'Belice', 84, 'BLZ'),
(38, 'CA', 'Canadá', 124, 'CAN'),
(39, 'CC', 'Islas Cocos', 166, 'CCK'),
(40, 'CF', 'República Centro-Africana', 140, 'CAF'),
(41, 'CG', 'Congo', 178, 'COG'),
(42, 'CH', 'Suiza', 756, 'CHE'),
(43, 'CI', 'Costa de Marfil', 384, 'CIV'),
(44, 'CK', 'Islas Cook', 184, 'COK'),
(45, 'CL', 'Chile', 152, 'CHL'),
(46, 'CM', 'Camerún', 120, 'CMR'),
(47, 'CN', 'China', 156, 'CHN'),
(48, 'CO', 'Colombia', 170, 'COL'),
(49, 'CR', 'Costa Rica', 188, 'CRI'),
(50, 'CU', 'Cuba', 192, 'CUB'),
(51, 'CV', 'Cabo Verde', 132, 'CPV'),
(52, 'CX', 'Islas Christmas', 162, 'CXR'),
(53, 'CY', 'Chipre', 196, 'CYP'),
(54, 'CZ', 'República Checa', 203, 'CZE'),
(55, 'DE', 'Alemania', 276, 'DEU'),
(56, 'DJ', 'Yibuti', 262, 'DJI'),
(57, 'DK', 'Dinamarca', 208, 'DNK'),
(58, 'DM', 'Domínica', 212, 'DMA'),
(59, 'DO', 'República Dominicana', 214, 'DOM'),
(60, 'DZ', 'Argel', 12, 'DZA'),
(61, 'EC', 'Ecuador', 218, 'ECU'),
(62, 'EE', 'Estonia', 233, 'EST'),
(63, 'EG', 'Egipto', 818, 'EGY'),
(64, 'EH', 'Sahara Occidental', 732, 'ESH'),
(65, 'ER', 'Eritrea', 232, 'ERI'),
(66, 'ES', 'España', 724, 'ESP'),
(67, 'ET', 'Etiopía', 231, 'ETH'),
(68, 'FI', 'Finlandia', 246, 'FIN'),
(69, 'FJ', 'Fiji', 242, 'FJI'),
(70, 'FK', 'Islas Malvinas', 238, 'KLK'),
(71, 'FM', 'Micronesia', 583, 'FSM'),
(72, 'FO', 'Islas Faroe', 234, 'FRO'),
(73, 'FR', 'Francia', 250, 'FRA'),
(74, 'GA', 'Gabón', 266, 'GAB'),
(75, 'GB', 'Reino Unido', 826, 'GBR'),
(76, 'GD', 'Granada', 308, 'GRD'),
(77, 'GE', 'Georgia', 268, 'GEO'),
(78, 'GF', 'Guayana Francesa', 254, 'GUF'),
(79, 'GG', 'Guernsey', 831, 'GGY'),
(80, 'GH', 'Ghana', 288, 'GHA'),
(81, 'GI', 'Gibraltar', 292, 'GIB'),
(82, 'GL', 'Groenlandia', 304, 'GRL'),
(83, 'GM', 'Gambia', 270, 'GMB'),
(84, 'GN', 'Guinea', 324, 'GIN'),
(85, 'GP', 'Guadalupe', 312, 'GLP'),
(86, 'GQ', 'Guinea Ecuatorial', 226, 'GNQ'),
(87, 'GR', 'Grecia', 300, 'GRC'),
(88, 'GS', 'Georgia del Sur e Islas Sandwich del Sur', 239, 'SGS'),
(89, 'GT', 'Guatemala', 320, 'GTM'),
(90, 'GU', 'Guam', 316, 'GUM'),
(91, 'GW', 'Guinea-Bissau', 624, 'GNB'),
(92, 'GY', 'Guayana', 328, 'GUY'),
(93, 'HK', 'Hong Kong', 344, 'HKG'),
(94, 'HM', 'Islas Heard y McDonald', 334, 'HMD'),
(95, 'HN', 'Honduras', 340, 'HND'),
(96, 'HR', 'Croacia', 191, 'HRV'),
(97, 'HT', 'Haití', 332, 'HTI'),
(98, 'HU', 'Hungría', 348, 'HUN'),
(99, 'ID', 'Indonesia', 360, 'IDN'),
(100, 'IE', 'Irlanda', 372, 'IRL'),
(101, 'IL', 'Israel', 376, 'ISR'),
(102, 'IM', 'Isla de Man', 833, 'IMN'),
(103, 'IN', 'India', 356, 'IND'),
(104, 'IO', 'Territorio Británico del Océano Índico', 86, 'IOT'),
(105, 'IQ', 'Irak', 368, 'IRQ'),
(106, 'IR', 'Irán', 364, 'IRN'),
(107, 'IS', 'Islandia', 352, 'ISL'),
(108, 'IT', 'Italia', 380, 'ITA'),
(109, 'JE', 'Jersey', 832, 'JEY'),
(110, 'JM', 'Jamaica', 388, 'JAM'),
(111, 'JO', 'Jordania', 400, 'JOR'),
(112, 'JP', 'Japón', 392, 'JPN'),
(113, 'KE', 'Kenia', 404, 'KEN'),
(114, 'KG', 'Kirguistán', 417, 'KGZ'),
(115, 'KH', 'Camboya', 116, 'KHM'),
(116, 'KI', 'Kiribati', 296, 'KIR'),
(117, 'KM', 'Comoros', 174, 'COM'),
(118, 'KN', 'San Cristóbal y Nieves', 659, 'KNA'),
(119, 'KP', 'Corea del Norte', 408, 'PRK'),
(120, 'KR', 'Corea del Sur', 410, 'KOR'),
(121, 'KW', 'Kuwait', 414, 'KWT'),
(122, 'KY', 'Islas Caimán', 136, 'CYM'),
(123, 'KZ', 'Kazajstán', 398, 'KAZ'),
(124, 'LA', 'Laos', 418, 'LAO'),
(125, 'LB', 'Líbano', 422, 'LBN'),
(126, 'LC', 'Santa Lucía', 662, 'LCA'),
(127, 'LI', 'Liechtenstein', 438, 'LIE'),
(128, 'LK', 'Sri Lanka', 144, 'LKA'),
(129, 'LR', 'Liberia', 430, 'LBR'),
(130, 'LS', 'Lesotho', 426, 'LSO'),
(131, 'LT', 'Lituania', 440, 'LTU'),
(132, 'LU', 'Luxemburgo', 442, 'LUX'),
(133, 'LV', 'Letonia', 428, 'LVA'),
(134, 'LY', 'Libia', 434, 'LBY'),
(135, 'MA', 'Marruecos', 504, 'MAR'),
(136, 'MC', 'Mónaco', 492, 'MCO'),
(137, 'MD', 'Moldova', 498, 'MDA'),
(138, 'ME', 'Montenegro', 499, 'MNE'),
(139, 'MG', 'Madagascar', 450, 'MDG'),
(140, 'MH', 'Islas Marshall', 584, 'MHL'),
(141, 'MK', 'Macedonia', 807, 'MKD'),
(142, 'ML', 'Mali', 466, 'MLI'),
(143, 'MM', 'Myanmar', 104, 'MMR'),
(144, 'MN', 'Mongolia', 496, 'MNG'),
(145, 'MO', 'Macao', 446, 'MAC'),
(146, 'MQ', 'Martinica', 474, 'MTQ'),
(147, 'MR', 'Mauritania', 478, 'MRT'),
(148, 'MS', 'Montserrat', 500, 'MSR'),
(149, 'MT', 'Malta', 470, 'MLT'),
(150, 'MU', 'Mauricio', 480, 'MUS'),
(151, 'MV', 'Maldivas', 462, 'MDV'),
(152, 'MW', 'Malawi', 454, 'MWI'),
(153, 'MX', 'México', 484, 'MEX'),
(154, 'MY', 'Malasia', 458, 'MYS'),
(155, 'MZ', 'Mozambique', 508, 'MOZ'),
(156, 'NA', 'Namibia', 516, 'NAM'),
(157, 'NC', 'Nueva Caledonia', 540, 'NCL'),
(158, 'NE', 'Níger', 562, 'NER'),
(159, 'NF', 'Islas Norkfolk', 574, 'NFK'),
(160, 'NG', 'Nigeria', 566, 'NGA'),
(161, 'NI', 'Nicaragua', 558, 'NIC'),
(162, 'NL', 'Países Bajos', 528, 'NLD'),
(163, 'NO', 'Noruega', 578, 'NOR'),
(164, 'NP', 'Nepal', 524, 'NPL'),
(165, 'NR', 'Nauru', 520, 'NRU'),
(166, 'NU', 'Niue', 570, 'NIU'),
(167, 'NZ', 'Nueva Zelanda', 554, 'NZL'),
(168, 'OM', 'Omán', 512, 'OMN'),
(169, 'PA', 'Panamá', 591, 'PAN'),
(170, 'PE', 'Perú', 604, 'PER'),
(171, 'PF', 'Polinesia Francesa', 258, 'PYF'),
(172, 'PG', 'Papúa Nueva Guinea', 598, 'PNG'),
(173, 'PH', 'Filipinas', 608, 'PHL'),
(174, 'PK', 'Pakistán', 586, 'PAK'),
(175, 'PL', 'Polonia', 616, 'POL'),
(176, 'PM', 'San Pedro y Miquelón', 666, 'SPM'),
(177, 'PN', 'Islas Pitcairn', 612, 'PCN'),
(178, 'PR', 'Puerto Rico', 630, 'PRI'),
(179, 'PS', 'Palestina', 275, 'PSE'),
(180, 'PT', 'Portugal', 620, 'PRT'),
(181, 'PW', 'Islas Palaos', 585, 'PLW'),
(182, 'PY', 'Paraguay', 600, 'PRY'),
(183, 'QA', 'Qatar', 634, 'QAT'),
(184, 'RE', 'Reunión', 638, 'REU'),
(185, 'RO', 'Rumanía', 642, 'ROU'),
(186, 'RS', 'Serbia y Montenegro', 688, 'SRB'),
(187, 'RU', 'Rusia', 643, 'RUS'),
(188, 'RW', 'Ruanda', 646, 'RWA'),
(189, 'SA', 'Arabia Saudita', 682, 'SAU'),
(190, 'SB', 'Islas Solomón', 90, 'SLB'),
(191, 'SC', 'Seychelles', 690, 'SYC'),
(192, 'SD', 'Sudán', 736, 'SDN'),
(193, 'SE', 'Suecia', 752, 'SWE'),
(194, 'SG', 'Singapur', 702, 'SGP'),
(195, 'SH', 'Santa Elena', 654, 'SHN'),
(196, 'SI', 'Eslovenia', 705, 'SVN'),
(197, 'SJ', 'Islas Svalbard y Jan Mayen', 744, 'SJM'),
(198, 'SK', 'Eslovaquia', 703, 'SVK'),
(199, 'SL', 'Sierra Leona', 694, 'SLE'),
(200, 'SM', 'San Marino', 674, 'SMR'),
(201, 'SN', 'Senegal', 686, 'SEN'),
(202, 'SO', 'Somalia', 706, 'SOM'),
(203, 'SR', 'Surinam', 740, 'SUR'),
(204, 'ST', 'Santo Tomé y Príncipe', 678, 'STP'),
(205, 'SV', 'El Salvador', 222, 'SLV'),
(206, 'SY', 'Siria', 760, 'SYR'),
(207, 'SZ', 'Suazilandia', 748, 'SWZ'),
(208, 'TC', 'Islas Turcas y Caicos', 796, 'TCA'),
(209, 'TD', 'Chad', 148, 'TCD'),
(210, 'TF', 'Territorios Australes Franceses', 260, 'ATF'),
(211, 'TG', 'Togo', 768, 'TGO'),
(212, 'TH', 'Tailandia', 764, 'THA'),
(213, 'TH', 'Tanzania', 834, 'TZA'),
(214, 'TJ', 'Tayikistán', 762, 'TJK'),
(215, 'TK', 'Tokelau', 772, 'TKL'),
(216, 'TL', 'Timor-Leste', 626, 'TLS'),
(217, 'TM', 'Turkmenistán', 795, 'TKM'),
(218, 'TN', 'Túnez', 788, 'TUN'),
(219, 'TO', 'Tonga', 776, 'TON'),
(220, 'TR', 'Turquía', 792, 'TUR'),
(221, 'TT', 'Trinidad y Tobago', 780, 'TTO'),
(222, 'TV', 'Tuvalu', 798, 'TUV'),
(223, 'TW', 'Taiwán', 158, 'TWN'),
(224, 'UA', 'Ucrania', 804, 'UKR'),
(225, 'UG', 'Uganda', 800, 'UGA'),
(226, 'US', 'Estados Unidos de América', 840, 'USA'),
(227, 'UY', 'Uruguay', 858, 'URY'),
(228, 'UZ', 'Uzbekistán', 860, 'UZB'),
(229, 'VA', 'Ciudad del Vaticano', 336, 'VAT'),
(230, 'VC', 'San Vicente y las Granadinas', 670, 'VCT'),
(231, 'VE', 'Venezuela', 862, 'VEN'),
(232, 'VG', 'Islas Vírgenes Británicas', 92, 'VGB'),
(233, 'VI', 'Islas Vírgenes de los Estados Unidos de América', 850, 'VIR'),
(234, 'VN', 'Vietnam', 704, 'VNM'),
(235, 'VU', 'Vanuatu', 548, 'VUT'),
(236, 'WF', 'Wallis y Futuna', 876, 'WLF'),
(237, 'WS', 'Samoa', 882, 'WSM'),
(238, 'YE', 'Yemen', 887, 'YEM'),
(239, 'YT', 'Mayotte', 175, 'MYT'),
(240, 'ZA', 'Sudáfrica', 710, 'ZAF');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `companies`
--

CREATE TABLE `companies` (
  `id_company` bigint(11) NOT NULL,
  `name` varchar(250) NOT NULL,
  `address` varchar(250) NOT NULL,
  `city` varchar(205) DEFAULT NULL,
  `credit_score` int(11) DEFAULT NULL,
  `days_to_pay` int(11) DEFAULT NULL,
  `pick_up_date` int(11) DEFAULT NULL,
  `email` varchar(250) NOT NULL,
  `user_id` bigint(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `companies`
--

INSERT INTO `companies` (`id_company`, `name`, `address`, `city`, `credit_score`, `days_to_pay`, `pick_up_date`, `email`, `user_id`) VALUES
(8, 'Empresa 1', 'Dirección 1', 'Bogotá', 0, 0, 0, 'empresa1@gmail.com', 7),
(10, 'Empresa 2', 'Dirección 2', 'Bogotá', 0, 0, 0, 'empresa2@gmail.com', 7),
(11, 'Empresa 3', 'Dirección 3', 'Bogotá', 0, 0, 0, 'empresa3@gmail.com', 7);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `loads`
--

CREATE TABLE `loads` (
  `id_load` bigint(11) NOT NULL,
  `origin` varchar(250) NOT NULL,
  `destination` varchar(250) NOT NULL,
  `date_from` date NOT NULL,
  `date_to` date NOT NULL,
  `full_partial` varchar(250) NOT NULL,
  `truck_type` varchar(250) NOT NULL,
  `length` int(11) NOT NULL,
  `weight` int(11) NOT NULL,
  `number_contact` varchar(250) NOT NULL,
  `comments` varchar(500) NOT NULL,
  `type_loads` varchar(250) NOT NULL,
  `value_kilogram` double NOT NULL,
  `rating` double DEFAULT NULL,
  `status` varchar(250) NOT NULL,
  `user_id` bigint(11) NOT NULL,
  `lat_origin` float NOT NULL,
  `lng_origin` float NOT NULL,
  `address_components_origin` varchar(1000) DEFAULT NULL,
  `lat_destination` float NOT NULL,
  `lng_destination` float NOT NULL,
  `address_components_destination` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `loads`
--

INSERT INTO `loads` (`id_load`, `origin`, `destination`, `date_from`, `date_to`, `full_partial`, `truck_type`, `length`, `weight`, `number_contact`, `comments`, `type_loads`, `value_kilogram`, `rating`, `status`, `user_id`, `lat_origin`, `lng_origin`, `address_components_origin`, `lat_destination`, `lng_destination`, `address_components_destination`) VALUES
(22, 'Mexico Cityyy', 'Guadalajar', '2023-11-03', '2023-11-19', 'ful', 'boxtruck', 10, 15, '', 'comentario de prueb', 'carga de prueb', 5, 1, 'Disponible', 7, 19.432, -99.133, 'Mexico City, CDMX, Mexic', 20.659, -103.3, 'Guadalajara, Jalisco, Mexic'),
(23, 'León', 'Guadalajara', '2023-11-19', '2023-11-28', 'full', 'truck', 100, 150, '', 'prueba truck post', 'carga de prueba', 50, 0, 'Disponible', 7, 21.125, -101.686, 'León, Guanajuato, Mexico', 20.6597, -103.35, 'Guadalajara, Jalisco, Mexico'),
(25, 'Mexico City', 'Guadalajar', '2023-11-03', '2023-11-19', 'ful', 'boxtruck', 10, 15, '', 'comentario de prueb', 'carga de prueb', 5, 1, 'Disponible', 7, 19.432, -99.133, 'Mexico City, CDMX, Mexic', 20.659, -103.3, 'Guadalajara, Jalisco, Mexic'),
(28, 'Bogotá', 'Cali', '2023-07-01', '2023-07-15', 'partial', 'semitrailer', 150, 200, '', 'prueba', 'prueba', 150, 0, 'Disponible', 7, 0, 0, NULL, 0, 0, 'Cali, Valle del Cauca, Colombia'),
(30, 'Bogotá', 'Cali', '2023-07-09', '2023-07-16', 'full', 'truck', 100, 50, '', 'na', 'na', 150, 0, 'Disponible', 7, 4.71099, -74.0721, 'Bogotá, Bogota, Colombia', 3.45165, -76.532, 'Cali, Valle del Cauca, Colombia'),
(31, 'Bogotá', 'Cali', '2023-07-02', '2023-07-16', 'partial', 'boxtruck', 100, 50, '', 'prueba', 'prueba', 150, 0, 'Disponible', 7, 4.71099, -74.0721, 'Bogotá, Bogota, Colombia', 3.45165, -76.532, 'Cali, Valle del Cauca, Colombia'),
(33, 'Bogotá', 'Mexico City', '2023-07-02', '2023-07-08', 'partial', 'semitrailer', 100, 100, '', 'prueba', 'prueba', 150, 0, 'Disponible', 7, 4.71099, -74.0721, 'Bogotá, Bogota, Colombia', 19.4326, -99.1332, 'Mexico City, CDMX, Mexico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `messages`
--

CREATE TABLE `messages` (
  `id_message` bigint(11) NOT NULL,
  `date_send` date NOT NULL,
  `content` varchar(1000) NOT NULL,
  `user_to` bigint(11) NOT NULL,
  `user_from` bigint(11) NOT NULL,
  `status` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `messages`
--

INSERT INTO `messages` (`id_message`, `date_send`, `content`, `user_to`, `user_from`, `status`) VALUES
(2, '2022-11-07', 'Este es un mensaje de prueba desde postmann', 7, 8, 'Enviadoo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `notifications`
--

CREATE TABLE `notifications` (
  `id_notifications` bigint(11) NOT NULL,
  `type_notification` varchar(250) NOT NULL,
  `user_show` bigint(20) NOT NULL,
  `message` varchar(500) NOT NULL,
  `type_users` varchar(250) NOT NULL,
  `date_notification` date NOT NULL,
  `status` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `notifications`
--

INSERT INTO `notifications` (`id_notifications`, `type_notification`, `user_show`, `message`, `type_users`, `date_notification`, `status`) VALUES
(2, 'danger', 7, 'mensaje de prueba aplicación', 'admin', '2023-10-14', 'Disponible'),
(3, 'warning', 7, 'mensaje de prueba aplicación', 'admin', '2023-10-27', 'Disponible');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `trucks`
--

CREATE TABLE `trucks` (
  `id_truck` bigint(11) NOT NULL COMMENT ' ',
  `user_id` bigint(11) NOT NULL,
  `image_truck` varchar(500) NOT NULL,
  `truck_type` varchar(250) NOT NULL,
  `full_partial` varchar(250) NOT NULL,
  `length` int(11) NOT NULL,
  `weight` int(11) NOT NULL,
  `origin` varchar(250) DEFAULT NULL,
  `destination` varchar(250) DEFAULT NULL,
  `date_from` date NOT NULL,
  `date_to` date NOT NULL,
  `numbers_contact` varchar(500) NOT NULL,
  `comments` varchar(1000) NOT NULL,
  `lat_origin` float NOT NULL,
  `lng_origin` float NOT NULL,
  `address_components_origin` varchar(1000) DEFAULT NULL,
  `lat_destination` float NOT NULL,
  `lng_destination` float NOT NULL,
  `address_components_destination` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `trucks`
--

INSERT INTO `trucks` (`id_truck`, `user_id`, `image_truck`, `truck_type`, `full_partial`, `length`, `weight`, `origin`, `destination`, `date_from`, `date_to`, `numbers_contact`, `comments`, `lat_origin`, `lng_origin`, `address_components_origin`, `lat_destination`, `lng_destination`, `address_components_destination`) VALUES
(9, 7, '', 'boxtruck', 'full', 100, 150, 'Guadalajara', 'Puebla', '2023-10-27', '2023-10-26', '', 'comentario de prueba', 20.6597, 20.6597, 'Guadalajara, Jalisco, Mexico', 19.0414, 19.0414, 'Puebla, Mexico'),
(10, 7, '', 'semitrailer', 'full', 100, 150, 'Mexico City', 'Jalisco del Refugio', '2023-10-29', '2023-10-28', '', 'comentario de prueba', 19.4326, 19.4326, 'Mexico City, CDMX, Mexico', 21.9911, 21.9911, '46235 Jalisco del Refugio, Jal., Mexico');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `users`
--

CREATE TABLE `users` (
  `id_user` bigint(11) NOT NULL,
  `username` varchar(250) NOT NULL,
  `password` varchar(250) NOT NULL,
  `type` varchar(250) NOT NULL,
  `name` varchar(250) NOT NULL,
  `lastname` varchar(250) NOT NULL,
  `register_date` date DEFAULT NULL,
  `profile_image` longtext NOT NULL,
  `country` varchar(2) NOT NULL,
  `way_to_pay` varchar(250) DEFAULT NULL,
  `last_login` datetime DEFAULT NULL,
  `stat` bigint(11) NOT NULL,
  `token` varchar(500) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `users`
--

INSERT INTO `users` (`id_user`, `username`, `password`, `type`, `name`, `lastname`, `register_date`, `profile_image`, `country`, `way_to_pay`, `last_login`, `stat`, `token`) VALUES
(7, 'administrator', 'Admin/*/*1234', 'ADMINISTRATOR', 'Administrador', 'Administrador', '2022-11-07', 'No Image', 'CO', NULL, NULL, 1, 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJUb2dvTWV4U29mdEpXVCIsInN1YiI6InJwdWVudGVzMTUwNCIsImF1dGhvcml0aWVzIjpbIkFETUlOSVNUUkFUT1IiLCJUUlVDS0VSIiwiVFJVQ0siLCJDTElFTlQiXSwiaWF0IjoxNjQ5MDUxNTQyfQ.jfI7zUpPLZfV4JwBYEKjOckpzot0Z1QBEZ0ybvOBWcWbT_i0QvapKAIcR7tVkFve_FKHMaQJpdVLA7WWqbCNXw'),
(8, 'Public', 'TogoMex2022*', 'PUBLIC', 'Public User', 'Public User', '2022-11-07', 'No Image', 'MX', NULL, NULL, 1, 'Bearer eyJhbGciOiJIUzUxMiJ9.eyJqdGkiOiJUb2dvTWV4U29mdEpXVCIsInN1YiI6IlB1YmxpYyIsImF1dGhvcml0aWVzIjpbIlBVQkxJQyJdLCJpYXQiOjE2NDkwNTIzNjd9.cSyh6gLXXmPKBtv6DN6yX68nC0MywA5zGxZsBdLzG5LkebqVdMcIi3o5RCFedYqfu5NyeNitnnQPqueu8_4Z-g');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `cities`
--
ALTER TABLE `cities`
  ADD PRIMARY KEY (`id_city`);

--
-- Indices de la tabla `companies`
--
ALTER TABLE `companies`
  ADD PRIMARY KEY (`id_company`);

--
-- Indices de la tabla `loads`
--
ALTER TABLE `loads`
  ADD PRIMARY KEY (`id_load`);

--
-- Indices de la tabla `messages`
--
ALTER TABLE `messages`
  ADD PRIMARY KEY (`id_message`);

--
-- Indices de la tabla `notifications`
--
ALTER TABLE `notifications`
  ADD PRIMARY KEY (`id_notifications`);

--
-- Indices de la tabla `trucks`
--
ALTER TABLE `trucks`
  ADD PRIMARY KEY (`id_truck`);

--
-- Indices de la tabla `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `cities`
--
ALTER TABLE `cities`
  MODIFY `id_city` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=241;

--
-- AUTO_INCREMENT de la tabla `companies`
--
ALTER TABLE `companies`
  MODIFY `id_company` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `loads`
--
ALTER TABLE `loads`
  MODIFY `id_load` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `messages`
--
ALTER TABLE `messages`
  MODIFY `id_message` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `notifications`
--
ALTER TABLE `notifications`
  MODIFY `id_notifications` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `trucks`
--
ALTER TABLE `trucks`
  MODIFY `id_truck` bigint(11) NOT NULL AUTO_INCREMENT COMMENT ' ', AUTO_INCREMENT=13;

--
-- AUTO_INCREMENT de la tabla `users`
--
ALTER TABLE `users`
  MODIFY `id_user` bigint(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
