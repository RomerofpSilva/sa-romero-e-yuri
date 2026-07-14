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
	private int id_epi;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "ca")
	private String ca;
	
	@Column(name = "tipo")
	private String tipo;
	
	@Column(name = "nome")
	private int quantidade_estoque;
	
	@Column(name = "validade")
	private LocalDate validade;
	
	@Column(name = "create_at")
	private LocalDate create_at;
	
	public Epi(){}

	public Epi(int id_epi, String nome, String ca, String tipo, int quantidade_estoque, LocalDate validade, LocalDate create_at) {
		super();
		this.id_epi = id_epi;
		this.nome = nome;
		this.ca = ca;
		this.tipo = tipo;
		this.quantidade_estoque = quantidade_estoque;
		this.validade = validade;
		this.create_at = create_at;
	}

	public int getId_epi() {
		return id_epi;
	}

	public void setId_epi(int id_epi) {
		this.id_epi = id_epi;
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

	public int getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(int quantidade_estoque) {
		if(quantidade_estoque < 0 ) {
			throw new IllegalArgumentException("Qauntidade em estoque invalido");
		}
		this.quantidade_estoque = quantidade_estoque;
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

	public LocalDate getCreate_at() {
		return create_at;
	}

	public void setCreate_at(LocalDate create_at) {
		if(create_at == null || create_at.isAfter(validade)) {
			throw new IllegalArgumentException("Data invalida");
		}
		this.create_at = create_at;
	}

	@Override
	public String toString() {
		return "Epi [id_epi=" + id_epi + ", nome=" + nome + ", ca=" + ca + ", tipo=" + tipo + ", quantidade_estoque="
				+ quantidade_estoque + ", validade=" + validade + ", create_at=" + create_at + "]";
	}
		
}
