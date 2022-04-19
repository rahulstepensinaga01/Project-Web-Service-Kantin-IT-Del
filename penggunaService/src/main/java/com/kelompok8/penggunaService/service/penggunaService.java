package com.kelompok8.penggunaService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok8.penggunaService.repository.penggunaRepository;
import com.kelompok8.penggunaService.model.pengguna;

@Service
@Transactional
public class penggunaService {
	@Autowired
	private penggunaRepository penggunaRepository;
	
	public List<pengguna> listAllUser(){
		return penggunaRepository.findAll();
	}
	
	public void saveUser(pengguna pengguna) {
		penggunaRepository.save(pengguna);
	}
	
	public pengguna getUser(Integer nik) {
		return penggunaRepository.findById(nik).get();
	}
	
	
	public void deleteUser(Integer nik) {
		penggunaRepository.deleteById(nik);
	}
}
