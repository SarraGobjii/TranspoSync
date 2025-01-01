-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 31, 2024 at 01:57 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `transposync`
--

-- --------------------------------------------------------

--
-- Table structure for table `itineraire`
--

CREATE TABLE `itineraire` (
  `heure_debut` time(6) DEFAULT NULL,
  `heure_fin` time(6) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `trajet` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `itineraire`
--

INSERT INTO `itineraire` (`heure_debut`, `heure_fin`, `id`, `trajet`) VALUES
(NULL, NULL, 1, NULL);

-- --------------------------------------------------------

--
-- Table structure for table `itineraire_vehicules`
--

CREATE TABLE `itineraire_vehicules` (
  `itineraire_id` bigint(20) NOT NULL,
  `vehicules_id_vehicule` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `notification`
--

CREATE TABLE `notification` (
  `idn` bigint(20) NOT NULL,
  `passenger_id` bigint(20) DEFAULT NULL,
  `reservationn_idr` bigint(20) DEFAULT NULL,
  `message` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `passenger`
--

CREATE TABLE `passenger` (
  `id` bigint(20) NOT NULL,
  `phone_number` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `payment`
--

CREATE TABLE `payment` (
  `amount` double DEFAULT NULL,
  `idp` bigint(20) NOT NULL,
  `reservation_idr` bigint(20) DEFAULT NULL,
  `pay_mode` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `accessibility` bit(1) NOT NULL,
  `seat_number` int(11) NOT NULL,
  `idr` bigint(20) NOT NULL,
  `passenger_id` bigint(20) DEFAULT NULL,
  `vehicule_id_vehicule` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `station`
--

CREATE TABLE `station` (
  `id_station` bigint(20) NOT NULL,
  `localisation` varchar(255) DEFAULT NULL,
  `nom` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `station_vehicules_passantes`
--

CREATE TABLE `station_vehicules_passantes` (
  `station_id_station` bigint(20) NOT NULL,
  `vehicules_passantes_id_vehicule` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `vehicule`
--

CREATE TABLE `vehicule` (
  `id_vehicule` bigint(20) NOT NULL,
  `itineraire_id` bigint(20) DEFAULT NULL,
  `station_arrivee_id_station` bigint(20) DEFAULT NULL,
  `station_depart_id_station` bigint(20) DEFAULT NULL,
  `localisation` varchar(255) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `vehicule_stations`
--

CREATE TABLE `vehicule_stations` (
  `stations_id_station` bigint(20) NOT NULL,
  `vehicule_id_vehicule` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `itineraire`
--
ALTER TABLE `itineraire`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `itineraire_vehicules`
--
ALTER TABLE `itineraire_vehicules`
  ADD UNIQUE KEY `UK2mcoaratentuouanaf2kvpwgf` (`vehicules_id_vehicule`),
  ADD KEY `FKd3dbc9wfd36x1txv601urx8ii` (`itineraire_id`);

--
-- Indexes for table `notification`
--
ALTER TABLE `notification`
  ADD PRIMARY KEY (`idn`),
  ADD UNIQUE KEY `UK8luee2alup4ke9hf1dl7vqkcy` (`reservationn_idr`),
  ADD KEY `FKpovs7edcu8sdx7q2e4ebiu8mt` (`passenger_id`);

--
-- Indexes for table `passenger`
--
ALTER TABLE `passenger`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `payment`
--
ALTER TABLE `payment`
  ADD PRIMARY KEY (`idp`),
  ADD UNIQUE KEY `UKcof4axx5pf0tnyw22vrg7n855` (`reservation_idr`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`idr`),
  ADD KEY `FK3biwcv0wn3a1lp86g0ecsbnvd` (`passenger_id`),
  ADD KEY `FK8j6c6w5yeu8g1fcn6b9q5ctke` (`vehicule_id_vehicule`);

--
-- Indexes for table `station`
--
ALTER TABLE `station`
  ADD PRIMARY KEY (`id_station`);

--
-- Indexes for table `station_vehicules_passantes`
--
ALTER TABLE `station_vehicules_passantes`
  ADD KEY `FKta5r6bxr4t9bpdpscl208el7e` (`vehicules_passantes_id_vehicule`),
  ADD KEY `FKomdf706y28eaf7j999xrwohtj` (`station_id_station`);

--
-- Indexes for table `vehicule`
--
ALTER TABLE `vehicule`
  ADD PRIMARY KEY (`id_vehicule`),
  ADD KEY `FKilydj5xg2jnn2limuu6jb88d0` (`station_arrivee_id_station`),
  ADD KEY `FKipl3tiqce9bybm7lxcm66oh69` (`station_depart_id_station`),
  ADD KEY `FKinu0jxecfavp3fgq107gu1u8q` (`itineraire_id`);

--
-- Indexes for table `vehicule_stations`
--
ALTER TABLE `vehicule_stations`
  ADD KEY `FKko37vbrbtdmaeydwfki1q0rnb` (`stations_id_station`),
  ADD KEY `FKi9q9bw7t8hi9ae1ykscg3uhoc` (`vehicule_id_vehicule`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `itineraire`
--
ALTER TABLE `itineraire`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT for table `notification`
--
ALTER TABLE `notification`
  MODIFY `idn` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `passenger`
--
ALTER TABLE `passenger`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `payment`
--
ALTER TABLE `payment`
  MODIFY `idp` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `idr` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `station`
--
ALTER TABLE `station`
  MODIFY `id_station` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `vehicule`
--
ALTER TABLE `vehicule`
  MODIFY `id_vehicule` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `itineraire_vehicules`
--
ALTER TABLE `itineraire_vehicules`
  ADD CONSTRAINT `FKd3dbc9wfd36x1txv601urx8ii` FOREIGN KEY (`itineraire_id`) REFERENCES `itineraire` (`id`),
  ADD CONSTRAINT `FKkyn9dk7e499jj4gck56ym4pqu` FOREIGN KEY (`vehicules_id_vehicule`) REFERENCES `vehicule` (`id_vehicule`);

--
-- Constraints for table `notification`
--
ALTER TABLE `notification`
  ADD CONSTRAINT `FKl655p37kbidup5cqx59h2ul5s` FOREIGN KEY (`reservationn_idr`) REFERENCES `reservation` (`idr`),
  ADD CONSTRAINT `FKpovs7edcu8sdx7q2e4ebiu8mt` FOREIGN KEY (`passenger_id`) REFERENCES `passenger` (`id`);

--
-- Constraints for table `payment`
--
ALTER TABLE `payment`
  ADD CONSTRAINT `FKbx94t31t7k4ir1spc2jppn655` FOREIGN KEY (`reservation_idr`) REFERENCES `reservation` (`idr`);

--
-- Constraints for table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `FK3biwcv0wn3a1lp86g0ecsbnvd` FOREIGN KEY (`passenger_id`) REFERENCES `passenger` (`id`),
  ADD CONSTRAINT `FK8j6c6w5yeu8g1fcn6b9q5ctke` FOREIGN KEY (`vehicule_id_vehicule`) REFERENCES `vehicule` (`id_vehicule`);

--
-- Constraints for table `station_vehicules_passantes`
--
ALTER TABLE `station_vehicules_passantes`
  ADD CONSTRAINT `FKomdf706y28eaf7j999xrwohtj` FOREIGN KEY (`station_id_station`) REFERENCES `station` (`id_station`),
  ADD CONSTRAINT `FKta5r6bxr4t9bpdpscl208el7e` FOREIGN KEY (`vehicules_passantes_id_vehicule`) REFERENCES `vehicule` (`id_vehicule`);

--
-- Constraints for table `vehicule`
--
ALTER TABLE `vehicule`
  ADD CONSTRAINT `FKilydj5xg2jnn2limuu6jb88d0` FOREIGN KEY (`station_arrivee_id_station`) REFERENCES `station` (`id_station`),
  ADD CONSTRAINT `FKinu0jxecfavp3fgq107gu1u8q` FOREIGN KEY (`itineraire_id`) REFERENCES `itineraire` (`id`),
  ADD CONSTRAINT `FKipl3tiqce9bybm7lxcm66oh69` FOREIGN KEY (`station_depart_id_station`) REFERENCES `station` (`id_station`);

--
-- Constraints for table `vehicule_stations`
--
ALTER TABLE `vehicule_stations`
  ADD CONSTRAINT `FKi9q9bw7t8hi9ae1ykscg3uhoc` FOREIGN KEY (`vehicule_id_vehicule`) REFERENCES `vehicule` (`id_vehicule`),
  ADD CONSTRAINT `FKko37vbrbtdmaeydwfki1q0rnb` FOREIGN KEY (`stations_id_station`) REFERENCES `station` (`id_station`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
