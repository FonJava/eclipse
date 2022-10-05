package questao03;

import java.time.LocalDateTime;

abstract class Despesa implements Transacao {
	protected LocalDateTime data;
	protected String descricao;
	protected double despesaTotal;
	
	public String getTipo() {
		
		return "DESPESA";
	}
	public double calcularTotal() {
		return despesaTotal;
	}
	public LocalDateTime getData() {
		return data;
	}
	public void setData(LocalDateTime data) {
		this.data = data;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public double getDespesaTotal() {
		return despesaTotal;
	}
	public void setDespesaTotal(double despesaTotal) {
		this.despesaTotal = despesaTotal;
	}

}
