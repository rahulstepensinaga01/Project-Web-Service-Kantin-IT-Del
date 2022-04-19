package com.pemesanankantin.pemesananKantin.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pemesanankantin")
public class PemesananKantin {
	private int id_pemesanankantin;
	private String nik;
	private String nama_pemesan;
	private String tanggalpemesanan;
	private String nama_produk;
	private int jumlah_produk;
	private int harga_produk;
	private String jenis_pembayaran;
	private String status_pembayaran;
	
	public PemesananKantin() {
	
	}

	public PemesananKantin(int id_pemesanankantin, String nik, String nama_pemesan, String tanggalpemesanan,
			String nama_produk, int jumlah_produk, int harga_produk, String jenis_pembayaran,
			String status_pembayaran) {
		super();
		this.id_pemesanankantin = id_pemesanankantin;
		this.nik = nik;
		this.nama_pemesan = nama_pemesan;
		this.tanggalpemesanan = tanggalpemesanan;
		this.nama_produk = nama_produk;
		this.jumlah_produk = jumlah_produk;
		this.harga_produk = harga_produk;
		this.jenis_pembayaran = jenis_pembayaran;
		this.status_pembayaran = status_pembayaran;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_pemesanankantin() {
		return id_pemesanankantin;
	}

	public void setId_pemesanankantin(int id_pemesanankantin) {
		this.id_pemesanankantin = id_pemesanankantin;
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

	public int getJumlah_produk() {
		return jumlah_produk;
	}

	public void setJumlah_produk(int jumlah_produk) {
		this.jumlah_produk = jumlah_produk;
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
