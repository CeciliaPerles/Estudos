package com.estudando.cecilia.exercicios.whilee;

import java.util.Scanner;

public class ExercicioCoordenadas {

	public static void main(String[] args) {
		Scanner scCoord = new Scanner(System.in);
		
		int x = scCoord.nextInt();
		int y = scCoord.nextInt();
		
		while (x != 0 && y != 0) {
		
				
		if (x > 0 && y > 0) {
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
		x = scCoord.nextInt();
		y = scCoord.nextInt();
		}
		scCoord.close();

	}

}
