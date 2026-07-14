package com.senai.sa_romero_e_yuri.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.senai.sa_romero_e_yuri.entity.Emprestimo;
import com.senai.sa_romero_e_yuri.repository.EmprestimoRepository;

@Service
public class EmprestimoService {


	@Autowired
	EmprestimoRepository emprestimoRepository;
	
	//Create
	public void cadastrarEmprestimo(Emprestimo emprestimo) {
		emprestimoRepository.save(emprestimo);
	}
	
	//Read
	public List<Emprestimo> listarEmprestimo(){
		return emprestimoRepository.findAll();
	}
	
	public Emprestimo obterEmprestimoPorId(int id) {
		return emprestimoRepository.findById(id).orElseThrow(() -> new RuntimeException("Emprestimo não existe"));
	}
	
	//Update
	public void atualizarEmprestimo(Emprestimo emprestimo) {
		emprestimoRepository.save(emprestimo);
	}
	
	//Delete
		public void deletarColaborador(int id) {
			emprestimoRepository.deleteById(id);
		}

	
	
}
