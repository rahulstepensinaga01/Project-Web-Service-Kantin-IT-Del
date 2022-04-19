package com.pemesananpulsa.pemesananpulsaService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pemesananpulsa")
public class PemesananPulsa {
	private int id_pemesananpulsa, harga_produk;
	private String nik;
	private String nama_pemesan;
	private String tanggalpemesanan;
	private String nama_produk;
	private String nomor_hp;
	private String jenis_pembayaran;
	private String status_pembayaran;
	
	public PemesananPulsa() {
	}
	
	public PemesananPulsa(int id_pemesananpulsa, int harga_produk, String nik, String nama_pemesan,
			String tanggalpemesanan, String nama_produk, String nomor_hp, String jenis_pembayaran,
			String status_pembayaran) {
		super();
		this.id_pemesananpulsa = id_pemesananpulsa;
		this.harga_produk = harga_produk;
		this.nik = nik;
		this.nama_pemesan = nama_pemesan;
		this.tanggalpemesanan = tanggalpemesanan;
		this.nama_produk = nama_produk;
		this.nomor_hp = nomor_hp;
		this.jenis_pembayaran = jenis_pembayaran;
		this.status_pembayaran = status_pembayaran;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_pemesananpulsa() {
		return id_pemesananpulsa;
	}

	public void setId_pemesananpulsa(int id_pemesananpulsa) {
		this.id_pemesananpulsa = id_pemesananpulsa;
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

	public String getNomor_hp() {
		return nomor_hp;
	}

	public void setNomor_hp(String nomor_hp) {
		this.nomor_hp = nomor_hp;
	}
		
}
