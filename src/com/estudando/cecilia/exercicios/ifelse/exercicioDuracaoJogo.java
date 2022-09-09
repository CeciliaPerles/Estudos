package com.estudando.cecilia.exercicios.ifelse;

import java.util.Scanner;

public class exercicioDuracaoJogo {

	public static void main(String[] args) {
		Scanner sc9 = new Scanner(System.in);
		int horaInicio = sc9.nextInt();
		int horaFim = sc9.nextInt();
		int duracao;
		
		
		if (horaFim > horaInicio) {
			duracao = horaFim - horaInicio;			
		}
		else {
			duracao = 24 - horaInicio + horaFim;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORAS.");
		
		sc9.close();
	}

}
