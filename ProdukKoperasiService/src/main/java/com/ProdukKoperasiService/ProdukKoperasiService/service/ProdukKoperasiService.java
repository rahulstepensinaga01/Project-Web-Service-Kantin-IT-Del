package com.ProdukKoperasiService.ProdukKoperasiService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ProdukKoperasiService.ProdukKoperasiService.model.ProdukKoperasi;
import com.ProdukKoperasiService.ProdukKoperasiService.repository.ProdukKoperasiRepository;


@Service
@Transactional
public class ProdukKoperasiService {
	@Autowired
	private ProdukKoperasiRepository produkkantinrepository;
	
	public List<ProdukKoperasi> listAllprodukkoperasi(){
		return produkkantinrepository.findAll();
	}
	
	public void saveKoperasi (ProdukKoperasi produkkoperasi) {
		produkkantinrepository.save(produkkoperasi);
	}
	
	public ProdukKoperasi getprodukkoperasi(Integer id) {
		return produkkantinrepository.findById(id).get();
	}
	
	public void deleteprodukkoperasi(Integer id) {
		produkkantinrepository.deleteById(id);
	}
}
