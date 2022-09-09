package com.estudando.cecilia.aulas;

import java.util.Scanner;

public class EstudandoEstruturaWhile {

	public static void main(String[] args) {
		/* É uma estrutura de controle que repete um bloco de comandos
		enquanto uma condição for verdadeira.
		Quando usar: quando não se sabe previamente a quantidade
		de repetições que será realizada.

		Scanner scEnquanto = new Scanner(System.in);
	
		int x = scEnquanto.nextInt();
		int soma = 0;
		while (x != 0) {
		soma = soma + x;
		x = scEnquanto.nextInt();
		}
		System.out.println(soma);
		
		
		scEnquanto.close();*/
	
		//TESTE DE MESA
		Scanner scEnquanto = new Scanner(System.in);
		
		int x = 0;
		int y = 4;
		while (x < 3) {
		y = y + 2;
		x = x + 1;
		}
		System.out.println(x + " e " + y);
		
		
		scEnquanto.close();
	
	
	}


}
