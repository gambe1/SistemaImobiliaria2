package modelo;

public class Inquilino {
	private String nome;
	private String email;
	private String telefone;
	private int idade;
	private int Genero;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTelefone() {
		return telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int Genero() {
		return Genero;
	}
	public void setGenero(int genero) {
		Genero = genero;
	}

	public void exibirDetalhes() {
		System.out.println(" Nome : " + nome);
		System.out.println(" E-mail : " + email);
		System.out.println(" Telefone : " + telefone);
		System.out.println(" Idade : " + idade + " Anos");
	
		switch (Genero) {
		
		case 1:
			System.out.println(" Gênero : Masculino");
			break;
		case 2:
			System.out.println(" Gênero : Feminino");
			break;
		}
	}
}