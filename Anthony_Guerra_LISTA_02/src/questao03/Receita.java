package questao03;

import java.time.LocalDateTime;

abstract class Receita implements Transacao {
	protected LocalDateTime data;
	protected String descricao;
	protected double receitaTotal;

	public String getTipo() {
		return "RECEITA";
	}

	public double calcularTotal() {
		
		return receitaTotal;
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

	public double getReceitaTotal() {
		return receitaTotal;
	}

	public void setReceitaTotal(int receitaTotal) {
		this.receitaTotal = receitaTotal;
	}

}
