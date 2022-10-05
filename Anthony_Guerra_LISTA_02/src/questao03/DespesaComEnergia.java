package questao03;

import java.time.LocalDateTime;

public class DespesaComEnergia extends Despesa {
	private double kWh;

	public double calculartotal() {
		if(kWh <= 50 ) {
			if(kWh < 100){
				this.setDespesaTotal(kWh * 0.5 + 2);
				}
			else if(kWh >= 100) {
				this.setDespesaTotal((kWh * 0.5 + ((kWh/100) * 1.20)) + 2);
			}
		}
		else if (kWh >= 51 && kWh < 200) {
			if(kWh < 100){
				this.setDespesaTotal(kWh * 0.5 + 15);
				}
			else if(kWh >= 100) {
				this.setDespesaTotal((kWh * 0.5 + ((kWh/100) * 1.20)) + 15);
			}
		}
		else if(kWh > 201){
			if(kWh < 100){
				this.setDespesaTotal(kWh * 0.5 + 35);
				}
			else if(kWh >= 100) {
				this.setDespesaTotal((kWh * 0.5 + ((kWh/100) * 1.20)) + 35);
			}
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
