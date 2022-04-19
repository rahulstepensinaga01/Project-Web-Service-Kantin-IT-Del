package com.kelompok8.pemesanankoperasiService.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.kelompok8.pemesanankoperasiService.model.pemesanankoperasi;
import com.kelompok8.pemesanankoperasiService.service.pemesanankoperasiService;

@RestController
@RequestMapping("/pemesanankoperasi")
public class pemesanankoperasiController {
	@Autowired
	pemesanankoperasiService pemesanankoperasiService;
	@GetMapping("")
	public List <pemesanankoperasi> list(){
		return pemesanankoperasiService.listAllpemesananKoperasi();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<pemesanankoperasi> get(@PathVariable Integer id){
		try {
			pemesanankoperasi pemesanankoperasi = pemesanankoperasiService.getpemesananKoperasi(id);
			return new ResponseEntity<pemesanankoperasi>(pemesanankoperasi, HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<pemesanankoperasi>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody pemesanankoperasi pemesanankoperasi) {
		pemesanankoperasiService.savepemesananKoperasi(pemesanankoperasi);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody pemesanankoperasi pemesanankoperasi, @PathVariable Integer id){
		try {
			pemesanankoperasi existPengguna = pemesanankoperasiService.getpemesananKoperasi(id);
			pemesanankoperasi.setId_pemesanankoperasi(id);
			pemesanankoperasiService.savepemesananKoperasi(pemesanankoperasi);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesanankoperasiService.deletepemesananKoperasi(id);
	}
}
