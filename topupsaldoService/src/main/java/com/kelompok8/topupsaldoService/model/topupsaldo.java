package com.kelompok8.topupsaldoService.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "topupsaldo")
public class topupsaldo {
	private int id_topup, nik, saldo, saldo_topup;
	private String nama_lengkap, nomor_hp, email, password, role, status_topup, tanggal_topup;
	
	public topupsaldo() {
		super();
	}
	
	public topupsaldo(int id_topup, int nik, int saldo, int saldo_topup, String nama_lengkap, String nomor_hp,
			String email, String password, String role, String status_topup, String tanggal_topup) {
		super();
		this.id_topup = id_topup;
		this.nik = nik;
		this.saldo = saldo;
		this.saldo_topup = saldo_topup;
		this.nama_lengkap = nama_lengkap;
		this.nomor_hp = nomor_hp;
		this.email = email;
		this.password = password;
		this.role = role;
		this.status_topup = status_topup;
		this.tanggal_topup = tanggal_topup;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId_topup() {
		return id_topup;
	}

	public void setId_topup(int id_topup) {
		this.id_topup = id_topup;
	}

	public int getNik() {
		return nik;
	}

	public void setNik(int nik) {
		this.nik = nik;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo_topup() {
		return saldo_topup;
	}

	public void setSaldo_topup(int saldo_topup) {
		this.saldo_topup = saldo_topup;
	}

	public String getNama_lengkap() {
		return nama_lengkap;
	}

	public void setNama_lengkap(String nama_lengkap) {
		this.nama_lengkap = nama_lengkap;
	}

	public String getNomor_hp() {
		return nomor_hp;
	}

	public void setNomor_hp(String nomor_hp) {
		this.nomor_hp = nomor_hp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getStatus_topup() {
		return status_topup;
	}

	public void setStatus_topup(String status_topup) {
		this.status_topup = status_topup;
	}

	public String getTanggal_topup() {
		return tanggal_topup;
	}

	public void setTanggal_topup(String tanggal_topup) {
		this.tanggal_topup = tanggal_topup;
	}
	
	
}
