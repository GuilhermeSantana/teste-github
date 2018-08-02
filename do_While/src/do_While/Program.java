package do_While;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		char resp;

		do {
			System.out.print("DIGITE UM NUMERO: ");
			double n = sc.nextDouble();
			double rq = Math.sqrt(n);
			System.out.printf("RAIZ QUADRADA = %.3f\n\n", rq);
		
			System.out.print("DESEJA REPETIR ? (S/N): ");
			resp = sc.next().charAt(0);
		}

		while (resp != 'n');
		sc.close();

	}
}
