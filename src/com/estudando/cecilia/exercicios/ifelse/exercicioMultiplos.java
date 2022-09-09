package com.estudando.cecilia.exercicios.ifelse;

import java.util.Scanner;

public class exercicioMultiplos {

	public static void main(String[] args) {
		Scanner sc8 = new Scanner(System.in);
		int numeroUm = sc8.nextInt();
		int numeroDois = sc8.nextInt();

		if (numeroUm % numeroDois == 0 || numeroDois % numeroUm == 0) {
			System.out.println("Sao multiplos");
		}

		else {
			System.out.println("Nao sao multiplos");
		}
		sc8.close();

	}

}
