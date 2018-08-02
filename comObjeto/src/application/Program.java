package application;

import java.util.Locale;
import java.util.Scanner;

import geometria.Triangulo;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Triangulo X, Y;
		X = new Triangulo();
		Y = new Triangulo();

		System.out.println("DIGITE OS DADOS DO TRIANGULO X: ");
		X.a = sc.nextDouble();
		X.b = sc.nextDouble();
		X.c = sc.nextDouble();

		System.out.println("DIGITE OS DADOS DO TRIANGULO Y: ");
		Y.a = sc.nextDouble();
		Y.b = sc.nextDouble();
		Y.c = sc.nextDouble();

		double areaX = X.area();
		double areaY = Y.area();
				
		System.out.printf("AREA DO TRIANGULO X: %.4f\n", areaX);
		System.out.printf("AREA DO TRIANGULO Y: %.4f\n", areaY);

		if (areaX > areaY) {
			System.out.printf("AREA X É A MAIOR, COM: %.4f", areaX);
		} else {
			System.out.printf("AREA Y É A MAIOR, COM: %.4f", areaY);
		}

		sc.close();
	}

}
