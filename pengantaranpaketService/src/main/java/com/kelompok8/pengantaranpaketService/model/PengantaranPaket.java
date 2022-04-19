package com.kelompok8.pengantaranpaketService.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pengantaranpaket")

public class PengantaranPaket {
	private int id_paket;
	private int nik;
	private String no_resipaket;
	private String nama_penerima;
	private String nama_pengirim;
	private String nomor_telepon_pengirim;
	private String nomor_telepon_penerima;
	private String alamat_tujuan;
	private String alamat_pengirim;
	private String status_paket;
	private String tanggal_dikirim;
	private String tanggal_diterima;
	private String berat_paket;
	
	public PengantaranPaket() {
		
	}
	
	public PengantaranPaket(int id_paket, int nik, String no_resipaket, String nama_penerima, String nama_pengirim,
			String nomor_telepon_pengirim, String nomor_telepon_penerima, String alamat_tujuan, String alamat_pengirim,
			String status_paket, String tanggal_dikirim, String tanggal_diterima, String berat_paket) {
		super();
		this.id_paket = id_paket;
		this.nik = nik;
		this.no_resipaket = no_resipaket;
		this.nama_penerima = nama_penerima;
		this.nama_pengirim = nama_pengirim;
		this.nomor_telepon_pengirim = nomor_telepon_pengirim;
		this.nomor_telepon_penerima = nomor_telepon_penerima;
		this.alamat_tujuan = alamat_tujuan;
		this.alamat_pengirim = alamat_pengirim;
		this.status_paket = status_paket;
		this.tanggal_dikirim = tanggal_dikirim;
		this.tanggal_diterima = tanggal_diterima;
		this.berat_paket = berat_paket;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_paket() {
		return id_paket;
	}

	public void setId_paket(int id_paket) {
		this.id_paket = id_paket;
	}

	public String getNo_resipaket() {
		return no_resipaket;
	}

	public void setNo_resipaket(String no_resipaket) {
		this.no_resipaket = no_resipaket;
	}

	public String getNama_penerima() {
		return nama_penerima;
	}

	public void setNama_penerima(String nama_penerima) {
		this.nama_penerima = nama_penerima;
	}

	public String getNama_pengirim() {
		return nama_pengirim;
	}

	public void setNama_pengirim(String nama_pengirim) {
		this.nama_pengirim = nama_pengirim;
	}

	public String getNomor_telepon_pengirim() {
		return nomor_telepon_pengirim;
	}

	public void setNomor_telepon_pengirim(String nomor_telepon_pengirim) {
		this.nomor_telepon_pengirim = nomor_telepon_pengirim;
	}

	public String getNomor_telepon_penerima() {
		return nomor_telepon_penerima;
	}

	public void setNomor_telepon_penerima(String nomor_telepon_penerima) {
		this.nomor_telepon_penerima = nomor_telepon_penerima;
	}

	public String getAlamat_tujuan() {
		return alamat_tujuan;
	}

	public void setAlamat_tujuan(String alamat_tujuan) {
		this.alamat_tujuan = alamat_tujuan;
	}

	public String getAlamat_pengirim() {
		return alamat_pengirim;
	}

	public void setAlamat_pengirim(String alamat_pengirim) {
		this.alamat_pengirim = alamat_pengirim;
	}

	public String getStatus_paket() {
		return status_paket;
	}

	public void setStatus_paket(String status_paket) {
		this.status_paket = status_paket;
	}
	
	public String getBerat_paket() {
		return berat_paket;
	}

	public void setBerat_paket(String berat_paket) {
		this.berat_paket = berat_paket;
	}

	public String getTanggal_dikirim() {
		return tanggal_dikirim;
	}

	public void setTanggal_dikirim(String tanggal_dikirim) {
		this.tanggal_dikirim = tanggal_dikirim;
	}

	public String getTanggal_diterima() {
		return tanggal_diterima;
	}

	public void setTanggal_diterima(String tanggal_diterima) {
		this.tanggal_diterima = tanggal_diterima;
	}

	public int getNik() {
		return nik;
	}

	public void setNik(int nik) {
		this.nik = nik;
	}
		
}
