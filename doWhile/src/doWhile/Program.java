package doWhile;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		
		
		Locale.setDefault(Locale.US);
		
		
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("ENTRE COM UM NUMERO: ");
			double n = sc.nextDouble();
			double rq = Math.sqrt(n);
			System.out.printf("RAIZ QUADRADA: %.3f\n", rq);

			System.out.println("DESEJA REPETIR ? (SIM/NÃO)");
			char resp = sc.next().charAt(0);
			
		sc.close();
		}	}
}
