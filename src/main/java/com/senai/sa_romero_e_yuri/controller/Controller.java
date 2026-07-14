package com.senai.sa_romero_e_yuri.controller;

import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

import com.budke.primeiro_codigo_spring_boot.entity.Departamento;
import com.senai.sa_romero_e_yuri.entity.Colaborador;
import com.senai.sa_romero_e_yuri.service.ColaboradorService;
import com.senai.sa_romero_e_yuri.service.EmprestimoService;
import com.senai.sa_romero_e_yuri.service.EpiService;
import com.senai.sa_romero_e_yuri.utils.ConsoleUtils;

public class Controller implements CommandLineRunner{

	@Autowired
	ColaboradorService colaboradorService;
	
	@Autowired
	EmprestimoService emprestimoService;
	
	@Autowired
	EpiService epiService;
	

	@Override
	public void run(String... args) throws Exception {

		Scanner input = new Scanner(System.in);
		int opcao;

		System.out.print("\n=== Exemplo empréstimo de epi ===\n");

		do {

			ConsoleUtils.exibirMenu();

			opcao = input.nextInt();

			try {
				switch (opcao) {
				case 1 -> cadastrarColaborador();
				case 2 -> listarColaboradores();
				case 3 -> atualizarColaborador();
				case 4 -> deletarColaborador();
				case 5 -> cadastrarEpi();
				case 6 -> listarEpis();
				case 7 -> atualizarEpi();
				case 8 -> deletarEpi();
				case 9 -> cadastrarEmprestimo();
				case 10 -> listarEmprestimos();
				case 0 -> System.out.println("Saindo da aplicação...");
				default -> {
					System.out.println("Opção inválida\n");
					ConsoleUtils.exibirMenu();
					opcao = input.nextInt();
				}
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		} while (opcao != 0);

	}

	private void cadastrarColaborador() {
		Scanner input = new Scanner(System.in);

		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do Departamento: ");
		String nomeDepartamento = input.nextLine();

		Colaborador colaborador = new Colaborador();
		colaborador.setNome_colaborador(nomeColaborador);

		colaboradorService.cadastrarColaborador(colaborador);

		System.out.println("Colaborador criado!");

	}

	private void listarColaboradores() {

		List<Colaborador> listaDepartamentos = colaboradorService.listarColaborador();

		if (listaDepartamentos.isEmpty()) {
			System.out.println("Não há Colaboradores");
		} else {
			System.out.println("Lista de Colaboradores: ");
			for (Colaborador c : listaColaborador) {
				System.out.println(c);
			}
		}

	}

	private void atualizarColaborador() {

		Scanner input = new Scanner(System.in);

		System.out.println("Insira a id do Colaborador: ");
		int id = input.nextInt();

		System.out.println("Insira o nome do Colaborador: ");
		input.nextLine();
		String nomeDepartamento = input.nextLine();

		Colaborador colaborador = new Colaborador();
		colaborador.setI
		colaborador.setNome_colaborador(nomeColaborador);

		colaboradorService.atualizarDepartamento(colaborador);

		System.out.println("Colaborador atualizado!");

	}

	private void deletarColaborador() {
		Scanner input = new Scanner(System.in);

		// Insira aqui a execução do método...

		System.out.println("Colaborador deletado!");

	}

	private void cadastrarEpi() {
		Scanner input = new Scanner(System.in);

		// Insira aqui a execução do método...

		System.out.println("Epi criado!");

	}

	private void listarEpis() {

	}

	private void atualizarEpi() {
		Scanner input = new Scanner(System.in);

		// Insira aqui a execução do método...

		System.out.println("Epi atualizado!");

	}

	private void deletarEpi() {
		Scanner input = new Scanner(System.in);

		// Insira aqui a execução do método...

		System.out.println("Epi deletado!");

	}

	private void cadastrarEmprestimo() {
		Scanner input = new Scanner(System.in);

		// Insira aqui a execução do método...

		System.out.println("Empréstimo criado!");

	}

	private void listarEmprestimos() {

	}
	
}
