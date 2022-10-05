package questao03;

import java.time.LocalDateTime;

public class LicencaBasica extends Receita {

	private int totalContas;

	
	public double calcularTotal() {
		this.setReceitaTotal(totalContas*20);
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
