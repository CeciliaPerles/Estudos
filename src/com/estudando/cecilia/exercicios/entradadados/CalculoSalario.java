package com.estudando.cecilia.exercicios.entradadados;
import java.util.Scanner;

public class CalculoSalario {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numeroFuncionario = sc.nextInt();
		int numeroHorasTrabalhadas = sc.nextInt();
		double valorHoraTrabalhada = sc.nextDouble();
		double salario = numeroHorasTrabalhadas * valorHoraTrabalhada;
		
		System.out.println("Número: " + numeroFuncionario);
		System.out.printf("Salário: %.2f%n", salario);
					
		sc.close();

	}

}
