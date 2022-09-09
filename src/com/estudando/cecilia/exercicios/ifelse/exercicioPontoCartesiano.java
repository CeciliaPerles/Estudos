package com.estudando.cecilia.exercicios.ifelse;

import java.util.Scanner;

public class exercicioPontoCartesiano {

	public static void main(String[] args) {

		Scanner scCartesiano = new Scanner (System.in);
		
		double x = scCartesiano.nextDouble();
		double y = scCartesiano.nextDouble();
		
		if (x == 0 && y == 0) {
			System.out.println("Origem");
		}
		
		else if (x > 0 && y > 0) {
			System.out.println("Q1");
		}
		
		else if (x > 0 && y < 0) {
			System.out.println("Q4");
		}
		
		else if (x < 0 && y > 0) {
			System.out.println("Q2");
		}
					
		else {
			System.out.println("Q3");
		}		
		
		scCartesiano.close();

	}

}
