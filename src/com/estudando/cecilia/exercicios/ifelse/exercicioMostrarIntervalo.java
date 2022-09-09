package com.estudando.cecilia.exercicios.ifelse;

import java.util.Scanner;

public class exercicioMostrarIntervalo {

	public static void main(String[] args) {
		Scanner scIntervalo = new Scanner (System.in);
		
		double numeroEscolhido = scIntervalo.nextDouble();
		
		if (numeroEscolhido > 0 && numeroEscolhido <= 25) {
			System.out.printf("Intervalo 0-25.");
		}
		
		else if (numeroEscolhido > 25 && numeroEscolhido <= 50) {
			System.out.printf("Intervalo 25-50.");
		}
		
		else if (numeroEscolhido > 50 && numeroEscolhido <= 75) {
			System.out.printf("Intervalo 50-75.");
		}
		
		else if (numeroEscolhido > 75 && numeroEscolhido <= 100) {
			System.out.printf("Intervalo 75-100.");
		}
					
		else {
			System.out.printf("Fora do intervalo.");
		}		
		
		scIntervalo.close();

	}

}
