package com.estudando.cecilia.exercicios.ifelse;

import java.util.Scanner;

public class exercicioNumeroParImpar {
	public static void main(String[] args) {

		Scanner sc8 = new Scanner(System.in);
		
		System.out.println("Qual número?");
		int numeroDividido = sc8.nextInt();
		
		if (numeroDividido % 2 == 0) {
			System.out.println("PAR");
		}
		
		else {
			System.out.println("ÍMPAR");
		}
		sc8.close();
}
}
