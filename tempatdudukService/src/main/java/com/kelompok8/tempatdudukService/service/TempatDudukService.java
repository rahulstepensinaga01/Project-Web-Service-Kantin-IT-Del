package com.kelompok8.tempatdudukService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok8.tempatdudukService.model.TempatDuduk;
import com.kelompok8.tempatdudukService.repository.TempatDudukRepository;

@Service
@Transactional
public class TempatDudukService {
	@Autowired
	private TempatDudukRepository tempatdudukRepository;
	
	public List<TempatDuduk> listAllTempatDuduk(){
		return tempatdudukRepository.findAll();
	}

	public void saveTempatDuduk(TempatDuduk tempatduduk) {
		tempatdudukRepository.save(tempatduduk);
	}
	
	public TempatDuduk getTempatDuduk(Integer id) {
		return tempatdudukRepository.findById(id).get();
	}
	
	public void deleteTempatDuduk(Integer id) {
		tempatdudukRepository.deleteById(id);
	}
}
