package com.ProdukKoperasiService.ProdukKoperasiService.controller;

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

import com.ProdukKoperasiService.ProdukKoperasiService.model.ProdukKoperasi;
import com.ProdukKoperasiService.ProdukKoperasiService.service.ProdukKoperasiService;


@RestController
@RequestMapping("/produkkoperasi")
public class ProdukKoperasiController {
	@Autowired
	ProdukKoperasiService produkkoperasiService;
	
	@GetMapping("")
	public List <ProdukKoperasi> list(){
		return produkkoperasiService.listAllprodukkoperasi();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdukKoperasi> get(@PathVariable Integer id){
		try {
			ProdukKoperasi produkkoperasi = produkkoperasiService.getprodukkoperasi(id);
			return new ResponseEntity<ProdukKoperasi>(produkkoperasi, HttpStatus.OK);
		}catch(NoSuchElementException e){
			return new ResponseEntity<ProdukKoperasi>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add (@RequestBody ProdukKoperasi produkkoperasi) {
		produkkoperasiService.saveKoperasi(produkkoperasi);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody ProdukKoperasi produkkoperasi, @PathVariable Integer id){
		try {
			ProdukKoperasi existProdukKoperasi = produkkoperasiService.getprodukkoperasi(id);
			produkkoperasi.setId_produk(id);
			produkkoperasiService.saveKoperasi(produkkoperasi);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		produkkoperasiService.deleteprodukkoperasi(id);
	}
}
