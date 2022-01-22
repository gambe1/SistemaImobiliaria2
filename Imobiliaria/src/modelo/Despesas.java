package modelo;

public class Despesas {
	
	String descricao;
	String tipo_despesa;
	int valor;
	boolean vencimento_fatura;
	String status_vencimento;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipo_despesa() {
		return tipo_despesa;
	}
	public void setTipo_despesa(String tipo_despesa) {
		this.tipo_despesa = tipo_despesa;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public boolean isVencimento_fatura() {
		return vencimento_fatura;
	}
	public void setVencimento_fatura(boolean vencimento_fatura) {
		this.vencimento_fatura = vencimento_fatura;
	}
	public String getStatus_vencimento() {
		return status_vencimento;
	}
	public void setStatus_vencimento(String status_vencimento) {
		this.status_vencimento = status_vencimento;
	}
	
	public void exibirDespesas() {
		
	}
}
