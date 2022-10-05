package questao05;

import java.time.LocalDate;

public class TesteVacinaMain {
	public static void main(String[] args) {
		Pessoa kiko = new Pessoa("12345678910", "Kiko", LocalDate.parse("2022-12-20"));
		Pessoa zinho = new Pessoa("22343676910", "Zinho", LocalDate.parse("2022-11-20"));
		Pessoa branco = new Pessoa("32845678910", "Branco", LocalDate.parse("2022-10-20"));
		Pessoa lindo = new Pessoa("42345678910", "Lindo", LocalDate.parse("2022-9-20"));
		Pessoa dani = new Pessoa("82345678910", "Dani", LocalDate.parse("2022-8-20"));
		
		Vacina oxford = new Vacina(23, "Oxford", "carpina");
		Vacina jansen = new Vacina(23, "Jansen", "limoeiro");
		
		
		RegistroVacina registro1 = new RegistroVacina("mh76", LocalDate.parse("2022-11-30"), "Luciana", 1, "Arruda", "Idosos");
		RegistroVacina registro2 = new RegistroVacina("mn96", LocalDate.parse("2022-10-30"), "Luciana", 1, "Arruda", "Idosos");
		RegistroVacina registro3 = new RegistroVacina("jh42", LocalDate.parse("2022-9-30"), "Luciana", 1, "Arruda", "Idosos");
		RegistroVacina registro4 = new RegistroVacina("nh746", LocalDate.parse("2022-8-30"), "Luciana", 1, "Arruda", "Idosos");
		RegistroVacina registro5 = new RegistroVacina("jj96", LocalDate.parse("2022-7-30"), "Luciana", 1, "Arruda", "Idosos");
		RegistroVacina registro6 = new RegistroVacina("jb26", LocalDate.parse("2022-6-30"), "Luciana", 1, "Arruda", "Idosos");
	
		
		RelacaoVacinados relacao = new RelacaoVacinados(registro1, registro2, registro3, registro4, registro5, registro6);
		
		relacao.tabela1();
	
	}
	
	
}
