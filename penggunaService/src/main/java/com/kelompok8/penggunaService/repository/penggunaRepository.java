package com.kelompok8.penggunaService.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kelompok8.penggunaService.model.pengguna;

public interface penggunaRepository extends JpaRepository<pengguna, Integer> {

}
