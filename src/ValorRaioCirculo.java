import java.util.Scanner;

public class ValorRaioCirculo {

	public static void main(String[] args) {
		Scanner sc2 = new Scanner(System.in);
		double raio, area, pi = 3.14159;
		raio = sc2.nextFloat();
		area = pi * raio * raio;
		
		System.out.printf("AREA = %.4f%n", area);
		sc2.close();
		
		/*Scanner sc = new Scanner(System.in);
		float raio = sc.nextFloat();
		float potencia = (float) Math.pow (raio,2);
		float area = (float) (3.14159 * potencia);
				
		System.out.println("AREA = " + area);*/

	}

}
