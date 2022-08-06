import java.util.Scanner;

public class EstruturaCondicionalIfElse {

	public static void main(String[] args) {

		Scanner sc6 = new Scanner(System.in);
		int hora;

		System.out.println("Quantas horas?");
		hora = sc6.nextInt();

		if (hora < 12) {
			System.out.println("Bom dia!");
		}
		else {
			System.out.println("Boa tarde!");
		}
		sc6.close();
		
		

		
			
		
	}

}
