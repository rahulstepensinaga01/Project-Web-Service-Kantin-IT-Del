package com.kelompok8.pemesanankoperasiService.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pemesanankoperasi")
public class pemesanankoperasi {
	private int id_pemesanankoperasi, jumlah_produk, harga_produk;
	private String nik, nama_pemesan, nama_produk, jenis_pembayaran, status_pembayaran, tanggalpemesanan;
	
	public pemesanankoperasi() {
		super();
	}

	public pemesanankoperasi(int id_pemesanankoperasi, int jumlah_produk, int harga_produk, String nik,
			String nama_pemesan, String tanggalpemesanan, String nama_produk, String jenis_pembayaran,
			String status_pembayaran) {
		super();
		this.id_pemesanankoperasi = id_pemesanankoperasi;
		this.jumlah_produk = jumlah_produk;
		this.harga_produk = harga_produk;
		this.nik = nik;
		this.nama_pemesan = nama_pemesan;
		this.tanggalpemesanan = tanggalpemesanan;
		this.nama_produk = nama_produk;
		this.jenis_pembayaran = jenis_pembayaran;
		this.status_pembayaran = status_pembayaran;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_pemesanankoperasi() {
		return id_pemesanankoperasi;
	}

	public void setId_pemesanankoperasi(int id_pemesanankoperasi) {
		this.id_pemesanankoperasi = id_pemesanankoperasi;
	}

	public int getJumlah_produk() {
		return jumlah_produk;
	}

	public void setJumlah_produk(int jumlah_produk) {
		this.jumlah_produk = jumlah_produk;
	}

	public String getNik() {
		return nik;
	}

	public void setNik(String nik) {
		this.nik = nik;
	}

	public String getNama_pemesan() {
		return nama_pemesan;
	}

	public void setNama_pemesan(String nama_pemesan) {
		this.nama_pemesan = nama_pemesan;
	}

	public String getTanggalpemesanan() {
		return tanggalpemesanan;
	}

	public void setTanggalpemesanan(String tanggalpemesanan) {
		this.tanggalpemesanan = tanggalpemesanan;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public String getJenis_pembayaran() {
		return jenis_pembayaran;
	}

	public void setJenis_pembayaran(String jenis_pembayaran) {
		this.jenis_pembayaran = jenis_pembayaran;
	}

	public String getStatus_pembayaran() {
		return status_pembayaran;
	}

	public void setStatus_pembayaran(String status_pembayaran) {
		this.status_pembayaran = status_pembayaran;
	}

	public int getHarga_produk() {
		return harga_produk;
	}

	public void setHarga_produk(int harga_produk) {
		this.harga_produk = harga_produk;
	}	
}
