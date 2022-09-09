package com.estudando.cecilia.aulas;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	    public static void main(String[] args) {
	    String nome = "Maria";
	    int idade = 30;
		double salario = 4000.0;
	
		;
		System.out.printf("%s tem %d anos e ganha R$%.2f reais de salário.%n", nome, idade, salario);
		
		
		String product1 = "Computer";
		String product2 = "Office desk";
		
		int age = 30;
		int code = 2590;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		System.out.printf("Products:%n%n%s, which price is $ %.2f.%n%s, which price is $ %.2f.%n%n", product1, price1, product2, price2);
		System.out.printf("Record: %d years old, code %d and gender:%s.%n%n", age, code, gender);
		System.out.printf("Measure with decimal places: %.8f.%n", measure);
		System.out.printf("Rouded (three decimal places): %.3f.%n", measure);
		Locale.setDefault(Locale.US);
		System.out.printf("US decimal point: %.3f.", measure);
		
		
		int g;
		double u;
		g = 5;
		u= 2 * g;
		
		System.out.println(g);
		System.out.println(u);
		
		int b, B, h, a;
		b = 6;
		B= 8;
		h = 5;
		a = ((b + B)/2)*h;
		
		System.out.println(a);
		
		int x, y;
		double resultado;
		x= 5;
		y= 2;
		resultado = (double) x/y;
		System.out.println(resultado);
	
		}

}
