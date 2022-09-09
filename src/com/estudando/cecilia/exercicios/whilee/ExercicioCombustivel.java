package com.estudando.cecilia.exercicios.whilee;

import java.util.Scanner;

public class ExercicioCombustivel {

	public static void main(String[] args) {
		Scanner scComb = new Scanner(System.in);
		
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		
		int tipo = scComb.nextInt();
		
		while (tipo != 4) {
						
		if (tipo == 1) {
			alcool = alcool + 1;
		}
		
		else if (tipo == 2) {
			gasolina = gasolina + 1;
		}
		
		else if (tipo == 3) {
			diesel = diesel + 1;
		}
		
		tipo = scComb.nextInt();
		
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + alcool);
		System.out.println("Gasolina: " + gasolina);
		System.out.println("Diesel: " + diesel);
		
		scComb.close();

	}

}
