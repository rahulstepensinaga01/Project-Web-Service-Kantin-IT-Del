package com.kelompok8.penggunaService.controller;

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

import com.kelompok8.penggunaService.model.pengguna;
import com.kelompok8.penggunaService.service.penggunaService;

@RestController
@RequestMapping("/pengguna")
public class penggunaController {
	@Autowired
	penggunaService penggunaService;
	@GetMapping("")
	public List <pengguna> list(){
		return penggunaService.listAllUser();
	}
	
	@GetMapping("/{nik}")
	public ResponseEntity<pengguna> get(@PathVariable Integer nik){
		try {
			pengguna pengguna = penggunaService.getUser(nik);
			return new ResponseEntity<pengguna>(pengguna, HttpStatus.OK);
		}catch(NoSuchElementException e) {
			return new ResponseEntity<pengguna>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody pengguna pengguna) {
		penggunaService.saveUser(pengguna);
	}
	
	@PutMapping("/{nik}")
	public ResponseEntity<?> update (@RequestBody pengguna pengguna, @PathVariable Integer nik){
		try {
			pengguna existPengguna = penggunaService.getUser(nik);
			pengguna.setNik(nik);
			penggunaService.saveUser(pengguna);
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (NoSuchElementException e){
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
	@DeleteMapping("/{nik}")
	public void delete(@PathVariable Integer nik) {
		penggunaService.deleteUser(nik);
	}
}
