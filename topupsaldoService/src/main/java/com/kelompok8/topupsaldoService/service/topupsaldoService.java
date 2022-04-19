package com.kelompok8.topupsaldoService.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kelompok8.topupsaldoService.model.topupsaldo;
import com.kelompok8.topupsaldoService.repository.topupsaldoRepository;

@Service
@Transactional
public class topupsaldoService {
	@Autowired
	private topupsaldoRepository topupsaldoRepository;
	
	public List<topupsaldo> listAlltopupsaldo(){
		return topupsaldoRepository.findAll();
	}
	
	public void savetopupsaldo(topupsaldo topupsaldo) {
		topupsaldoRepository.save(topupsaldo);
	}
	
	public topupsaldo gettopupsaldo(Integer id) {
		return topupsaldoRepository.findById(id).get();
	}
	
	
	public void deletetopupsaldo(Integer id) {
		topupsaldoRepository.deleteById(id);
	}
}
