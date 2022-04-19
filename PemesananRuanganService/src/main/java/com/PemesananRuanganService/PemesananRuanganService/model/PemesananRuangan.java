package com.PemesananRuanganService.PemesananRuanganService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pemesananruangan")
public class PemesananRuangan {
	private int id_pemesananruangan, id_ruangan, nik;
	private String nama_pemesan,status_ruangan,lokasi_ruangan,tanggalpemesanan;
	
	public PemesananRuangan() {
		
	}
	
	public PemesananRuangan(int id_pemesananruangan, int id_ruangan, int nik, String nama_pemesan,
			String status_ruangan, String lokasi_ruangan, String tanggalpemesanan) {
		super();
		this.id_pemesananruangan = id_pemesananruangan;
		this.id_ruangan = id_ruangan;
		this.nik = nik;
		this.nama_pemesan = nama_pemesan;
		this.status_ruangan = status_ruangan;
		this.lokasi_ruangan = lokasi_ruangan;
		this.tanggalpemesanan = tanggalpemesanan;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_pemesananruangan() {
		return id_pemesananruangan;
	}

	public void setId_pemesananruangan(int id_pemesananruangan) {
		this.id_pemesananruangan = id_pemesananruangan;
	}

	public int getNik() {
		return nik;
	}

	public void setNik(int nik) {
		this.nik = nik;
	}

	public String getNama_pemesan() {
		return nama_pemesan;
	}

	public void setNama_pemesan(String nama_pemesan) {
		this.nama_pemesan = nama_pemesan;
	}

	public String getStatus_ruangan() {
		return status_ruangan;
	}

	public void setStatus_ruangan(String status_ruangan) {
		this.status_ruangan = status_ruangan;
	}

	public String getLokasi_ruangan() {
		return lokasi_ruangan;
	}

	public void setLokasi_ruangan(String lokasi_ruangan) {
		this.lokasi_ruangan = lokasi_ruangan;
	}

	public String getTanggalpemesanan() {
		return tanggalpemesanan;
	}

	public void setTanggalpemesanan(String tanggalpemesanan) {
		this.tanggalpemesanan = tanggalpemesanan;
	}

	public int getId_ruangan() {
		return id_ruangan;
	}

	public void setId_ruangan(int id_ruangan) {
		this.id_ruangan = id_ruangan;
	}	
}
