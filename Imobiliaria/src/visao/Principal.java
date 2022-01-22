package visao;

import java.text.BreakIterator;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import modelo.Imovel;
import modelo.Inquilino;
import modelo.Proprietario;

public class Principal {

	private Scanner teclado;
	private ArrayList<Inquilino> inquilinos;
	private ArrayList<Imovel> imoveis;
	private ArrayList<Proprietario> proprietario;

	public Principal() {
		teclado = new Scanner(System.in);
		inquilinos = new ArrayList<Inquilino>();
		imoveis = new ArrayList<Imovel>();
		proprietario = new ArrayList<Proprietario>();
	}
	public int LerInteiro() {
		return Integer.parseInt(teclado.nextLine());
	}
	public float LerFloat() {
		return Float.parseFloat(teclado.nextLine());
	}


	public void MenuPrincipal() {
		System.out.println("*-*-* Bem vindo ao sistema *-*-*");

		int opcao = -1;

		while(opcao != 0) {
			System.out.println("\n *** Menu principal ***  \n 0 - Sair \n 1 - Menu de inquilino \n 2 - Menu de proprietário \n 3 - Menu de imóveis \n 4 - Despesas do Imóvel \n  ");
			opcao = LerInteiro();

			switch (opcao) {
			case 0:
				System.out.println("Sistem encerrado com sucesso !!");
				break;
			case 1:
				menuInquilino();
				break;
			case 2:
				menuProprietario();
				break;
			case 3:
				menuImovel();
				break;
			case 4:
				menuDespesas();
				break;
			}
		}
	}


	private void menuDespesas() {
		System.out.println("______________________________________________");
		System.out.println("*** Menu de despesas ***");
		System.out.println("______________________________________________");

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("0 - Voltar");
			System.out.println("1 - Cadastrar nova despesa");
			System.out.println("2 - Excluir despesa");
			System.out.println("3 - Listar despesas");
			System.out.println("4 - Editar despesas");
			opcao = LerInteiro();
			switch (opcao) {
			case 1:
				inserirDespesa();
				break;
			case 2:
				excluirDespesa();
				break;
			case 3:
				listarDespesa();
				break;
			case 4:
				editarDespesa();
				break;
			}

		}
	}

	private void editarDespesa() {
		// TODO Auto-generated method stub
		
	}
	private void listarDespesa() {
		// TODO Auto-generated method stub
		
	}
	private void excluirDespesa() {
		// TODO Auto-generated method stub
		
	}
	private void inserirDespesa() {
		// TODO Auto-generated method stub
		
	}
	private void menuImovel() {
		System.out.println("______________________________________________");
		System.out.println("*** Menu de imóveis ***");
		System.out.println("______________________________________________");

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("0 - Voltar");
			System.out.println("1 - Cadastrar novo imóvel");
			System.out.println("2 - Excluir imóvel");
			System.out.println("3 - Listar imóvel");	
			opcao = LerInteiro();
			switch (opcao) {
			case 1:
				inserirImovel();
				break;
			case 2:
				excluirImovel();
				break;
			case 3:
				listarImovel();
				break;
			}

		}

	}

	private void excluirImovel() {
		System.out.println("*** Exclusão de imóvel ***");
		System.out.println("_________________________________");
		listarImovel();

		System.out.println("Informe a posição para exclusão :");
		int posi = LerInteiro();
		imoveis.remove(posi);

		System.out.println("*** Imóvel excluido com sucesso ***");


	}
	private void listarImovel() {
		System.out.println("*** Listagem de imóveis ***");
		System.out.println("_________________________________");

		for(int i = 0 ; i < imoveis.size() ; i++) {
			Imovel ImovelCorrente = imoveis.get(i);
			System.out.println("Posição :" + i);
			ImovelCorrente.exibirImovel();
			System.out.println("________________________________________________");
		}
		System.out.println("****** Escolha o Proprietario *****");

	}
	private void inserirImovel() {
		Imovel novoImovel = new Imovel();

		System.out.println("Código : ");
		novoImovel.setIdentificacao(teclado.nextInt());
		System.out.println("Valor condomio: ");
		novoImovel.setCondominio(teclado.nextInt());
		System.out.println("Endereço: ");
		novoImovel.setEndereco(teclado.nextLine());
		listarProprietario();
		System.out.println("Nome do proprietario do imóvel: (escolha a o número da POSIÇÃO)");
		int posi = LerInteiro();
		novoImovel.setProprietarioImovel(proprietario.get(posi));


		imoveis.add(novoImovel);
		System.out.println("_________________________________");
		System.out.println("Imóvel cadastrado com sucesso");
		System.out.println("_________________________________");
	}

	private void menuProprietario() {
		System.out.println("______________________________________________");
		System.out.println("*** Menu de proprietario ***");
		System.out.println("______________________________________________");

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("0 - Voltar");
			System.out.println("1 - Cadastrar novo proprietario");
			System.out.println("2 - Excluir proprietario");
			System.out.println("3 - Listar proprietario");	
			opcao = LerInteiro();

			switch (opcao) {
			case 1:
				inserirProprietario();
				break;
			case 2:
				excluirProprietario();
				break;
			case 3:
				listarProprietario();
				break;
			}
		}
	}

	private void listarProprietario() {
		System.out.println("*** Listagem de proprietarios ***");
		System.out.println("_________________________________");

		for(int i = 0 ; i < proprietario.size() ; i++) {
			Proprietario ProprietariooCorrente = proprietario.get(i);
			System.out.println("Posição :" + i);
			ProprietariooCorrente.exibirProprietario();
			System.out.println("________________________________________________");
		}
		System.out.println("________________________________________________");
	}
	private void excluirProprietario() {
		System.out.println("*** Exclusão de proprietario ***");
		System.out.println("_________________________________");
		listarProprietario();

		System.out.println("Informe a posição para exclusão :");
		int posi = LerInteiro();
		inquilinos.remove(posi);

		System.out.println("*** proprietario excluido com sucesso ***");

	}
	private void inserirProprietario() {
		Proprietario novoProprietario = new Proprietario();

		System.out.println("*** Cadastro de proprietario ***");

		System.out.println("Informe o nome :");
		novoProprietario.setNome(teclado.nextLine());
		System.out.println("Informe o telefone :");
		novoProprietario.setTelefone(teclado.nextLine());
		System.out.println("Informe o CPF :");
		novoProprietario.setCpf(teclado.nextLine());

		proprietario.add(novoProprietario);
		System.out.println("_________________________________");
		System.out.println("Proprietario cadastrado com sucesso");
		System.out.println("_________________________________");
	}

	private void menuInquilino() {
		System.out.println("______________________________________________");
		System.out.println("*** Menu de inquilino ***");
		System.out.println("______________________________________________");

		int opcao = -1;

		while (opcao != 0) {
			System.out.println("0 - Voltar");
			System.out.println("1 - Cadastrar novo inquilino");
			System.out.println("2 - Excluir inquilino");
			System.out.println("3 - Listar inquilino");	
			opcao = LerInteiro();

			switch (opcao) {
			case 1:
				inserirInquilino();
				break;
			case 2:
				excluirInquilino();
				break;
			case 3:
				listarInquilino();
				break;
			}
		}
	}

	private void listarInquilino() {
		System.out.println("*** Listagem de inquilinos ***");
		System.out.println("_________________________________");

		for(int i = 0 ; i < inquilinos.size() ; i++) {
			Inquilino inquilinoCorrente = inquilinos.get(i);
			System.out.println(" Posição :" + i);
			inquilinoCorrente.exibirDetalhes();
			System.out.println("________________________________________________");
		}
		System.out.println("****** Fim do relatório *****");
		System.out.println("________________________________________________");

	}
	private void excluirInquilino() {
		System.out.println("*** Exclusão de paciêntes ***");
		System.out.println("_________________________________");
		listarInquilino();

		System.out.println("Informe a posição para exclusão :");
		int posi = LerInteiro();
		inquilinos.remove(posi);

		System.out.println("*** Inquilino excluido com sucesso ***");

	}
	private void inserirInquilino() {
		Inquilino novoInquilino = new Inquilino();

		System.out.println("*** Cadastro de inquilino ***");

		System.out.println("Informe o nome :");
		novoInquilino.setNome(teclado.nextLine());
		System.out.println("Informe o e-mail :");
		novoInquilino.setEmail(teclado.nextLine());
		System.out.println("Informe o telefone :");
		novoInquilino.setTelefone(teclado.nextLine());
		System.out.println("Informe a idade :");
		novoInquilino.setIdade(LerInteiro());
		System.out.println("Informe o gênero :  1 - Masculino / 2 - Feminino");
		novoInquilino.setGenero(LerInteiro());
		inquilinos.add(novoInquilino);
		System.out.println("_________________________________");
		System.out.println("Inquilino cadastrado com sucesso");
		System.out.println("_________________________________");

	}

}