import java.util.Scanner;

public class CalculadoraSoma {

	public static void main(String[] args) {
      		
		Scanner sc3 = new Scanner(System.in);
		int num1 = sc3.nextInt();
		int num2 = sc3.nextInt();
		int soma = num1 + num2;
		
		System.out.println("SOMA = " + soma);
		sc3.close();

	}

}
