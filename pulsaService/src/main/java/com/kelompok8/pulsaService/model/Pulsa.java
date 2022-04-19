package com.kelompok8.pulsaService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pulsa")
public class Pulsa {
	private int id_pulsa;
	private String nama_produk;
	private int harga;
	
	public Pulsa() {
	}

	public Pulsa(int id_pulsa, String nama_produk, int harga) {
		super();
		this.id_pulsa = id_pulsa;
		this.nama_produk = nama_produk;
		this.harga = harga;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_pulsa() {
		return id_pulsa;
	}

	public void setId_pulsa(int id_pulsa) {
		this.id_pulsa = id_pulsa;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public int getHarga() {
		return harga;
	}

	public void setHarga(int harga) {
		this.harga = harga;
	}
	
	
}
