-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 23, 2021 at 03:25 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 7.3.26

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaeekelompok8`
--

-- --------------------------------------------------------

--
-- Table structure for table `pemesanankantin`
--

CREATE TABLE `pemesanankantin` (
  `id_pemesanankantin` int(11) NOT NULL,
  `nik` varchar(255) NOT NULL,
  `nama_pemesan` varchar(255) NOT NULL,
  `tanggalpemesanan` date NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `harga_produk` int(11) NOT NULL,
  `jumlah_produk` int(11) NOT NULL,
  `jenis_pembayaran` varchar(255) NOT NULL,
  `status_pembayaran` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemesanankantin`
--

INSERT INTO `pemesanankantin` (`id_pemesanankantin`, `nik`, `nama_pemesan`, `tanggalpemesanan`, `nama_produk`, `harga_produk`, `jumlah_produk`, `jenis_pembayaran`, `status_pembayaran`) VALUES
(34, '11319001', 'Dahut', '2021-12-20', 'Jus Jeruk', 7000, 2, 'Non-Tunai', 'Lunas'),
(35, '11319010', 'Elfrida Tampubolon', '2021-12-22', 'Jus Jeruk', 7000, 2, 'Tunai', 'Lunas'),
(36, '11319010', 'Elfrida Tampubolon', '2021-12-22', 'Jus Jeruk', 7000, 2, 'Non-Tunai', 'Lunas'),
(37, '11319001', 'Dahut', '2021-12-22', 'Mi Gomak', 20000, 1, 'Non-Tunai', 'Lunas'),
(38, '11319001', 'Dahut', '2021-12-22', 'Mi Gomak', 20000, 2, 'Non-Tunai', 'Lunas'),
(39, '11319010', 'Elfrida Tampubolon', '2021-12-22', 'Mi Gomak', 20000, 1, 'Non-Tunai', 'Lunas'),
(40, '11319010', 'Elfrida Tampubolon', '2021-12-22', 'Mi Gomak', 20000, 1, 'Non-Tunai', 'Lunas'),
(41, '11319010', 'Elfrida Tampubolon', '2021-12-22', 'Mi Gomak', 20000, 2, 'Non-Tunai', 'Belum Lunas'),
(42, '11319001', 'Dahut', '2021-12-22', 'Jus Jeruk', 8000, 23, 'Tunai', 'Belum Lunas'),
(43, '11319001', 'Dahut', '2021-12-22', 'Jus Jeruk', 8000, 2, 'Non-Tunai', 'Belum Lunas');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanankoperasi`
--

CREATE TABLE `pemesanankoperasi` (
  `id_pemesanankoperasi` int(11) NOT NULL,
  `nik` varchar(255) NOT NULL,
  `nama_pemesan` varchar(255) NOT NULL,
  `tanggalpemesanan` date NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `harga_produk` int(11) NOT NULL,
  `jumlah_produk` int(11) NOT NULL,
  `jenis_pembayaran` varchar(255) NOT NULL,
  `status_pembayaran` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemesanankoperasi`
--

INSERT INTO `pemesanankoperasi` (`id_pemesanankoperasi`, `nik`, `nama_pemesan`, `tanggalpemesanan`, `nama_produk`, `harga_produk`, `jumlah_produk`, `jenis_pembayaran`, `status_pembayaran`) VALUES
(17, '11319001', 'Dahut', '2021-12-20', 'Biskuat', 1000, 2, 'Non-Tunai', 'Lunas'),
(18, '11319001', 'Dahut', '2021-12-20', 'Biskuat', 1000, 2, 'Non-Tunai', 'Lunas'),
(19, '11319001', 'Dahut', '2021-12-20', 'Biskuat', 12212, 1, 'Tunai', 'Belum Lunas'),
(22, '11319010', 'Elfrida Tampubolon', '2021-12-22', 'Buku', 2000, 3, 'Tunai', 'Lunas'),
(23, '11319000', 'RAHUL STEPEN SINAGA', '2021-12-22', 'Buku', 2000, 5, 'Non-Tunai', 'Lunas'),
(24, '11319000', 'RAHUL STEPEN SINAGA', '2021-12-22', 'Biskuat', 1000, 5, 'Non-Tunai', 'Lunas'),
(25, '11319001', 'Dahut', '2021-12-22', 'Mi Gomak', 122222, 1, 'Non-Tunai', 'Belum Lunas');

-- --------------------------------------------------------

--
-- Table structure for table `pemesananpulsa`
--

CREATE TABLE `pemesananpulsa` (
  `id_pemesananpulsa` int(11) NOT NULL,
  `nik` varchar(255) NOT NULL,
  `nama_pemesan` varchar(255) NOT NULL,
  `nomor_hp` varchar(255) NOT NULL,
  `tanggalpemesanan` date NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `harga_produk` int(11) NOT NULL,
  `jenis_pembayaran` varchar(255) NOT NULL,
  `status_pembayaran` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemesananpulsa`
--

INSERT INTO `pemesananpulsa` (`id_pemesananpulsa`, `nik`, `nama_pemesan`, `nomor_hp`, `tanggalpemesanan`, `nama_produk`, `harga_produk`, `jenis_pembayaran`, `status_pembayaran`) VALUES
(4, '11319001', 'Dahut', '081269299176', '2021-12-20', 'Telkomsel 15000', 15000, 'Non-Tunai', 'Lunas'),
(6, '11319001', 'Dahut', '081269299176', '2021-12-20', 'Telkomsel 15000', 15000, 'Tunai', 'Lunas'),
(7, '11319001', 'Dahut', '081269299176', '2021-12-21', 'Telkomsel 75000', 75000, 'Non-Tunai', 'Lunas'),
(9, '11319001', 'Dahut', '081269299176', '2021-12-21', 'Telkomsel 15000', 15000, 'Tunai', 'Lunas'),
(11, '11319010', 'Elfrida Tampubolon', '081269299176', '2021-12-22', 'Telkomsel 15000', 15000, 'Non-Tunai', 'Lunas'),
(12, '11319111', 'Mukdin', '081234121234', '2021-12-22', 'Telkomsel 15000', 15000, 'Non-Tunai', 'Lunas'),
(13, '11319001', 'Dahut', '081269299176', '2021-12-22', 'Telkomsel 75000', 75000, 'Tunai', 'Belum Lunas'),
(14, '11319001', 'Dahut', '081269299176', '2021-12-22', 'Telkomsel 75000', 75000, 'Non-Tunai', 'Lunas'),
(15, '11319001', 'Dahut', '081269299176', '2021-12-22', 'Telkomsel 75000', 75000, 'Non-Tunai', 'Lunas'),
(16, '11319001', 'Dahut', '081269299176', '2021-12-22', 'Telkomsel 75000', 75000, 'Non-Tunai', 'Belum Lunas');

-- --------------------------------------------------------

--
-- Table structure for table `pemesananruangan`
--

CREATE TABLE `pemesananruangan` (
  `id_pemesananruangan` int(11) NOT NULL,
  `id_ruangan` int(11) NOT NULL,
  `nik` int(11) NOT NULL,
  `nama_pemesan` varchar(255) NOT NULL,
  `status_ruangan` varchar(255) NOT NULL,
  `lokasi_ruangan` varchar(255) NOT NULL,
  `tanggalpemesanan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemesananruangan`
--

INSERT INTO `pemesananruangan` (`id_pemesananruangan`, `id_ruangan`, `nik`, `nama_pemesan`, `status_ruangan`, `lokasi_ruangan`, `tanggalpemesanan`) VALUES
(1, 1, 11319001, 'Dahut', 'Tersedia', 'GD711', '2021-12-23'),
(3, 2, 11319001, 'Dahut', 'Tersedia', 'GD712', '2021-12-16'),
(5, 2, 11319001, 'Dahut', 'Tersedia', 'GD712', '2021-12-21'),
(6, 1, 11319001, 'Dahut', 'Tersedia', 'GD711', '2021-12-21'),
(7, 1, 11319001, 'Dahut', 'Tersedia', 'GD711', '2021-12-21'),
(8, 8, 11319001, 'Dahut', 'Tersedia', 'GD511', '2021-12-21'),
(9, 8, 11319001, 'Dahut', 'Tersedia', 'GD511', '2021-12-21'),
(10, 9, 11319001, 'Dahut', 'Tersedia', 'GD512', '2021-12-21'),
(11, 10, 11319001, 'Dahut', 'Tersedia', 'GD611', '2021-12-21'),
(12, 8, 11319001, 'Dahut', 'Tersedia', 'GD511', '2021-12-21'),
(13, 9, 11319001, 'Dahut', 'Selesai Digunakan', 'GD512', '2021-12-21'),
(14, 10, 11319000, 'RAHUL STEPEN SINAGA', 'Selesai Digunakan', 'GD611', '2021-12-21'),
(15, 11, 11319001, 'Dahut', 'Tersedia', 'GD612', '2021-12-21'),
(16, 2, 11319010, 'Elfrida Tampubolon', 'Tersedia', 'GD712', '2021-12-22'),
(17, 13, 11319010, 'Elfrida Tampubolon', 'Selesai Digunakan', 'GD512', '2021-12-22');

-- --------------------------------------------------------

--
-- Table structure for table `pemesanantempatduduk`
--

CREATE TABLE `pemesanantempatduduk` (
  `id_pemesanantempatduduk` int(11) NOT NULL,
  `id_tempatduduk` int(11) NOT NULL,
  `nik` int(11) NOT NULL,
  `nama_pemesan` varchar(255) NOT NULL,
  `nomor_tempatduduk` int(11) NOT NULL,
  `status_tempatduduk` varchar(255) NOT NULL,
  `tanggalpemesanan` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pemesanantempatduduk`
--

INSERT INTO `pemesanantempatduduk` (`id_pemesanantempatduduk`, `id_tempatduduk`, `nik`, `nama_pemesan`, `nomor_tempatduduk`, `status_tempatduduk`, `tanggalpemesanan`) VALUES
(1, 2, 11319000, 'RAHUL STEPEN SINAGA', 2, 'Selesai Digunakan', '2021-12-31'),
(3, 4, 11319001, 'Dahut', 4, 'Selesai Digunakan', '2021-12-30'),
(4, 2, 11319001, 'Dahut', 2, 'Tersedia', '2021-12-21'),
(5, 2, 11319001, 'Dahut', 2, 'Selesai Digunakan', '2021-12-21'),
(6, 3, 11319001, 'Dahut', 3, 'Selesai Digunakan', '2021-12-21'),
(7, 4, 11319001, 'Dahut', 4, 'Selesai Digunakan', '2021-12-21'),
(8, 7, 11319010, 'Elfrida Tampubolon', 5, 'Selesai Digunakan', '2021-12-22'),
(9, 7, 11319001, 'Dahut', 5, 'Selesai Digunakan', '2021-12-22');

-- --------------------------------------------------------

--
-- Table structure for table `pengantaranpaket`
--

CREATE TABLE `pengantaranpaket` (
  `id_paket` int(11) NOT NULL,
  `no_resipaket` varchar(255) NOT NULL,
  `nik` int(11) NOT NULL,
  `nama_penerima` varchar(255) NOT NULL,
  `nama_pengirim` varchar(255) NOT NULL,
  `nomor_telepon_pengirim` varchar(255) NOT NULL,
  `nomor_telepon_penerima` varchar(255) NOT NULL,
  `alamat_tujuan` varchar(255) NOT NULL,
  `alamat_pengirim` varchar(255) NOT NULL,
  `status_paket` varchar(255) NOT NULL,
  `tanggal_dikirim` date NOT NULL,
  `tanggal_diterima` date NOT NULL,
  `berat_paket` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pengantaranpaket`
--

INSERT INTO `pengantaranpaket` (`id_paket`, `no_resipaket`, `nik`, `nama_penerima`, `nama_pengirim`, `nomor_telepon_pengirim`, `nomor_telepon_penerima`, `alamat_tujuan`, `alamat_pengirim`, `status_paket`, `tanggal_dikirim`, `tanggal_diterima`, `berat_paket`) VALUES
(1, 'JO456787654', 11319001, 'Dahut', 'Asibo', '081212345678', '081269299176', 'Institut Teknologi Del', 'Narumonda', 'Sudah Diambil', '2021-12-16', '2021-12-31', '67'),
(2, 'js1234', 11319001, 'Dahut', 'Dani', '081212344567', '081269299176', 'Institut Teknologi Del', 'Narumonda', 'Sudah Diambil', '2021-12-31', '2021-12-21', '10 Kg'),
(3, 'js123456789', 11319010, 'Elfrida', 'Rahul', '081212344567', '081269299176', 'Institut Teknologi Del', 'Narumonda 2', 'Sudah Diambil', '2021-12-17', '2021-12-22', '1 kg'),
(4, 'js123123123', 11319010, 'Elfrida', 'Tuhan', '081212344567', '081269299176', 'Institut Teknologi Del', 'Narumonda 2', 'Sudah Diambil', '2021-12-17', '2021-12-22', '1000 kg');

-- --------------------------------------------------------

--
-- Table structure for table `pengguna`
--

CREATE TABLE `pengguna` (
  `nik` int(11) NOT NULL,
  `nama_lengkap` varchar(255) NOT NULL,
  `nomor_hp` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `saldo` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pengguna`
--

INSERT INTO `pengguna` (`nik`, `nama_lengkap`, `nomor_hp`, `email`, `password`, `role`, `saldo`) VALUES
(11319000, 'RAHUL STEPEN SINAGA', '0812345678901', 'awak@gmail.com', 'Akusangatganteng', 'Pengguna', 85000),
(11319001, 'Dahut', '081269299176', 'dahut@gmail.com', 'Akusangatganteng', 'Pengguna', 5000),
(11319002, 'Asibo', '081269299176', 'asibo@gmail.com', 'Akusangatganteng', 'Pengguna', 0),
(11319010, 'Elfrida Tampubolon', '081269299176', 'Elfrida@gmail.com', 'Akucantik', 'Pengguna', 60000),
(11319022, 'Loisek', '0812345678910', 'loise@gmail.com', 'Akusangatganteng', 'Admin', 70000),
(11319023, 'Rahul Stepen Sinaga', '081269299176', 'rahul.sinaga01@gmail.com', 'Akusangatganteng', 'Admin', 2000000),
(11319111, 'Mukdin', '081234121234', 'mukdinganteng@gmail.com', 'Akusangatganteng', 'Pengguna', 2500);

-- --------------------------------------------------------

--
-- Table structure for table `produkkantin`
--

CREATE TABLE `produkkantin` (
  `id_produk` int(11) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `jenis_produk` varchar(255) NOT NULL,
  `harga_produk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produkkantin`
--

INSERT INTO `produkkantin` (`id_produk`, `nama_produk`, `jenis_produk`, `harga_produk`) VALUES
(1, 'Mi Gomak', 'Makanan', 20000),
(4, 'Jus Jeruk', 'Minuman', 8000),
(5, 'Nasi Goreng', 'Makanan', 15000),
(6, 'Sup Buntut', 'Makanan', 1500);

-- --------------------------------------------------------

--
-- Table structure for table `produkkoperasi`
--

CREATE TABLE `produkkoperasi` (
  `id_produk` int(11) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `jenis_produk` varchar(255) NOT NULL,
  `harga_produk` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `produkkoperasi`
--

INSERT INTO `produkkoperasi` (`id_produk`, `nama_produk`, `jenis_produk`, `harga_produk`) VALUES
(1, 'Mi Gomak', 'Snack Makanan', 122222),
(2, 'Biskuat', 'Makanan', 1000),
(4, 'Biskuat', 'Snack Makanan', 12212),
(5, 'Pulpen', 'Perlengkapan', 2000),
(7, 'Buku', 'Perlengkapan', 2000);

-- --------------------------------------------------------

--
-- Table structure for table `pulsa`
--

CREATE TABLE `pulsa` (
  `id_pulsa` int(11) NOT NULL,
  `nama_produk` varchar(255) NOT NULL,
  `harga` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pulsa`
--

INSERT INTO `pulsa` (`id_pulsa`, `nama_produk`, `harga`) VALUES
(1, 'Telkomsel 75000', 75000),
(2, 'XL 75000', 75000),
(5, 'Telkomsel 15000', 15000);

-- --------------------------------------------------------

--
-- Table structure for table `ruangan`
--

CREATE TABLE `ruangan` (
  `id_ruangan` int(11) NOT NULL,
  `lokasi_ruangan` varchar(255) NOT NULL,
  `status_ruangan` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `ruangan`
--

INSERT INTO `ruangan` (`id_ruangan`, `lokasi_ruangan`, `status_ruangan`) VALUES
(1, 'GD711', 'Tersedia'),
(2, 'GD712', 'Tersedia'),
(7, 'GD713', 'Tersedia'),
(11, 'GD612', 'Tersedia'),
(12, 'GD511', 'Tersedia'),
(13, 'GD512', 'Tersedia'),
(14, 'GD611', 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `tempatduduk`
--

CREATE TABLE `tempatduduk` (
  `id_tempatduduk` int(11) NOT NULL,
  `nomor_tempatduduk` int(11) NOT NULL,
  `status_tempatduduk` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tempatduduk`
--

INSERT INTO `tempatduduk` (`id_tempatduduk`, `nomor_tempatduduk`, `status_tempatduduk`) VALUES
(1, 1, 'Tersedia'),
(2, 2, 'Tersedia'),
(3, 3, 'Tersedia'),
(4, 4, 'Tersedia'),
(7, 5, 'Tersedia');

-- --------------------------------------------------------

--
-- Table structure for table `topupsaldo`
--

CREATE TABLE `topupsaldo` (
  `id_topup` int(11) NOT NULL,
  `nik` int(11) NOT NULL,
  `nama_lengkap` varchar(255) NOT NULL,
  `nomor_hp` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL,
  `saldo` varchar(255) NOT NULL,
  `saldo_topup` varchar(255) NOT NULL,
  `tanggal_topup` date NOT NULL,
  `status_topup` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `topupsaldo`
--

INSERT INTO `topupsaldo` (`id_topup`, `nik`, `nama_lengkap`, `nomor_hp`, `email`, `password`, `role`, `saldo`, `saldo_topup`, `tanggal_topup`, `status_topup`) VALUES
(2, 11319001, 'Dahut', '081269299176', 'dahut@gmail.com', 'Akusangatganteng', 'Pengguna', '100000', '100000', '2021-12-22', 'Berhasil'),
(5, 11319001, 'Dahut', '081269299176', 'dahut@gmail.com', 'Akusangatganteng', 'Pengguna', '400000', '200000', '2021-12-22', 'Berhasil'),
(6, 11319001, 'Dahut', '081269299176', 'dahut@gmail.com', 'Akusangatganteng', 'Pengguna', '350000', '150000', '2021-12-22', 'Berhasil'),
(9, 11319001, 'Dahut', '081269299176', 'dahut@gmail.com', 'Akusangatganteng', 'Pengguna', '350000', '50000', '2021-12-22', 'Berhasil');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pemesanankantin`
--
ALTER TABLE `pemesanankantin`
  ADD PRIMARY KEY (`id_pemesanankantin`);

--
-- Indexes for table `pemesanankoperasi`
--
ALTER TABLE `pemesanankoperasi`
  ADD PRIMARY KEY (`id_pemesanankoperasi`);

--
-- Indexes for table `pemesananpulsa`
--
ALTER TABLE `pemesananpulsa`
  ADD PRIMARY KEY (`id_pemesananpulsa`);

--
-- Indexes for table `pemesananruangan`
--
ALTER TABLE `pemesananruangan`
  ADD PRIMARY KEY (`id_pemesananruangan`);

--
-- Indexes for table `pemesanantempatduduk`
--
ALTER TABLE `pemesanantempatduduk`
  ADD PRIMARY KEY (`id_pemesanantempatduduk`);

--
-- Indexes for table `pengantaranpaket`
--
ALTER TABLE `pengantaranpaket`
  ADD PRIMARY KEY (`id_paket`);

--
-- Indexes for table `pengguna`
--
ALTER TABLE `pengguna`
  ADD PRIMARY KEY (`nik`);

--
-- Indexes for table `produkkantin`
--
ALTER TABLE `produkkantin`
  ADD PRIMARY KEY (`id_produk`);

--
-- Indexes for table `produkkoperasi`
--
ALTER TABLE `produkkoperasi`
  ADD PRIMARY KEY (`id_produk`);

--
-- Indexes for table `pulsa`
--
ALTER TABLE `pulsa`
  ADD PRIMARY KEY (`id_pulsa`);

--
-- Indexes for table `ruangan`
--
ALTER TABLE `ruangan`
  ADD PRIMARY KEY (`id_ruangan`);

--
-- Indexes for table `tempatduduk`
--
ALTER TABLE `tempatduduk`
  ADD PRIMARY KEY (`id_tempatduduk`);

--
-- Indexes for table `topupsaldo`
--
ALTER TABLE `topupsaldo`
  ADD PRIMARY KEY (`id_topup`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pemesanankantin`
--
ALTER TABLE `pemesanankantin`
  MODIFY `id_pemesanankantin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=44;

--
-- AUTO_INCREMENT for table `pemesanankoperasi`
--
ALTER TABLE `pemesanankoperasi`
  MODIFY `id_pemesanankoperasi` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=26;

--
-- AUTO_INCREMENT for table `pemesananpulsa`
--
ALTER TABLE `pemesananpulsa`
  MODIFY `id_pemesananpulsa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `pemesananruangan`
--
ALTER TABLE `pemesananruangan`
  MODIFY `id_pemesananruangan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=18;

--
-- AUTO_INCREMENT for table `pemesanantempatduduk`
--
ALTER TABLE `pemesanantempatduduk`
  MODIFY `id_pemesanantempatduduk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT for table `pengantaranpaket`
--
ALTER TABLE `pengantaranpaket`
  MODIFY `id_paket` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT for table `produkkantin`
--
ALTER TABLE `produkkantin`
  MODIFY `id_produk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT for table `produkkoperasi`
--
ALTER TABLE `produkkoperasi`
  MODIFY `id_produk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `pulsa`
--
ALTER TABLE `pulsa`
  MODIFY `id_pulsa` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT for table `ruangan`
--
ALTER TABLE `ruangan`
  MODIFY `id_ruangan` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=15;

--
-- AUTO_INCREMENT for table `tempatduduk`
--
ALTER TABLE `tempatduduk`
  MODIFY `id_tempatduduk` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `topupsaldo`
--
ALTER TABLE `topupsaldo`
  MODIFY `id_topup` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
