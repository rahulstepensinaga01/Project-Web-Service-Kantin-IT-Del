package com.kelompok8.pemesanantempatdudukService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pemesanantempatduduk")
public class PemesananTempatDuduk {
	private int id_pemesanantempatduduk, id_tempatduduk;
	private String nik;
	private String nama_pemesan;
	private int nomor_tempatduduk;
	private String status_tempatduduk;
	private String tanggalpemesanan;
	
	public PemesananTempatDuduk() {
	}
	
	public PemesananTempatDuduk(int id_pemesanantempatduduk, int id_tempatduduk, String nik, String nama_pemesan,
			int nomor_tempatduduk, String status_tempatduduk, String tanggalpemesanan) {
		super();
		this.id_pemesanantempatduduk = id_pemesanantempatduduk;
		this.id_tempatduduk = id_tempatduduk;
		this.nik = nik;
		this.nama_pemesan = nama_pemesan;
		this.nomor_tempatduduk = nomor_tempatduduk;
		this.status_tempatduduk = status_tempatduduk;
		this.tanggalpemesanan = tanggalpemesanan;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_pemesanantempatduduk() {
		return id_pemesanantempatduduk;
	}

	public void setId_pemesanantempatduduk(int id_pemesanantempatduduk) {
		this.id_pemesanantempatduduk = id_pemesanantempatduduk;
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

	public int getNomor_tempatduduk() {
		return nomor_tempatduduk;
	}

	public void setNomor_tempatduduk(int nomor_tempatduduk) {
		this.nomor_tempatduduk = nomor_tempatduduk;
	}

	public String getStatus_tempatduduk() {
		return status_tempatduduk;
	}

	public void setStatus_tempatduduk(String status_tempatduduk) {
		this.status_tempatduduk = status_tempatduduk;
	}

	public String getTanggalpemesanan() {
		return tanggalpemesanan;
	}

	public void setTanggalpemesanan(String tanggalpemesanan) {
		this.tanggalpemesanan = tanggalpemesanan;
	}

	public int getId_tempatduduk() {
		return id_tempatduduk;
	}

	public void setId_tempatduduk(int id_tempatduduk) {
		this.id_tempatduduk = id_tempatduduk;
	}
	
}
