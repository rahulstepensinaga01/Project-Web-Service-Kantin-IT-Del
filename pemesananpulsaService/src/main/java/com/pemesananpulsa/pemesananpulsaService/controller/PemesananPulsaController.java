package com.pemesananpulsa.pemesananpulsaService.controller;

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

import com.pemesananpulsa.pemesananpulsaService.model.PemesananPulsa;
import com.pemesananpulsa.pemesananpulsaService.service.PemesananPulsaService;

@RestController
@RequestMapping("/pemesananpulsa")
public class PemesananPulsaController {
	@Autowired
	PemesananPulsaService pemesananpulsaService;
	
	@GetMapping("")
	public List<PemesananPulsa> list(){
		return pemesananpulsaService.listAllPemesananPulsa();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PemesananPulsa> get(@PathVariable Integer id){
		try {
			PemesananPulsa pemesananpulsa = pemesananpulsaService.getPemesananPulsa(id);
			return new ResponseEntity<PemesananPulsa>(pemesananpulsa, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<PemesananPulsa>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PemesananPulsa pemesananpulsa) {
		pemesananpulsaService.savePemesananPulsa(pemesananpulsa);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody PemesananPulsa pemesananpulsa, @PathVariable Integer id){
		try {
			PemesananPulsa existPemesananPulsa = pemesananpulsaService.getPemesananPulsa(id);
			pemesananpulsa.setId_pemesananpulsa(id);
			pemesananpulsaService.savePemesananPulsa(pemesananpulsa);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesananpulsaService.deletePemesananPulsa(id);
	}
}
