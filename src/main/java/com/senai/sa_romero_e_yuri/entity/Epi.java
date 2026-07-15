package com.senai.sa_romero_e_yuri.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "epis")
public class Epi {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_epi")
	private int idEpi;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "ca")
	private String ca;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "quantidade_estoque")
	private int quantidadeEstoque;
	
	@Column(name = "validade")
	private LocalDate validade;
	
	@Column(name = "create_at")
	private LocalDate createdAt;
	
	public Epi(){}

	public int getIdEpi() {
		return idEpi;
	}

	public void setIdEpi(int idEpi) {
		this.idEpi = idEpi;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isBlank()) {
			throw new IllegalArgumentException("Nome invalido");
		}
		this.nome = nome;
	}

	public String getCa() {
		return ca;
	}

	public void setCa(String ca) {
		if(ca == null || ca.isBlank()) {
			throw new IllegalArgumentException("CA invalido");
		}
		this.ca = ca;
	}

	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		if(tipo == null || tipo.isBlank()) {
			throw new IllegalArgumentException("Tipo invalido");
		}
		this.tipo = tipo;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		if(quantidadeEstoque < 0 ) {
			throw new IllegalArgumentException("Qauntidade em estoque invalido");
		}
		this.quantidadeEstoque = quantidadeEstoque;
	}

	public LocalDate getValidade() {
		return validade;
	}

	public void setValidade(LocalDate validade) {
		if(validade == null || validade.isAfter(validade)) {
			throw new IllegalArgumentException("Data invalida");
		}
		this.validade = validade;
	}

	public LocalDate getCreateAt() {
		return createdAt;
	}

	public void setCreateAt(LocalDate createdAt) {
		if(createdAt == null || createdAt.isAfter(validade)) {
			throw new IllegalArgumentException("Data invalida");
		}
		this.createdAt = createdAt;
	}

	
}
