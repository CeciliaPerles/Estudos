import java.util.Scanner;

public class CalculoFormasGeometricas {

	public static void main(String[] args) {

		Scanner sc5 = new Scanner(System.in);
		double A = sc5.nextDouble();
		double B = sc5.nextDouble();
		double C = sc5.nextDouble();
		double areaDoTriangulo = A * C;
		double areaDoCirculo = 3.14159 * C * C;
		double areaDoTrapezio = ((A + B)/2)* C;
		double areaDoQuadrado = B * B;
		double areaDoRetangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n", areaDoTriangulo);
		System.out.printf("CIRCULO: %.3f%n", areaDoCirculo);
		System.out.printf("TRAPEZIO: %.3f%n", areaDoTrapezio);
		System.out.printf("QUADRADO: %.3f%n", areaDoQuadrado);
		System.out.printf("RETANGULO: %.3f%n", areaDoRetangulo);
		
		sc5.close();

	}

}
