package com.estudando.cecilia.exercicios.ifelse;

import java.util.Scanner;

public class exercicioImpostoRenda {

	public static void main(String[] args) {
		Scanner scImposto = new Scanner (System.in);
		
		double renda = scImposto.nextDouble();
		double imposto;
			
		if (renda <= 2000.00) {
			imposto = 0;
		}
		
		else if (renda < 3000.00) {
			imposto = (renda - 2000) * 0.08;
		}
		
		else if (renda < 4500.00) {
			imposto = (renda - 3000) * 0.18 + 1000 * 0.08;
		}
		
		else {
			imposto = (renda - 4500.00) * 0.28 + 1500 * 0.18 + 1000 * 0.08;
		}
		
		if (imposto == 0)
		{System.out.println("ISENTO");		}
		
		else {System.out.printf("R$ %.2f%n", imposto);
		}
		
		scImposto.close();

	}

}
