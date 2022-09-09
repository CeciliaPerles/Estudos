package com.estudando.cecilia.exercicios.ifelse;

import java.util.Scanner;

public class exercicioPrecoLanche {

	public static void main(String[] args) {
		Scanner scLanche = new Scanner(System.in);

		int codigoLanche = scLanche.nextInt();
		int quantidadeLanche = scLanche.nextInt();
		double totalPagar = 0;
		boolean pedidoValido = true;

		if (codigoLanche == 1) {
			totalPagar = quantidadeLanche * 4.00;
		}

		else if (codigoLanche == 2) {
			totalPagar = quantidadeLanche * 4.50;
		}

		else if (codigoLanche == 3) {
			totalPagar = quantidadeLanche * 5.00;
		}

		else if (codigoLanche == 4) {
			totalPagar = quantidadeLanche * 2.00;
		}

		else if (codigoLanche == 5) {
			totalPagar = quantidadeLanche * 1.50;
		}

		else {
			pedidoValido = false;
			System.out.printf("PEDIDO INVÁLIDO");
		}

		if (pedidoValido) {
			System.out.printf("Total a pagar: %.2f.%n", totalPagar);
		}

		scLanche.close();
	}

}
