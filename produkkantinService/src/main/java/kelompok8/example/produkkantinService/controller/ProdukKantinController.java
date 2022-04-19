package kelompok8.example.produkkantinService.controller;

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

import kelompok8.example.produkkantinService.model.ProdukKantin;
import kelompok8.example.produkkantinService.service.ProdukKantinService;

@RestController
@RequestMapping("/produkkantin")
public class ProdukKantinController {
	@Autowired
	ProdukKantinService produkkantinService;
	
	@GetMapping("")
	public List<ProdukKantin> list(){
		return produkkantinService.listAllProdukKantin();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<ProdukKantin> get(@PathVariable Integer id){
		try {
			ProdukKantin produkkantin = produkkantinService.getProdukKantin(id);
			return new ResponseEntity<ProdukKantin>(produkkantin, HttpStatus.OK);
		}
		catch(NoSuchElementException e){
			return new ResponseEntity<ProdukKantin>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody ProdukKantin produkkantin) {
		produkkantinService.saveProdukKantin(produkkantin);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@RequestBody ProdukKantin produkkantin, @PathVariable Integer id){
		try {
			ProdukKantin existProdukKantin = produkkantinService.getProdukKantin(id);
			produkkantin.setId_produk(id);
			produkkantinService.saveProdukKantin(produkkantin);
			return new ResponseEntity<>(HttpStatus.OK);
		}
		catch(NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		produkkantinService.deleteProdukKantin(id);
	}
	

}
