package com.estudando.cecilia.aulas;

import java.util.Scanner;

public class EstruturaTernaria {

	public static void main(String[] args) {

		//System.out.println((2 > 4) ? 50 : 80);
		//System.out.println((10 != 3) ? "Maria" : "João");
		
					
		/*double preco = 34.5;
		double desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}
		else {
			desconto = preco * 0.05;
		}*/
		
		double preco = 34.5;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
		System.out.println(desconto);
	}

}
