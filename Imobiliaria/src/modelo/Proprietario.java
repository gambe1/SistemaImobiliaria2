package modelo;

public class Proprietario {

	private String nome;
	private String cpf;
	private String telefone;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public void exibirProprietario() {
		System.out.println("Nome : " + nome);
		System.out.println("Telefone : " + telefone);
		System.out.println("CPF: " + cpf);
	}
}
