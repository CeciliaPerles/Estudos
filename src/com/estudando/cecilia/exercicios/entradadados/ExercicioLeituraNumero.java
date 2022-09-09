package com.estudando.cecilia.exercicios.entradadados;

import java.util.Scanner;

public class ExercicioLeituraNumero {

	public static void main(String[] args) {
		Scanner scLer = new Scanner (System.in);
		
		System.out.println("Digite três números:");
		int numeroUm = scLer.nextInt();
		int numeroDois = scLer.nextInt(); 
		int numeroTres = scLer.nextInt();
		
		/*if (numeroUm > numeroDois && numeroUm > numeroTres) {
			System.out.println(numeroUm);
		} else if (numeroDois > numeroTres) {
			System.out.println(numeroDois);
		} else {
			System.out.println(numeroTres);
		}*/
		
		int higher = max(numeroUm, numeroDois, numeroTres);
		showResult(higher);
							
		System.out.println();
		scLer.close();

	}

	public static int max(int x, int y, int z){
		int aux;
		if (x > y && x > z) {
		aux = x;
	} else if (y > z) {
		aux = y;
	} else {
		aux = z;
	}
		return aux;	
	}
		
	public static void showResult(int value) {
		System.out.println("Maior = " + value);
	}
	
}
