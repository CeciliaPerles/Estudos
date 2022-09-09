package com.estudando.cecilia.exercicios.ifelse;

import java.util.Scanner;

public class exercicioNegativoPositivo {

	public static void main(String[] args) {
		
		Scanner sc7 = new Scanner (System.in);
		System.out.println("Qual seu número?");
		
		int numero1 = sc7.nextInt();

		if (numero1 < 0) {
			System.out.println("NEGATIVO");
		}
		else {
			System.out.println("NAO NEGATIVO");
		}
		sc7.close();
		
}

}
