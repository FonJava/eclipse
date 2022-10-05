package questao01;

import java.util.Arrays.*;
import java.util.Random;

public class BilheteLoteria {
	public static void main(String[] args) {

		Random gerador = new Random();
		for (int i = 0; i < 6; i++) {
			System.out.println(gerador.nextInt(60));

		}
	}
}
