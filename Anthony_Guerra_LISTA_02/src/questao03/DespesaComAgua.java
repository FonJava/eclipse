package questao03;

import java.time.LocalDateTime;

public class DespesaComAgua extends Despesa {
	private double totalM3;
	public double calculartotal() {
		if(totalM3 <= 10) {
			this.setDespesaTotal(45);
		}
		else if(totalM3 > 10 && totalM3 < 20) {
			this.setDespesaTotal(45 + ((totalM3-10) * 5));
		}
		else if(totalM3 > 20) {
			this.setDespesaTotal(45 + ((totalM3-20) * 6));
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
