package com.pemesanankantin.pemesananKantin.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pemesanankantin.pemesananKantin.model.PemesananKantin;
import com.pemesanankantin.pemesananKantin.repository.PemesananKantinRepository;

@Service
@Transactional
public class PemesananKantinService {
	@Autowired
	private PemesananKantinRepository pemesanankantinRepository;
	
	public List<PemesananKantin> listAllPemesananKantin(){
		return pemesanankantinRepository.findAll();
	}
	
	public void savePemesananKantin(PemesananKantin pemesanankantin) {
		pemesanankantinRepository.save(pemesanankantin);
	}
	
	public PemesananKantin getPemesananKantin(Integer id) {
		return pemesanankantinRepository.findById(id).get();
	}
	
	public void deletePemesananKantin(Integer id) {
		pemesanankantinRepository.deleteById(id);
	}

}
