package com.kelompok8.pemesanankoperasiService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok8.pemesanankoperasiService.model.pemesanankoperasi;
import com.kelompok8.pemesanankoperasiService.repository.pemesanankoperasiRepository;

@Service
@Transactional
public class pemesanankoperasiService {
	@Autowired
	private pemesanankoperasiRepository pemesanankoperasiRepository;
	
	public List<pemesanankoperasi> listAllpemesananKoperasi(){
		return pemesanankoperasiRepository.findAll();
	}
	
	public void savepemesananKoperasi(pemesanankoperasi pemesanankoperasi) {
		pemesanankoperasiRepository.save(pemesanankoperasi);
	}
	
	public pemesanankoperasi getpemesananKoperasi(Integer id) {
		return pemesanankoperasiRepository.findById(id).get();
	}
	
	
	public void deletepemesananKoperasi(Integer id) {
		pemesanankoperasiRepository.deleteById(id);
	}
}
