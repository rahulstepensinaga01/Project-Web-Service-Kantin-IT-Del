package com.kelompok8.pemesanantempatdudukService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok8.pemesanantempatdudukService.model.PemesananTempatDuduk;
import com.kelompok8.pemesanantempatdudukService.repository.PemesananTempatDudukRepository;

@Service
@Transactional
public class PemesananTempatDudukService {
	@Autowired
	private PemesananTempatDudukRepository pemesanantempatdudukRepository;
	
	public List<PemesananTempatDuduk> listAllPemesananTempatDuduk(){
		return pemesanantempatdudukRepository.findAll();
	}
	
	public void savePemesananTempatDuduk(PemesananTempatDuduk pemesanantempatduduk) {
		pemesanantempatdudukRepository.save(pemesanantempatduduk);
	}
	
	public PemesananTempatDuduk getPemesananTempatDuduk(Integer id) {
		return pemesanantempatdudukRepository.findById(id).get();
	}
	
	public void deletePemesananTempatDuduk(Integer id) {
		pemesanantempatdudukRepository.deleteById(id);
	}
}
