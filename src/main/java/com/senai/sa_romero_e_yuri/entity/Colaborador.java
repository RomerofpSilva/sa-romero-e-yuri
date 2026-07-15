package com.senai.sa_romero_e_yuri.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "colaboradores")
public class Colaborador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_colaborador")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "cpf")
	private String cpf;
	
	@Column(name = "data_nascimento")
	private LocalDate dataNascimento;
	
	@Column(name = "setor")
	private String setor;
	
	@Column(name = "ativo")
	private String ativo;
	
	@Column(name = "created_at")
	private LocalDate createdAt;

	public Colaborador(){}	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("nome invalido");
		}
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		if(cpf == null || cpf.isBlank()) {
			throw new IllegalArgumentException("cpf invalido");
		}
		this.cpf = cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDate dataNascimento) {
		if(dataNascimento == null || dataNascimento.isBefore(dataNascimento)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.dataNascimento = dataNascimento;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		if(setor == null || setor.isBlank()) {
			throw new IllegalArgumentException("setor invalido");
		}
		this.setor = setor;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		if(ativo == null || ativo.isBlank()) {
			throw new IllegalArgumentException("nome invalido");
		}
		this.ativo = ativo;
	}

	public LocalDate getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDate createdAt) {
		if(createdAt == null || createdAt.isAfter(createdAt)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento
				+ ", setor=" + setor + ", ativo=" + ativo + ", createdAt=" + createdAt + "]";
	}
	
	

}
