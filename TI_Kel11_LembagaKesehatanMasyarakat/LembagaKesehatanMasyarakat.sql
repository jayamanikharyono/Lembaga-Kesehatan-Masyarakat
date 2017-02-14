/*
SQLyog - Free MySQL GUI v5.0
Host - 5.5.5-10.1.13-MariaDB : Database - layanan_kesehatan_masyarakat
*********************************************************************
Server version : 5.5.5-10.1.13-MariaDB
*/


create database if not exists `layanan_kesehatan_masyarakat`;

USE `layanan_kesehatan_masyarakat`;

/*Table structure for table `dokter` */

DROP TABLE IF EXISTS `dokter`;

CREATE TABLE `dokter` (
  `iddDokter` int(20) NOT NULL AUTO_INCREMENT,
  `nama` varchar(20) DEFAULT NULL,
  `jenisKelamin` char(1) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `noTelp` int(20) DEFAULT NULL,
  `tugas` varchar(20) DEFAULT NULL,
  `ruangKerja` varchar(10) DEFAULT NULL,
  `tarif` int(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dokter` */

/*Table structure for table `faktur` */

DROP TABLE IF EXISTS `faktur`;

CREATE TABLE `faktur` (
  `idFaktur` int(20) NOT NULL,																																																																																																																					
  `hargaObat` int(20) DEFAULT NULL,
  `biayaDokter` int(20) DEFAULT NULL,
  `daftarIdObat` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`idFaktur`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `faktur` */

/*Table structure for table `masyarakat` */

DROP TABLE IF EXISTS `masyarakat`;

CREATE TABLE `pasien` (
  `idPasien` int(10) NOT NULL AUTO_INCREMENT,
  `namaPasien` varchar(20) DEFAULT NULL,
  `alamatPasien` varchar(20) DEFAULT NULL,
  `tanggalLahirPasien` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`idPasien`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `masyarakat` */

/*Table structure for table `penyakit` */

DROP TABLE IF EXISTS `penyakit`;

CREATE TABLE `penyakit` (
  `idPenyakit` int(20) NOT NULL AUTO_INCREMENT,
  `nama` varbinary(20) DEFAULT NULL,
  PRIMARY KEY (`idPenyakit`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `penyakit` */

/*Table structure for table `petugas` */

DROP TABLE IF EXISTS `petugas`;

CREATE TABLE `petugas` (
  `idPetugas` int(20) NOT NULL AUTO_INCREMENT,
  `namaPetugas` varchar(20) DEFAULT NULL,
  `emailpetugas` varchar(20) DEFAULT NULL,
  `nomorTelepon` int(20) DEFAULT NULL,
  PRIMARY KEY (`idPetugas`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `petugas` */
