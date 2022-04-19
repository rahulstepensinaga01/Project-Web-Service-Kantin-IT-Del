package com.kelompok8.pulsaService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok8.pulsaService.model.Pulsa;
import com.kelompok8.pulsaService.repository.PulsaRepository;

@Service
@Transactional
public class PulsaService {
	@Autowired
	private PulsaRepository pulsaRepository;
	
	public List<Pulsa> listAllPulsa(){
		return pulsaRepository.findAll();
	}
	
	public void savePulsa(Pulsa pulsa) {
		pulsaRepository.save(pulsa);
	}
	
	public Pulsa getPulsa(Integer id) {
		return pulsaRepository.findById(id).get();
	}
	
	public void deletePulsa(Integer id) {
		pulsaRepository.deleteById(id);
	}

}
