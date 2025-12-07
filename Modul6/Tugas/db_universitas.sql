-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 07, 2025 at 12:43 AM
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
-- Table structure for table `address`
--

CREATE TABLE `address` (
  `IDAddress` int(5) NOT NULL,
  `HoueNumber` int(3) NOT NULL,
  `StreetNumber` int(3) NOT NULL,
  `Town` varchar(30) NOT NULL,
  `City` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `course`
--

CREATE TABLE `course` (
  `IDCourse` varchar(5) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Code` char(6) NOT NULL,
  `IDDepartment` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `department`
--

CREATE TABLE `department` (
  `IDDepartment` varchar(5) NOT NULL,
  `Name` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

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

-- --------------------------------------------------------

--
-- Table structure for table `researchproject`
--

CREATE TABLE `researchproject` (
  `IDProject` varchar(5) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Area` varchar(30) NOT NULL,
  `duration` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `student`
--

CREATE TABLE `student` (
  `IDStudent` char(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `PhoneNumber` varchar(13) NOT NULL,
  `DateOfBirth` date NOT NULL,
  `Gender` enum('Male','Female') NOT NULL,
  `IDAddress` int(5) NOT NULL,
  `IDDepartment` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `studies`
--

CREATE TABLE `studies` (
  `IDStudent` char(10) NOT NULL,
  `IDCourse` varchar(5) NOT NULL,
  `Semeter` int(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `teaches`
--

CREATE TABLE `teaches` (
  `IDFaculty` varchar(5) NOT NULL,
  `IDCourse` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `works`
--

CREATE TABLE `works` (
  `IDFaculty` varchar(5) NOT NULL,
  `IDProject` varchar(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `address`
--
ALTER TABLE `address`
  ADD PRIMARY KEY (`IDAddress`);

--
-- Indexes for table `course`
--
ALTER TABLE `course`
  ADD PRIMARY KEY (`IDCourse`),
  ADD KEY `IDDepartment` (`IDDepartment`);

--
-- Indexes for table `department`
--
ALTER TABLE `department`
  ADD PRIMARY KEY (`IDDepartment`);

--
-- Indexes for table `idfaculty`
--
ALTER TABLE `idfaculty`
  ADD PRIMARY KEY (`IDFaculty`),
  ADD KEY `IDDepartment` (`IDDepartment`);

--
-- Indexes for table `researchproject`
--
ALTER TABLE `researchproject`
  ADD PRIMARY KEY (`IDProject`);

--
-- Indexes for table `student`
--
ALTER TABLE `student`
  ADD PRIMARY KEY (`IDStudent`),
  ADD KEY `IDAddress` (`IDAddress`,`IDDepartment`),
  ADD KEY `IDDepartment` (`IDDepartment`);

--
-- Indexes for table `studies`
--
ALTER TABLE `studies`
  ADD PRIMARY KEY (`IDStudent`,`IDCourse`),
  ADD KEY `IDCourse` (`IDCourse`);

--
-- Indexes for table `teaches`
--
ALTER TABLE `teaches`
  ADD PRIMARY KEY (`IDFaculty`,`IDCourse`),
  ADD KEY `IDCourse` (`IDCourse`);

--
-- Indexes for table `works`
--
ALTER TABLE `works`
  ADD PRIMARY KEY (`IDFaculty`,`IDProject`),
  ADD KEY `IDProject` (`IDProject`);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `course`
--
ALTER TABLE `course`
  ADD CONSTRAINT `course_ibfk_1` FOREIGN KEY (`IDDepartment`) REFERENCES `department` (`IDDepartment`);

--
-- Constraints for table `idfaculty`
--
ALTER TABLE `idfaculty`
  ADD CONSTRAINT `idfaculty_ibfk_1` FOREIGN KEY (`IDDepartment`) REFERENCES `department` (`IDDepartment`);

--
-- Constraints for table `student`
--
ALTER TABLE `student`
  ADD CONSTRAINT `student_ibfk_1` FOREIGN KEY (`IDAddress`) REFERENCES `address` (`IDAddress`),
  ADD CONSTRAINT `student_ibfk_2` FOREIGN KEY (`IDDepartment`) REFERENCES `department` (`IDDepartment`);

--
-- Constraints for table `studies`
--
ALTER TABLE `studies`
  ADD CONSTRAINT `studies_ibfk_1` FOREIGN KEY (`IDStudent`) REFERENCES `student` (`IDStudent`),
  ADD CONSTRAINT `studies_ibfk_2` FOREIGN KEY (`IDCourse`) REFERENCES `course` (`IDCourse`);

--
-- Constraints for table `teaches`
--
ALTER TABLE `teaches`
  ADD CONSTRAINT `teaches_ibfk_1` FOREIGN KEY (`IDFaculty`) REFERENCES `idfaculty` (`IDFaculty`),
  ADD CONSTRAINT `teaches_ibfk_2` FOREIGN KEY (`IDCourse`) REFERENCES `course` (`IDCourse`);

--
-- Constraints for table `works`
--
ALTER TABLE `works`
  ADD CONSTRAINT `works_ibfk_1` FOREIGN KEY (`IDFaculty`) REFERENCES `idfaculty` (`IDFaculty`),
  ADD CONSTRAINT `works_ibfk_2` FOREIGN KEY (`IDProject`) REFERENCES `researchproject` (`IDProject`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
