package com.kelompok8.tempatdudukService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tempatduduk")
public class TempatDuduk {
	private int id_tempatduduk;
	private int nomor_tempatduduk;
	private String status_tempatduduk;
	
	public TempatDuduk() {
	}

	public TempatDuduk(int id_tempatduduk, int nomor_tempatduduk, String status_tempatduduk) {
		super();
		this.id_tempatduduk = id_tempatduduk;
		this.nomor_tempatduduk = nomor_tempatduduk;
		this.status_tempatduduk = status_tempatduduk;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_tempatduduk() {
		return id_tempatduduk;
	}

	public void setId_tempatduduk(int id_tempatduduk) {
		this.id_tempatduduk = id_tempatduduk;
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
	
	
}
