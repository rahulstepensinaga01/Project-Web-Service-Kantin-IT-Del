package com.PemesananRuanganService.PemesananRuanganService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.PemesananRuanganService.PemesananRuanganService.model.PemesananRuangan;
import com.PemesananRuanganService.PemesananRuanganService.repository.PemesananRuanganRepository;


@Service
@Transactional
public class PemesananRuanganService {
	@Autowired
	private PemesananRuanganRepository pemesananruanganrepository;
	
	public List<PemesananRuangan> listAllpemesananruangan(){
		return pemesananruanganrepository.findAll();
	}
	
	public void savepemesananruangan (PemesananRuangan pemesananruangan) {
		pemesananruanganrepository.save(pemesananruangan);
	}
	
	public PemesananRuangan getpemesananruangan(Integer id) {
		return pemesananruanganrepository.findById(id).get();
	}
	
	public void deletepemesananruangan(Integer id) {
		pemesananruanganrepository.deleteById(id);
	}
}
