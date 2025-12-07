-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2025 at 12:52 AM
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
-- Database: `db_universitas`
--

-- --------------------------------------------------------

--
-- Table structure for table `idfaculty`
--

CREATE TABLE `idfaculty` (
  `IDFaculty` varchar(5) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Gender` enum('Male','Female') NOT NULL,
  `Salary` int(8) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `Grade` char(1) NOT NULL,
  `Designation` varchar(30) NOT NULL,
  `IDDepartment` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `idfaculty`
--
ALTER TABLE `idfaculty`
  ADD PRIMARY KEY (`IDFaculty`),
  ADD KEY `IDDepartment` (`IDDepartment`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `idfaculty`
--
ALTER TABLE `idfaculty`
  ADD CONSTRAINT `idfaculty_ibfk_1` FOREIGN KEY (`IDDepartment`) REFERENCES `department` (`IDDepartment`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
