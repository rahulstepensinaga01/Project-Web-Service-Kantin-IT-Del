package com.pemesanankantin.pemesananKantin.controller;

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

import com.pemesanankantin.pemesananKantin.model.PemesananKantin;
import com.pemesanankantin.pemesananKantin.service.PemesananKantinService;

@RestController
@RequestMapping("/pemesanankantin")
public class PemesananKantinController {
	@Autowired
	PemesananKantinService pemesanankantinService;
	
	@GetMapping("")
	public List<PemesananKantin> list(){
		return pemesanankantinService.listAllPemesananKantin();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PemesananKantin> get(@PathVariable Integer id){
		try {
			PemesananKantin pemesanankantin = pemesanankantinService.getPemesananKantin(id);
			return new ResponseEntity<PemesananKantin>(pemesanankantin, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<PemesananKantin>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PemesananKantin pemesanankantin) {
		pemesanankantinService.savePemesananKantin(pemesanankantin);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody PemesananKantin pemesanankantin, @PathVariable Integer id){
		try {
			PemesananKantin existpemesanankantin = pemesanankantinService.getPemesananKantin(id);
			pemesanankantin.setId_pemesanankantin(id);
			pemesanankantinService.savePemesananKantin(pemesanankantin);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pemesanankantinService.deletePemesananKantin(id);
	}
}
