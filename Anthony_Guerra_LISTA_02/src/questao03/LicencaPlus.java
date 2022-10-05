package questao03;

import java.time.LocalDateTime;

public class LicencaPlus extends Receita {
	private int totalContas;

	public double calcularTotal() {

		this.setReceitaTotal(totalContas * 35);
		return receitaTotal;

	}
	@Override
	public LocalDateTime getData() {
		
		return data;
	}


	@Override
	public String getDescricao() {
		
		return descricao;
	}
}
