package modelo;

public class Imovel {
	private int identificacao;
	private int condominio;
	private String endereco;
	private Proprietario proprietarioImovel;
	
	
	public Proprietario getProprietarioImovel() {
		return proprietarioImovel;
	}
	
	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public void setProprietarioImovel(Proprietario proprietarioImovel) {
		this.proprietarioImovel = proprietarioImovel;
	}
	public int getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	public int getCondominio() {
		return condominio;
	}
	public void setCondominio(int condominio) {
		this.condominio = condominio;
	}
	
	
	public void exibirImovel() {
		System.out.println("Proprietário: " + proprietarioImovel.getNome()+ "\nCPF: "+ proprietarioImovel.getCpf() + "\nTelefone: " + proprietarioImovel.getTelefone());
		System.out.println("Endereço: " + endereco);
		System.out.println("Identificação: " + identificacao);
		System.out.println("Condominio: "+ condominio);
	
	}
}
