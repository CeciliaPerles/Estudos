package com.estudando.cecilia.exercicios.forr;

import java.util.Scanner;

public class ExercicioFor {

	public static void main(String[] args) {
		Scanner scPara1 = new Scanner(System.in);
		
		int x = scPara1.nextInt();
		for (int i = 1; i <= x; i++) {
				if (i % 2 != 0) {
				System.out.println(i);
			}
		
}
		scPara1.close();
}
}


