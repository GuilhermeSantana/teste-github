import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("QUANTOS NUMEROS INTEIROS SER�O DIGITADOS: ");
		int n = sc.nextInt();
		int soma = 0;
		
		for ( int i = 1; i <= n; i++) {
			System.out.println("VALOR #" + i + ": ");
			int x = sc.nextInt();
			soma += x;
		}
		
		System.out.println("SOMA �: " + soma);
		
		
		sc.close();
	}

}
