package com.senai.sa_romero_e_yuri.controller;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.senai.sa_romero_e_yuri.entity.Colaborador;
import com.senai.sa_romero_e_yuri.entity.Emprestimo;
import com.senai.sa_romero_e_yuri.entity.Epi;
import com.senai.sa_romero_e_yuri.service.ColaboradorService;
import com.senai.sa_romero_e_yuri.service.EmprestimoService;
import com.senai.sa_romero_e_yuri.service.EpiService;
import com.senai.sa_romero_e_yuri.utils.ConsoleUtils;

@Component
public class Controller implements CommandLineRunner {

	@Autowired
	private ColaboradorService colaboradorService;
	
	@Autowired
	private EmprestimoService emprestimoService;
	
	@Autowired
	private EpiService epiService;

	private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

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
					}
				}
			} catch (Exception e) {
				System.out.println("Erro: " + e.getMessage());
			}

		} while (opcao != 0);

		input.close();
	}

	private void cadastrarColaborador() {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do Colaborador: ");
		String nomeColaborador = input.nextLine();
		
		System.out.println("Insira o CPF do Colaborador: ");
		String cpfColaborador = input.nextLine();
		
		System.out.println("Insira a Data de Nascimento do Colaborador: ");
		String dataNascimentoStr = input.nextLine();
		LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

		System.out.println("Insira o setor do Colaborador: ");
		String setor = input.nextLine();

		System.out.println("O colaborador está ativo?: ");
		String ativo = input.nextLine();

		Colaborador colaborador = new Colaborador();
		colaborador.setNome(nomeColaborador);
		colaborador.setCpf(cpfColaborador);
		colaborador.setDataNascimento(dataNascimento);
		colaborador.setSetor(setor);
		colaborador.setAtivo(ativo);
		colaborador.setCreatedAt(LocalDate.now());

		colaboradorService.cadastrarColaborador(colaborador);
		System.out.println("Colaborador criado com sucesso!");
	}

	private void listarColaboradores() {
		List<Colaborador> listaColaboradores = colaboradorService.listarColaborador();

		if (listaColaboradores.isEmpty()) {
			System.out.println("Não há Colaboradores cadastrados.");
		} else {
			System.out.println("Lista de Colaboradores: ");
			for (Colaborador c : listaColaboradores) {
				System.out.println(c);
			}
		}
	}

	private void atualizarColaborador() {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o ID do Colaborador a ser atualizado: ");
		int id = input.nextInt();
		input.nextLine();

		System.out.println("Insira o novo nome do Colaborador: ");
		String nomeColaborador = input.nextLine();

		System.out.println("Insira o novo CPF do Colaborador: ");
		String cpfColaborador = input.nextLine();

		System.out.println("Insira a nova Data de Nascimento: ");
		String dataNascimentoStr = input.nextLine();
		LocalDate dataNascimento = LocalDate.parse(dataNascimentoStr, formatter);

		System.out.println("Insira o novo setor do Colaborador: ");
		String setor = input.nextLine();

		System.out.println("O colaborador está ativo?: ");
		String ativo = input.nextLine();

		Colaborador colaborador = new Colaborador();
		colaborador.setId(id);
		colaborador.setNome(nomeColaborador);
		colaborador.setCpf(cpfColaborador);
		colaborador.setDataNascimento(dataNascimento);
		colaborador.setSetor(setor);
		colaborador.setAtivo(ativo);

		colaboradorService.atualizarColaborador(colaborador);
		System.out.println("Colaborador atualizado com sucesso!");
	}

	private void deletarColaborador() {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o ID do Colaborador: ");
		int id = input.nextInt();

		colaboradorService.deletarColaborador(id);
		System.out.println("Colaborador deletado com sucesso!");
	}

	private void cadastrarEpi() {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o nome do EPI: ");
		String nome = input.nextLine();

		System.out.println("Insira o CA do EPI: ");
		String ca = input.nextLine();

		System.out.println("Insira o tipo do EPI: ");
		String tipo = input.nextLine();

		System.out.println("Insira a quantidade em estoque: ");
		int quantidade = input.nextInt();
		input.nextLine();

		System.out.println("Insira a validade do EPI (dd/MM/yyyy): ");
		String validadeStr = input.nextLine();
		LocalDate validade = LocalDate.parse(validadeStr, formatter);

		Epi epi = new Epi();
		epi.setNome(nome);
		epi.setCa(ca);
		epi.setTipo(tipo);
		epi.setQuantidadeEstoque(quantidade);
		epi.setValidade(validade);
		epi.setCreatedAt(LocalDate.now());

		epiService.cadastrarEpi(epi);
		System.out.println("Epi criado com sucesso!");
	}

	private void listarEpis() {
		List<Epi> listaEpis = epiService.listarEpi(); 
		if (listaEpis.isEmpty()) {
			System.out.println("Não há EPIs cadastrados.");
		} else {
			System.out.println("Lista de EPIs: ");
			for (Epi e : listaEpis) {
				System.out.println(e);
			}
		}
	}

	private void atualizarEpi() {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o ID do EPI a ser atualizado: ");
		int id = input.nextInt();
		input.nextLine();

		System.out.println("Insira o novo nome do EPI: ");
		String nome = input.nextLine();

		System.out.println("Insira o novo CA do EPI: ");
		String ca = input.nextLine();

		System.out.println("Insira o novo tipo do EPI: ");
		String tipo = input.nextLine();

		System.out.println("Insira a nova quantidade em estoque: ");
		int quantidade = input.nextInt();
		input.nextLine();

		System.out.println("Insira a nova validade do EPI: ");
		String validadeStr = input.nextLine();
		LocalDate validade = LocalDate.parse(validadeStr, formatter);

		Epi epi = new Epi();
		epi.setIdEpi(id);
		epi.setNome(nome);
		epi.setCa(ca);
		epi.setTipo(tipo);
		epi.setQuantidadeEstoque(quantidade);
		epi.setValidade(validade);
		epi.setCreatedAt(LocalDate.now());

		epiService.atualizarEpi(epi);
		System.out.println("Epi atualizado com sucesso!");
	}

	private void deletarEpi() {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira o ID do EPI a ser deletado: ");
		int id = input.nextInt();

		epiService.deletarEpi(id);
		System.out.println("Epi deletado com sucesso!");
	}

	
	private void cadastrarEmprestimo() {
		Scanner input = new Scanner(System.in);

		System.out.println("Insira a quantidade de itens emprestados: ");
		int quantidade = input.nextInt();
		input.nextLine();

		System.out.println("Insira a data de retirada: ");
		String dataRetiradaStr = input.nextLine();
		LocalDate dataRetirada = LocalDate.parse(dataRetiradaStr, formatter);

		System.out.println("Insira a data de devolução prevista: ");
		String dataPrevistaStr = input.nextLine();
		LocalDate dataPrevista = LocalDate.parse(dataPrevistaStr, formatter);

		System.out.println("Insira o status do empréstimo: ");
		String status = input.nextLine();

		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setQuantidade(quantidade);
		emprestimo.setData_retirada(dataRetirada);
		emprestimo.setData_devolucao_prevista(dataPrevista);
		emprestimo.setStatus(status);
		emprestimo.setCreate_at(LocalDate.now());

		emprestimoService.cadastrarEmprestimo(emprestimo); 
		System.out.println("Empréstimo criado com sucesso!");
	}

	private void listarEmprestimos() {
		List<Emprestimo> listaEmprestimos = emprestimoService.listarEmprestimo();

		if (listaEmprestimos.isEmpty()) {
			System.out.println("Não há empréstimos cadastrados.");
		} else {
			System.out.println("Lista de Empréstimos: ");
			for (Emprestimo emp : listaEmprestimos) {
				System.out.println(emp);
			}
		}
	}
}