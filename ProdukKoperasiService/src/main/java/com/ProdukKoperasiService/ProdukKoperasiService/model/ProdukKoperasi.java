package com.ProdukKoperasiService.ProdukKoperasiService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produkkoperasi")
public class ProdukKoperasi {
	private int id_produk,harga_produk;
	private String nama_produk,jenis_produk;
	
	public ProdukKoperasi() {
		
	}
	
	public ProdukKoperasi(int id_produk, int harga_produk, String nama_produk, String jenis_produk) {
		super();
		this.id_produk = id_produk;
		this.harga_produk = harga_produk;
		this.nama_produk = nama_produk;
		this.jenis_produk = jenis_produk;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_produk() {
		return id_produk;
	}

	public void setId_produk(int id_produk) {
		this.id_produk = id_produk;
	}

	public int getHarga_produk() {
		return harga_produk;
	}

	public void setHarga_produk(int harga_produk) {
		this.harga_produk = harga_produk;
	}

	public String getNama_produk() {
		return nama_produk;
	}

	public void setNama_produk(String nama_produk) {
		this.nama_produk = nama_produk;
	}

	public String getJenis_produk() {
		return jenis_produk;
	}

	public void setJenis_produk(String jenis_produk) {
		this.jenis_produk = jenis_produk;
	}
	
	
	
	
	

}
