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
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_emprestimos")
	private int id_emprestimos;
	
	@Column(name = "quantidade")
	private int quantidade;
	
	@Column(name = "data_retirada")
	private Date data_retirada;
	
	@Column(name = "data_devolucao_prevista")
	private Date data_devolucao_prevista;
	
	@Column(name = "data_devolucao_real")
	private Date data_devolucao_real;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "create_at")
	private Timestamp create_at;

	
	public Emprestimo(int quantidade, Date data_retirada, Date data_devolucao_prevista, Date data_devolucao_real,
			String status, Timestamp create_at) {
		super();
		this.quantidade = quantidade;
		this.data_retirada = data_retirada;
		this.data_devolucao_prevista = data_devolucao_prevista;
		this.data_devolucao_real = data_devolucao_real;
		this.status = status;
		this.create_at = create_at;
	}
	
	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Date getData_retirada() {
		return data_retirada;
	}

	public void setData_retirada(Date data_retirada) {
		this.data_retirada = data_retirada;
	}

	public Date getData_devolucao_prevista() {
		return data_devolucao_prevista;
	}

	public void setData_devolucao_prevista(Date data_devolucao_prevista) {
		this.data_devolucao_prevista = data_devolucao_prevista;
	}

	public Date getData_devolucao_real() {
		return data_devolucao_real;
	}

	public void setData_devolucao_real(Date data_devolucao_real) {
		this.data_devolucao_real = data_devolucao_real;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Timestamp getCreate_at() {
		return create_at;
	}

	public void setCreate_at(Timestamp create_at) {
		this.create_at = create_at;
	}

	@Override
	public String toString() {
		return "Emprestimo [id_emprestimos=" + id_emprestimos + ", quantidade=" + quantidade + ", data_retirada="
				+ data_retirada + ", data_devolucao_prevista=" + data_devolucao_prevista + ", data_devolucao_real="
				+ data_devolucao_real + ", status=" + status + ", create_at=" + create_at + "]";
	}
	
}
