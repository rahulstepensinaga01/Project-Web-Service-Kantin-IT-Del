package com.kelompok8.pengantaranpaketService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok8.pengantaranpaketService.model.PengantaranPaket;
import com.kelompok8.pengantaranpaketService.repository.PengantaranPaketRepository;

@Service
@Transactional
public class PengantaranPaketService {
	@Autowired
	private PengantaranPaketRepository 
	pengantaranpaketRepository;
	
	public List<PengantaranPaket> listAllPengantaranPaket(){
		return pengantaranpaketRepository.findAll();
	}
	
	public void savePengantaranPaket(PengantaranPaket pengantaranpaket) {
		pengantaranpaketRepository.save(pengantaranpaket);
	}
	
	public PengantaranPaket getPengantaranPaket(Integer id) {
		return pengantaranpaketRepository.findById(id).get();
	}
	
	public void deletePengantaranPaket(Integer id) {
		pengantaranpaketRepository.deleteById(id);
	}
}
