package entradaDeDados;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		/*
		 * String frase = sc.nextLine(); String x, y, z; x = sc.next(); y = sc.next(); z
		 * = sc.next();
		 * 
		 * System.out.println(frase); System.out.println(x); System.out.println(y);
		 * System.out.println(z);
		 */

		// --------------------------------------------//

		int n1 = sc.nextInt();
		sc.nextLine();
		String nome = sc.nextLine();
		char genero = sc.nextLine().charAt(0);
		
		//b5
		String s = sc.nextLine();
		char letra = s.charAt(0);
		int numero = Integer.parseInt(s.substring(1));
		
		//4.32
		double n2 = sc.nextDouble();
		
		// Nome Genero Idade Altura
		String nome2 = sc.next();
		char ch = sc.next().charAt(0);
		int idade = sc.nextInt();
		double altura = sc.nextDouble();

		System.out.println(n1);
		System.out.println(nome);
		System.out.println(genero);
		System.out.println(letra);
		System.out.println(numero);
		System.out.println(n2);
		
		System.out.println(nome2);
		System.out.println(ch);
		System.out.println(idade);
		System.out.println(altura);
		sc.close();
	}

}