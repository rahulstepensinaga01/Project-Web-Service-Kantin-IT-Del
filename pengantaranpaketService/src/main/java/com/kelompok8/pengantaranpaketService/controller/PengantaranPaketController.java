package com.kelompok8.pengantaranpaketService.controller;

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

import com.kelompok8.pengantaranpaketService.model.PengantaranPaket;
import com.kelompok8.pengantaranpaketService.service.PengantaranPaketService;

@RestController
@RequestMapping("/pengantaranpaket")
public class PengantaranPaketController {
	@Autowired
	PengantaranPaketService pengantaranpaketService;
	
	@GetMapping("")
	public List<PengantaranPaket> list(){
		return pengantaranpaketService.listAllPengantaranPaket();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PengantaranPaket> get(@PathVariable Integer id){
		try {
			PengantaranPaket pengantaranpaket = pengantaranpaketService.getPengantaranPaket(id);
			return new ResponseEntity<PengantaranPaket>(pengantaranpaket, HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<PengantaranPaket>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody PengantaranPaket pengantaranpaket) {
		pengantaranpaketService.savePengantaranPaket(pengantaranpaket);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody PengantaranPaket pengantaranpaket, @PathVariable Integer id){
		try {
			PengantaranPaket existPengantaranPaket = pengantaranpaketService.getPengantaranPaket(id);
			pengantaranpaket.setId_paket(id);
			pengantaranpaketService.savePengantaranPaket(pengantaranpaket);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		pengantaranpaketService.deletePengantaranPaket(id);
	}

}
