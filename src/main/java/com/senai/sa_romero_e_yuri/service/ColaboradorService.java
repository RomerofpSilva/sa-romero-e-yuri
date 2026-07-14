package com.senai.sa_romero_e_yuri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.sa_romero_e_yuri.entity.Colaborador;
import com.senai.sa_romero_e_yuri.repository.ColaboradorRepository;

@Service
public class ColaboradorService {

	@Autowired
	ColaboradorRepository colaboradorRepository;
	
	//Create
	public void cadastrarColaborador(Colaborador colaborador) {
		colaboradorRepository.save(colaborador);
	}
	
	//Read
	public List<Colaborador> listarColaborador(){
		return colaboradorRepository.findAll();
	}
	
	public Colaborador obterColaboradorPorId(int id) {
		return colaboradorRepository.findById(id).orElseThrow(() -> new RuntimeException("Colaborador não existe"));
	}
	
	//Update
	public void atualizarColaborador(Colaborador colaborador) {
		colaboradorRepository.save(colaborador);
	}
	
	//Delete
		public void deletarColaborador(int id) {
			colaboradorRepository.deleteById(id);
		}
	
}
