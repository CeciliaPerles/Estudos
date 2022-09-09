package com.estudando.cecilia.exercicios.whilee;

import java.util.Scanner;

public class ExercicioIdade {

	public static void main(String[] args) {
		Scanner scIdade = new Scanner(System.in);
				
		int idadeDigitada = 0;
		int soma = 0;
		int numeroIdadesDigitadas = 0;
							
		while (numeroIdadesDigitadas < 5) {
		numeroIdadesDigitadas = numeroIdadesDigitadas + 1;
		idadeDigitada = scIdade.nextInt();
		soma = soma + idadeDigitada;
		}
		
		System.out.println("A soma é de " + soma);
		
		scIdade.close();
		}
		
	}
	
			

