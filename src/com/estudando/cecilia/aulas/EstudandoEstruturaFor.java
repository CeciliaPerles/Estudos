package com.estudando.cecilia.aulas;

import java.util.Scanner;

public class EstudandoEstruturaFor {

	public static void main(String[] args) {
		// Quando usar: quando se sabe previamente a quantidade
		//de repetições que será realizada.
		
		Scanner scPara = new Scanner(System.in);
		
		int N = scPara.nextInt();
		int soma = 0;
		for (int i=0; i<N; i=i+1) {
			int x = scPara.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		
		scPara.close();
	}

}
