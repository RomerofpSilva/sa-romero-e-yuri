package com.senai.sa_romero_e_yuri.entity;

import java.sql.Date;
import java.sql.Timestamp;

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
	private Date data_nascimento;
	
	@Column(name = "setor")
	private String setor;
	
	@Column(name = "ativo")
	private String ativo;
	
	@Column(name = "creat_at")
	private Timestamp creat_at;

	public Colaborador(Timestamp creat_at, String nome, String cpf, Date data_nascimento, String setor, String ativo) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.data_nascimento = data_nascimento;
		this.setor = setor;
		this.ativo = ativo;
		this.creat_at = creat_at;
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

	public Date getData_nascimento() {
		return data_nascimento;
	}

	public void setData_nascimento(Date data_nascimento) {
		this.data_nascimento = data_nascimento;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public String getAtivo() {
		return ativo;
	}

	public void setAtivo(String ativo) {
		this.ativo = ativo;
	}

	

}
