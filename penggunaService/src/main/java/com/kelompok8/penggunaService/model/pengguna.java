package com.kelompok8.penggunaService.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pengguna")
public class pengguna {
	private int nik, saldo;
	private String nama_lengkap, nomor_hp, email, password, role;
	
	public pengguna() {
	}

	public pengguna(int nik, int saldo, String nama_lengkap, String nomor_hp, String email, String password,
			String role) {
		super();
		this.nik = nik;
		this.saldo = saldo;
		this.nama_lengkap = nama_lengkap;
		this.nomor_hp = nomor_hp;
		this.email = email;
		this.password = password;
		this.role = role;
	}

	@Id
	public int getNik() {
		return nik;
	}

	public void setNik(int nik) {
		this.nik = nik;
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

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
}
