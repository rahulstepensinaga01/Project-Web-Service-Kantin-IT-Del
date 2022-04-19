package com.kelompok8.ruanganService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ruangan")
public class Ruangan {
	private int id_ruangan;
	private String lokasi_ruangan;
	private String status_ruangan;
	
	public Ruangan() {
	}

	public Ruangan(int id_ruangan, String lokasi_ruangan, String status_ruangan) {
		super();
		this.id_ruangan = id_ruangan;
		this.lokasi_ruangan = lokasi_ruangan;
		this.status_ruangan = status_ruangan;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_ruangan() {
		return id_ruangan;
	}

	public void setId_ruangan(int id_ruangan) {
		this.id_ruangan = id_ruangan;
	}

	public String getLokasi_ruangan() {
		return lokasi_ruangan;
	}

	public void setLokasi_ruangan(String lokasi_ruangan) {
		this.lokasi_ruangan = lokasi_ruangan;
	}

	public String getStatus_ruangan() {
		return status_ruangan;
	}

	public void setStatus_ruangan(String status_ruangan) {
		this.status_ruangan = status_ruangan;
	}
	
	
	
}
