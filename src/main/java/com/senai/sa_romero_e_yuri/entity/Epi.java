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
@Table(name = "epi")
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
	private Date validade;
	
	@Column(name = "create_at")
	private Timestamp create_at;

	public Epi(String nome, String ca, String tipo, int quantidade_estoque, Date validade, Timestamp create_at) {
		super();
		this.nome = nome;
		this.ca = ca;
		this.tipo = tipo;
		this.quantidade_estoque = quantidade_estoque;
		this.validade = validade;
		this.create_at = create_at;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCa() {
		return ca;
	}

	public void setCa(String ca) {
		this.ca = ca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getQuantidade_estoque() {
		return quantidade_estoque;
	}

	public void setQuantidade_estoque(int quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	public Date getValidade() {
		return validade;
	}

	public void setValidade(Date validade) {
		this.validade = validade;
	}

	public Timestamp getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}

	@Override
	public String toString() {
		return "Epi [id_epi=" + id_epi + ", nome=" + nome + ", ca=" + ca + ", tipo=" + tipo + ", quantidade_estoque="
				+ quantidade_estoque + ", validade=" + validade + ", create_at=" + create_at + "]";
	}
		
}
