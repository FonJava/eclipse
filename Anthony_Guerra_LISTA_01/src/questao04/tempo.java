package questao04;

import java.time.*;
import java.util.Scanner;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.time.format.DateTimeFormatter;

public class tempo {
	// Letra F//
		public static int tirarDatas(Date dataInicial, Date dataFinal) {
			if (dataInicial == null || dataFinal == null) {
				return 0;
			}

			int dias = (int) ((dataFinal.getTime() - dataInicial.getTime()) / (24 * 60 * 60 * 1000));

			return (dias > 0 ? dias : 0);
		}

		@SuppressWarnings("deprecation")
		public static int getdiasUteis(Date dataInicial, Date dataFinal) {

			int diasUteis = 0;
			int diasTotais = tirarDatas(dataInicial, dataFinal);

	
			Calendar calendar = new GregorianCalendar(dataFinal.getYear(), dataFinal.getMonth(), dataFinal.getDay());

			for (int i = 0; i <= diasTotais; i++) {

				if (!(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY)
						&& !(calendar.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY)) {
					diasUteis++;
				}
				calendar.add(Calendar.DATE, 1);
			}

			return diasUteis;
		}
		
	
	public static void main(String[] args) throws ParseException {
		// Letra A//
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite uma data no formato ano-mes-dia:");
		String digitada = sc1.nextLine();
		LocalDate dataTeclado = LocalDate.parse(digitada);
		System.out.println("A data Digitada é: " + dataTeclado);

		// Letra B//
		LocalDate ldNow = LocalDate.now();
		System.out.println("A data de hoje é: " + ldNow);
		Duration diferencaDias = Duration.between(dataTeclado.atStartOfDay(), ldNow.atStartOfDay());
		System.out
				.println("A diferença em dias da data de hoje " + "e da data digitada é de: " + diferencaDias.toDays()+ " dias.");

		// Letra C//
		LocalDate novaData = dataTeclado.plusDays(110);
		System.out.println("A data digitada + 110 dias é: " + novaData);

		// Letra D//
		LocalDate dataAlterada = dataTeclado.withMonth(8);
		System.out.println("A data digitada, alterando o mes para agosto é: " + dataAlterada);

		// Letra E//
		DateTimeFormatter formatar = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("A data digitada no formato dia/mes/ano é: " + dataTeclado.format(formatar));
		//Letra F//
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println("Digite duas datas:");
		Scanner sc2 = new Scanner(System.in);
		String digitada2 = sc2.nextLine();
		Scanner sc3 = new Scanner(System.in);
		String digitada3 = sc3.nextLine();
		Date data2 = formato.parse(digitada2);
		Date data3 = formato.parse(digitada3);
		
		int letraf = getdiasUteis(data2, data3);
		System.out.println("A quantidade de dias uteis entre essas datas é de: "+ letraf+" dias uteis.");
		

	}

}
