package com.senai.sa_romero_e_yuri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.sa_romero_e_yuri.entity.Epi;
import com.senai.sa_romero_e_yuri.repository.EpiRepository;

@Service
public class EpiService {

	@Autowired
	EpiRepository epiRepository;
	
	//Create
		public void cadastrarEpi(Epi epi) {
			epiRepository.save(epi);
		}
		
		//Read
		public List<Epi> listarEpi(){
			return epiRepository.findAll();
		}
		
		public Epi obterEpiPorId(int id) {
			return epiRepository.findById(id).orElseThrow(() -> new RuntimeException("Epi não existe"));
		}
		
		//Update
		public void atualizarEpi(Epi epi) {
			epiRepository.save(epi);
		}
		
		//Delete
			public void deletarEpi(int id) {
				epiRepository.deleteById(id);
			}
	
}
