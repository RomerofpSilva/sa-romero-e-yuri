package com.senai.sa_romero_e_yuri.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "colaborador")
public class Colaborador {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id_colaborador")
	private int id;
	
	@Column(name = "nome")
	private String nome;
	
	@Column(name = "login")
	private String login;
	
	@Column(name = "senha")
	private String senha;
	
	@Column(name = "perfil")
	private String perfil;
	
	@Column(name = "status")
	private boolean status;

	public Colaborador(int id, String nome, String login, String senha, String perfil, boolean status) {
		super();
		this.id = id;
		this.nome = nome;
		this.login = login;
		this.senha = senha;
		this.perfil = perfil;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {		
	//	if (id = null ) {
	//      throw new IllegalArgumentException("O ID deve ter exatamente 7 caracteres.");
	//    } 
	// DEIXAR COMENTADO PARA AJUSTAR DEPOIS !!!
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(nome == null || nome.isBlank()){
			throw new IllegalArgumentException("Nome invalido");
		}
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		if(login == null || login.isBlank()) {
			throw new IllegalArgumentException("Login invalido");
		}
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if(senha == null || senha.isBlank()) {
			throw new IllegalArgumentException("Senha invalida");
		}
		this.senha = senha;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		if(perfil == null || perfil.isBlank()) {
			throw new IllegalArgumentException("Senha invalida");
		}
		this.perfil = perfil;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
