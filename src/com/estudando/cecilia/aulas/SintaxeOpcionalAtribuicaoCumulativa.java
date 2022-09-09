package com.estudando.cecilia.aulas;

import java.util.Scanner;

public class SintaxeOpcionalAtribuicaoCumulativa {

	public static void main(String[] args) {
		Scanner scTelefone = new Scanner(System.in);
		int minutos = scTelefone.nextInt();
		double conta = 50.0;
		
		if (conta < 100) {
			/*conta = conta + (minutos - 100) * 2.0;*/
			conta += (minutos - 100) * 2.0;
		}
		
		System.out.printf("TOTAL A PAGAR R$ %.2f.%n", conta);
		
		/*float totalAPagar;
		
		if (minutos <= 100) {
			System.out.println("TOTAL A PAGAR R$ 50,00.");
		}

		else {
			totalAPagar = ((minutos - 100) * 2) + 50;
			System.out.printf("TOTAL A PAGAR R$ %.2f.%n", totalAPagar);
		}*/

		
		
		
		
		scTelefone.close();
	}

}
