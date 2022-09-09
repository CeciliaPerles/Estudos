package com.estudando.cecilia.exercicios.whilee;

import java.util.Scanner;

public class ExercicioSenha {

	public static void main(String[] args) {
		
		Scanner scSenha = new Scanner(System.in);
		
		int senha = scSenha.nextInt();
		while (senha != 2002) {
		System.out.println("Senha inválida");
		senha = scSenha.nextInt();
		}
		System.out.println("Acesso permitido");
				
		scSenha.close();

	}

}
