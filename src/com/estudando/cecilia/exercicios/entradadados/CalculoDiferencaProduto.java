package com.estudando.cecilia.exercicios.entradadados;
import java.util.Scanner;

public class CalculoDiferencaProduto {

	public static void main(String[] args) {
		Scanner sc1 = new Scanner(System.in);
		int A = sc1.nextInt();
		int B = sc1.nextInt();
		int C = sc1.nextInt();
		int D = sc1.nextInt();
		int operacao = (A * B - C * D);
		
		System.out.println("DIFERENÇA: " + operacao);
		sc1.close();
		

	}

}
