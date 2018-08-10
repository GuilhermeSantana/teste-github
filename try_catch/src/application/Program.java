package application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		try {
			String[] vet = sc.nextLine().split(" ");
			int posicao = sc.nextInt();
			System.out.println(vet[posicao]);
			
		} 
		
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("POSIÇÃO INVALIDA!");
		}
		
		catch (InputMismatchException e) {
			System.out.println("ERRO!");
		}
		
		System.out.println("FIM DO PROGRAMA");
		
		
		
		sc.close();
	}

}
