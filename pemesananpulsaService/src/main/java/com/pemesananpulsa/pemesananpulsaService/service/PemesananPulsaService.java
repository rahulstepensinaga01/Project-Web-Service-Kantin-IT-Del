package com.pemesananpulsa.pemesananpulsaService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pemesananpulsa.pemesananpulsaService.model.PemesananPulsa;
import com.pemesananpulsa.pemesananpulsaService.repository.PemesananPulsaRepository;

@Service
@Transactional
public class PemesananPulsaService {
	@Autowired
	private PemesananPulsaRepository pemesananpulsaRepository;
	
	public List<PemesananPulsa> listAllPemesananPulsa(){
		return pemesananpulsaRepository.findAll();
	}
	
	public void savePemesananPulsa(PemesananPulsa pemesananpulsa) {
		pemesananpulsaRepository.save(pemesananpulsa);
	}
	
	public PemesananPulsa getPemesananPulsa(Integer id) {
		return pemesananpulsaRepository.findById(id).get();
	}
	
	public void deletePemesananPulsa(Integer id) {
		pemesananpulsaRepository.deleteById(id);
	}
}
