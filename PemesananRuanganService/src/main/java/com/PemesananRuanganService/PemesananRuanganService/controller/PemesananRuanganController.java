package com.PemesananRuanganService.PemesananRuanganService.controller;

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

import com.PemesananRuanganService.PemesananRuanganService.model.PemesananRuangan;
import com.PemesananRuanganService.PemesananRuanganService.service.PemesananRuanganService;

@RestController
@RequestMapping("/pemesananruangan")
public class PemesananRuanganController {
	@Autowired
	PemesananRuanganService pemesananruanganService;
	
	@GetMapping("")
	public List <PemesananRuangan> list(){
		return pemesananruanganService.listAllpemesananruangan();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PemesananRuangan> get(@PathVariable Integer id){
		try {
			PemesananRuangan pemesananruangan = pemesananruanganService.getpemesananruangan(id);
			return new ResponseEntity<PemesananRuangan>(pemesananruangan, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<PemesananRuangan>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add (@RequestBody PemesananRuangan pemesananruangan) {
		pemesananruanganService.savepemesananruangan(pemesananruangan);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody PemesananRuangan pemesananruangan, @PathVariable Integer id){
		try {
			PemesananRuangan existProdukKantin = pemesananruanganService.getpemesananruangan(id);
			pemesananruangan.setId_pemesananruangan(id);
			pemesananruanganService.savepemesananruangan(pemesananruangan);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesananruanganService.deletepemesananruangan(id);
	}
}
