package funcoes;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("DIGITE TRES NUMEROS: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();

		int maior = max(a, b, c);
		
		showResult(maior);

		sc.close();
	}

	public static int max(int x, int y, int z) {
		int aux;
		if(x > y && x > z) {
			aux = x;
		}
		else if(y > z) {
			aux = y;
		}
		else {
			aux = z;
		}
		return aux;
	}
	
	public static void showResult(int valor) {
		System.out.println("MAIOR NUMERO: " + valor);
	}

}
