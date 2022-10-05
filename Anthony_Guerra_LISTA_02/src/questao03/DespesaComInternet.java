package questao03;

import java.time.LocalDateTime;

public class DespesaComInternet extends Despesa {
	private double dadosTravegados;

	public double calculartotal() {
		if(dadosTravegados == 20 || dadosTravegados < 100)
			this.setDespesaTotal(90.90 + ((dadosTravegados - 20) * 3.90 ));
		else if(dadosTravegados == 100 || dadosTravegados < 500)
			this.setDespesaTotal(240.90 + ((dadosTravegados - 100) * 4.40 ));
		else if(dadosTravegados >= 500) {
			this.setDespesaTotal(590.90 + ((dadosTravegados -500) * 5.10));
		}
		
		
		return despesaTotal;
	
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
