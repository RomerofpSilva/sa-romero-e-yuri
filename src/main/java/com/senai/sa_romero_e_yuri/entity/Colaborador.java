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
	private LocalDate data_nascimento;
	
	@Column(name = "setor")
	private String setor;
	
	@Column(name = "ativo")
	private String ativo;
	
	@Column(name = "creat_at")
	private LocalDate creat_at;

	public Colaborador(){}
	
	public Colaborador(int id, LocalDate creat_at, String nome, String cpf, LocalDate data_nascimento, String setor, String ativo) {
		super();
		this.id = id;
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.setor = setor;
		this.ativo = ativo;
		this.creat_at = creat_at;
	}

	

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

	public LocalDate getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(LocalDate data_nascimento) {
		if(data_nascimento == null || data_nascimento.isAfter(data_nascimento)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.data_nascimento = data_nascimento;
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

	public LocalDate getCreat_at() {
		return creat_at;
	}

	public void setCreat_at(LocalDate creat_at) {
		if(creat_at == null || creat_at.isAfter(data_nascimento)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.creat_at = creat_at;
	}

	@Override
	public String toString() {
		return "Colaborador [id=" + id + ", nome=" + nome + ", cpf=" + cpf + ", data_nascimento=" + data_nascimento
				+ ", setor=" + setor + ", ativo=" + ativo + ", creat_at=" + creat_at + "]";
	}

}
