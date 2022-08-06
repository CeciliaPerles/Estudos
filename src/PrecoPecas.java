import java.util.Scanner;

public class PrecoPecas {

	public static void main(String[] args) {
		/*Scanner sc4 = new Scanner (System.in);
		
		int codigoPecaUm = sc4.nextInt();
		int numeroPecasUm = sc4.nextInt();
		double valorUnitarioPecaUm = sc4.nextDouble();
		
		int codigoPecaDois = sc4.nextInt();
		int numeroPecasDois = sc4.nextInt();
		double valorUnitarioPecaDois = sc4.nextDouble();
		double valorTotalPecaUm = numeroPecasUm * valorUnitarioPecaUm;
		double valorTotalPecaDois = numeroPecasDois * valorUnitarioPecaDois;
		double valorTotal = valorTotalPecaUm + valorTotalPecaDois;
		
		System.out.printf("Valor a pagar: %.2f%n", valorTotal);
		sc4.close();*/
		
        Scanner sc4 = new Scanner (System.in);
		
		int codigoPecaUm = sc4.nextInt();
		int numeroPecasUm = sc4.nextInt();
		double valorUnitarioPecaUm = sc4.nextDouble();
		
		int codigoPecaDois = sc4.nextInt();
		int numeroPecasDois = sc4.nextInt();
		double valorUnitarioPecaDois = sc4.nextDouble();
		double valorTotal = numeroPecasUm * valorUnitarioPecaUm + numeroPecasDois * valorUnitarioPecaDois;
					
		System.out.printf("Valor a pagar: %.2f%n", valorTotal);
		sc4.close();
		
		
	
		

	}

}
