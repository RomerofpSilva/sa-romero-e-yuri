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
	private int idEmprestimos;
	
	@Column(name = "quantidade")
	private int quantidade;
	
	@Column(name = "data_retirada")
	private LocalDate dataRetirada;
	
	@Column(name = "data_devolucao_prevista")
	private LocalDate dataDevolucaoPrevista;
	
	@Column(name = "data_devolucao_real")
	private LocalDate dataDevolucaoReal;
	
	@Column(name = "status")
	private String status;
	
	@Column(name = "created_at")
	private LocalDate createdAt;
	
	public Emprestimo(){}
	
	public int getId_emprestimos() {
		return idEmprestimos;
	}

	public void setId_emprestimos(int idEmprestimos) {
		this.idEmprestimos = idEmprestimos;
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
		return dataRetirada;
	}

	public void setData_retirada(LocalDate dataRetirada) {
		if(dataRetirada == null) {
			throw new IllegalArgumentException("data invalida");
		}
		this.dataRetirada = dataRetirada;
	}

	public LocalDate getData_devolucao_prevista() {
		return dataDevolucaoPrevista;
	}

	public void setData_devolucao_prevista(LocalDate dataDevolucaoPrevista) {
		if(dataDevolucaoPrevista == null || dataDevolucaoPrevista.isAfter(dataDevolucaoPrevista)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.dataDevolucaoPrevista = dataDevolucaoPrevista;
	}

	public LocalDate getData_devolucao_real() {
		return dataDevolucaoReal;
	}

	public void setData_devolucao_real(LocalDate dataDevolucaoReal) {
		if(dataDevolucaoReal == null || dataDevolucaoReal.isAfter(dataDevolucaoReal)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.dataDevolucaoReal = dataDevolucaoReal;
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
		return createdAt;
	}

	public void setCreate_at(LocalDate createdAt) {
		if(createdAt == null || createdAt.isAfter(createdAt)) {
			throw new IllegalArgumentException("data invalida");
		}
		this.createdAt = createdAt;
	}

	@Override
	public String toString() {
		return "Emprestimo [id_emprestimos=" + idEmprestimos + ", quantidade=" + quantidade + ", data_retirada="
				+ dataRetirada + ", data_devolucao_prevista=" + dataDevolucaoPrevista + ", data_devolucao_real="
				+ dataDevolucaoReal + ", status=" + status + ", create_at=" + createdAt + "]";
	}

	

}
