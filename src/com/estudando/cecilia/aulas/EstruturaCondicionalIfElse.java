package com.estudando.cecilia.aulas;
import java.util.Scanner;

public class EstruturaCondicionalIfElse {

	public static void main(String[] args) {

		Scanner sc6 = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc6.nextInt();

		if (hora > 0 && hora < 12) {
			System.out.println("Bom dia!");
		}
		else if(hora >= 12 && hora < 18) {
			System.out.println("Boa tarde!");
		}
		else {
			System.out.println("Boa noite!");
		}
		sc6.close();
		
		

		
			
		
	}

}
