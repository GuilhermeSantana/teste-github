package application;

import java.awt.geom.Area;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circulo;
import entities.Forma;
import entities.Retangulo;
import entities.enums.Cores;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Forma> list = new ArrayList<>();

		System.out.print("ENTRE COM OS NUMEROS DE FORMAS: ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.println();
			System.out.println("FORMA #" + i + ": ");
			System.out.print("RETANGULO OU CIRCULO? (R/C): ");
			char ch = sc.next().charAt(0);

			if (ch == 'r') {
				System.out.print("COR: (PRETO, AZUL, VERMELHO): ");
				Cores cores = Cores.valueOf(sc.next());

				System.out.print("ALTURA: ");
				double altura = sc.nextDouble();
				System.out.print("LARGURA: ");
				double largura = sc.nextDouble();

				list.add(new Retangulo(cores, altura, largura));

			} else if (ch == 'c') {
				System.out.print("COR: (PRETO, AZUL, VERMELHO): ");
				Cores cores = Cores.valueOf(sc.next());

				System.out.print("RAIO: ");
				double raio = sc.nextDouble();

				list.add(new Circulo(cores, raio));

			} else {
				System.out.println("LETRA INCORRETA !!");
			}

		}

		System.out.println();
		for (Forma forma : list) {
			System.out.printf(String.format("%.2f\n", forma.area()));
		}

		sc.close();
	}

}
