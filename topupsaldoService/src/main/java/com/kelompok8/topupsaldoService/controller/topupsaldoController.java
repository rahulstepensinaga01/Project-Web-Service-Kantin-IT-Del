package com.kelompok8.topupsaldoService.controller;

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

import com.kelompok8.topupsaldoService.model.topupsaldo;
import com.kelompok8.topupsaldoService.service.topupsaldoService;

@RestController
@RequestMapping("/topupsaldo")
public class topupsaldoController {
	@Autowired
	topupsaldoService topupsaldoService;
	@GetMapping("")
	public List <topupsaldo> list(){
		return topupsaldoService.listAlltopupsaldo();
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<topupsaldo> get(@PathVariable Integer id){
		try {
			topupsaldo topupsaldo = topupsaldoService.gettopupsaldo(id);
			return new ResponseEntity<topupsaldo>(topupsaldo, HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<topupsaldo>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody topupsaldo topupsaldo) {
		topupsaldoService.savetopupsaldo(topupsaldo);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update (@RequestBody topupsaldo topupsaldo, @PathVariable Integer id){
		try {
			topupsaldo existTopupsaldo = topupsaldoService.gettopupsaldo(id);
			topupsaldo.setId_topup(id);
			topupsaldoService.savetopupsaldo(topupsaldo);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Integer id) {
		topupsaldoService.deletetopupsaldo(id);
	}
}
