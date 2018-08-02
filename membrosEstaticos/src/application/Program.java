package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculadora;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.print("ENTRE COM O VALOR DO RAIO: ");
		double raio = sc.nextDouble();

		double cir = Calculadora.circuferencia(raio);

		double vol = Calculadora.volume(raio);

		System.out.println();
		System.out.printf("CIRCUNFERENCIA: %.2f\n", cir);
		System.out.printf("VOLUME: %.2f\n", vol);
		System.out.printf("VALOR DO PI: %.2f\n", Calculadora.PI);
		sc.close();
	}
}
