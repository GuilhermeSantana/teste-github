import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("DIGITE O NUMERO PARA O CALCULO DA RAIZ QUADRADA: ");
		double n = sc.nextDouble();

		while (n >= 0.0) {
			double rq = Math.sqrt(n);
			System.out.printf("%.3f\n", rq);
			System.out.print("DIGITE OUTRO NUMERO PARA O CALCULO DA RAIZ QUADRADA: ");
			n = sc.nextDouble();
		}
		System.out.println("NUMERO NEGATIVO");

		sc.close();
	}

}
