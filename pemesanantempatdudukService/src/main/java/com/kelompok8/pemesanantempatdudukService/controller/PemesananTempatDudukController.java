package com.kelompok8.pemesanantempatdudukService.controller;

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

import com.kelompok8.pemesanantempatdudukService.model.PemesananTempatDuduk;
import com.kelompok8.pemesanantempatdudukService.service.PemesananTempatDudukService;

@RestController
@RequestMapping("/pemesanantempatduduk")
public class PemesananTempatDudukController {
	@Autowired
	PemesananTempatDudukService pemesanantempatdudukService;
	
	@GetMapping("")
	public List<PemesananTempatDuduk> list(){
		return pemesanantempatdudukService.listAllPemesananTempatDuduk();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PemesananTempatDuduk> get(@PathVariable Integer id){
		try {
			PemesananTempatDuduk pemesanantempatduduk = pemesanantempatdudukService.getPemesananTempatDuduk(id);
			return new ResponseEntity<PemesananTempatDuduk>(pemesanantempatduduk, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<PemesananTempatDuduk>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PemesananTempatDuduk pemesanantempatduduk) {
		pemesanantempatdudukService.savePemesananTempatDuduk(pemesanantempatduduk);;
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody PemesananTempatDuduk pemesanantempatduduk, @PathVariable Integer id){
		try {
			PemesananTempatDuduk existPemesananTempatDuduk = pemesanantempatdudukService.getPemesananTempatDuduk(id);
			pemesanantempatduduk.setId_pemesanantempatduduk(id);
			pemesanantempatdudukService.savePemesananTempatDuduk(pemesanantempatduduk);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesanantempatdudukService.deletePemesananTempatDuduk(id);
	}
}
