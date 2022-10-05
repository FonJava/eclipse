package questao05;

import java.time.LocalDate;

public class RelacaoVacinados {
	private RegistroVacina vacinados[];
	private String naoTomaram2DoseCpf[];
	private String naoTomaram2DoseNome[];
	private String vacinadosCpf;
	private String vacinadosNome;
	private int vacinadosIdade;
	private LocalDate vacinadosData;

	public RelacaoVacinados(RegistroVacina vacinados[]) {
		this.vacinados = vacinados;
	}

	public RelacaoVacinados(RegistroVacina registro1, RegistroVacina registro2, RegistroVacina registro3,
			RegistroVacina registro4, RegistroVacina registro5, RegistroVacina registro6) {
		// TODO Auto-generated constructor stub
	}

	public RegistroVacina[] getVacinados() {
		return vacinados;
	}

	public void setVacinados(RegistroVacina[] vacinados) {
		this.vacinados = vacinados;
	}

	public String getVacinadosCpf() {
		return vacinadosCpf;
	}

	public String getVacinadosNome() {
		return vacinadosNome;
	}

	public int getVacinadosIdade() {
		return vacinadosIdade;
	}

	public int getTotal65() {
		int total65 = 0;
		for(int i = 0; i < this.vacinados.length;) {
			if(this.vacinados[i].getIdadeVacinado() > 65) {
				total65++;}
			else { i++;}
			}
		return total65;
		
	}
	
	public int getTotalSem2Dose() {
	int totalSem2Dose = 0;
		for(int i = 0; i < this.vacinados.length;) {
			if(this.vacinados[i].getDose() != 2) {
				totalSem2Dose++;}
			else { i++;}
			}
		return totalSem2Dose;
	
	}
	
	public int getTotal() {
		int total = 0;
			for(int i = 0; i < this.vacinados.length;) {
				if(this.vacinados[i].getDose() == 2) {
					total++;}
				else { i++;}
				}
			return total;
		
		}

	public void adicionar(RegistroVacina registro) {
		for (int i = 0; i < this.vacinados.length;) {
			if (this.vacinados[i] == null) {
				this.vacinados[i] = registro;
			} else {
				i++;
			}
		}
		for (int i = 0; i < this.vacinados.length; i++) {
			this.vacinadosCpf = this.vacinados[i].getCpfVacinado();
			this.vacinadosNome = this.vacinados[i].getNomeVacinado();
			this.vacinadosIdade = this.vacinados[i].getIdadeVacinado();
			this.vacinadosData = this.vacinados[i].getData_vacinacao();
		}
	}

	public int calcularTotalVacinadosAcimaDe(int idade2) {
		int pessoasVacinadas = 0;
		for (int i = 0; i < this.vacinados.length; i++) {
			if (this.vacinados[i].getIdadeVacinado() > idade2) {
				if (this.vacinados[i].getDose() == 1 && this.vacinados[i].getDose() == 2) {
					pessoasVacinadas++;
				}
			}
		}
		return pessoasVacinadas;

	}

	public void listarPessoasQueNaoTomaram2aDose() {
		this.naoTomaram2DoseCpf = null;
		this.naoTomaram2DoseNome = null;
		for (int i = 0; i < this.vacinados.length; i++) {
			if (this.vacinados[i].getDose() != 2) {
				this.naoTomaram2DoseCpf[i] = this.vacinados[i].getCpfVacinado();
				this.naoTomaram2DoseNome[i] = this.vacinados[i].getNomeVacinado();
			}
		}
		for (int i = 0; i < this.naoTomaram2DoseCpf.length; i++) {
			System.out.println(this.naoTomaram2DoseNome[i] + "CPF: " + this.naoTomaram2DoseCpf[i]
					+ "deve se vacinar em: " + this.vacinados[i].getData_vacinacao().plusDays(21));
		}
	}

	public void tabela1() {
		System.out.println("CPF            |Nome              |Idade  | Data indicada p. 2a dose");
		System.out.println("------------------------------------------------------------------------");
		System.out.printf("%-15s %-18s %7d %t", this.vacinadosCpf, this.vacinadosNome, this.vacinadosIdade, this.vacinadosData );
		System.out.println("------------------------------------------------------------------------");
		System.out.println("Total de vacinados acima de 65 anos: " + this.getTotal65());
		System.out.println("Total de vacinados que não tomaram a 2a. dose: " + this.getTotalSem2Dose());
		System.out.println("Total de vacinados que tomaram a 2a. dose: " + this.getTotal());
	}
}
