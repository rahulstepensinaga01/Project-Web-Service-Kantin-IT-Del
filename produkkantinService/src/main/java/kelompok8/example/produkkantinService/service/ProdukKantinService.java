package kelompok8.example.produkkantinService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kelompok8.example.produkkantinService.model.ProdukKantin;
import kelompok8.example.produkkantinService.repository.ProdukKantinRepository;

@Service
@Transactional
public class ProdukKantinService {
	@Autowired
	private ProdukKantinRepository produkkantinRepository;
	
	public List<ProdukKantin> listAllProdukKantin(){
		return produkkantinRepository.findAll();
	}
	
	public void saveProdukKantin(ProdukKantin produkkantin) {
		produkkantinRepository.save(produkkantin);
	}
	
	public ProdukKantin getProdukKantin(Integer id) {
		return produkkantinRepository.findById(id).get();
	}
	
	public void deleteProdukKantin(Integer id) {
		produkkantinRepository.deleteById(id);
	}

}
