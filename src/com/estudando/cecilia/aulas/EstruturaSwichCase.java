package com.estudando.cecilia.aulas;

import java.util.Scanner;

public class EstruturaSwichCase {

	public static void main(String[] args) {
		/*Scanner scSemana = new Scanner(System.in);

		int codigoSemana = scSemana.nextInt();
		String dia;

		if (codigoSemana == 1){
			dia = "DOMINGO";
			}
		else if (codigoSemana == 2) {
			dia = "SEGUNDA";
			}
		else if (codigoSemana == 3) {
			dia = "TERÇA";
			}
		else if (codigoSemana == 4) {
			dia = "QUARTA";
			}
		else if (codigoSemana == 5) {
			dia = "QUINTA";
			}
		else if (codigoSemana == 6) {
			dia = "SEXTA";
			}
		else if (codigoSemana == 7) {
			dia = "SÁBADO";
			}
		else {
			dia = "INVÁLIDO";
			}
		System.out.println(dia);
		scSemana.close();*/
		
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		String dia;
		switch (x) {
		case 1:
		dia = "domingo";
		break;
		case 2:
		dia = "segunda";
		break;
		case 3:
		dia = "terca";
		break;
		case 4:
		dia = "quarta";
		break;
		case 5:
		dia = "quinta";
		break;
		case 6:
		dia = "sexta";
		break;
		case 7:
		dia = "sabado";
		break;
		default:
		dia = "valor invalido";
		break;
		}
		System.out.println("Dia da semana: " + dia);
		sc.close();
		
		
	}

}
