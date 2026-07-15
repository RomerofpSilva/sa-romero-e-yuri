package com.senai.sa_romero_e_yuri.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emprestimos")
public class Emprestimo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_emprestimos")
	private int id_emprestimos;
	
	@Column(name = "quantidade")
	private int quantidade;
	
	@Column(name = "data_retirada")
	private LocalDate data_retirada;
	
	@Column(name = "data_devolucao_prevista")
	private LocalDate data_devolucao_prevista;
	
	@Column(name = "data_devolucao_real")
	private LocalDate data_devolucao_real;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "create_at")
	private LocalDate create_at;
	
	public Emprestimo(){}

	public Emprestimo(int id_emprestimos, int quantidade, LocalDate data_retirada, LocalDate data_devolucao_prevista,
			LocalDate data_devolucao_real, String status, LocalDate create_at) {
		super();
		this.id_emprestimos = id_emprestimos;
		this.quantidade = quantidade;
		this.data_retirada = data_retirada;
		this.data_devolucao_prevista = data_devolucao_prevista;
		this.data_devolucao_real = data_devolucao_real;
		this.status = status;
		this.create_at = create_at;
	}
	
	public int getId_emprestimos() {
		return id_emprestimos;
	}

	public void setId_emprestimos(int id_emprestimos) {
		this.id_emprestimos = id_emprestimos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade < 0 ) {
			throw new IllegalArgumentException("quantidade invalida");
		}
		this.quantidade = quantidade;
	}

	public LocalDate getData_retirada() {
		return data_retirada;
	}

	public void setData_retirada(LocalDate data_retirada) {
		if(data_retirada == null) {
			throw new IllegalArgumentException("data invalida");
		}
		this.data_retirada = data_retirada;
	}

	public LocalDate getData_devolucao_prevista() {
		return data_devolucao_prevista;
	}

	public void setData_devolucao_prevista(LocalDate data_devolucao_prevista) {
		if(data_devolucao_prevista == null || data_devolucao_prevista.isAfter(data_devolucao_prevista)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.data_devolucao_prevista = data_devolucao_prevista;
	}

	public LocalDate getData_devolucao_real() {
		return data_devolucao_real;
	}

	public void setData_devolucao_real(LocalDate data_devolucao_real) {
		if(data_devolucao_real == null || data_devolucao_real.isAfter(data_devolucao_real)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.data_devolucao_real = data_devolucao_real;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		if(status ==  null || status.isBlank()) {
			throw new IllegalArgumentException("status invalido");
		}
		this.status = status;
	}

	public LocalDate getCreate_at() {
		return create_at;
	}

	public void setCreate_at(LocalDate create_at) {
		if(create_at == null || create_at.isAfter(create_at)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.create_at = create_at;
	}

	@Override
	public String toString() {
		return "Emprestimo [id_emprestimos=" + id_emprestimos + ", quantidade=" + quantidade + ", data_retirada="
				+ data_retirada + ", data_devolucao_prevista=" + data_devolucao_prevista + ", data_devolucao_real="
				+ data_devolucao_real + ", status=" + status + ", create_at=" + create_at + "]";
	}

	

}
