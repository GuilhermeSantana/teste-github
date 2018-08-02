package vetores2;

import java.util.Locale;
import java.util.Scanner;

import produtos.Produtos;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		Produtos[] vet = new Produtos[n];
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vet[i] = new Produtos(nome, preco);
		}
		
		double soma = 0.0;
		for(int i=0; i<n; i++) {
			soma += vet[i].getPreco();
		}
		
		double media = soma / n;
		
		System.out.printf("MEDIA DE PREÇOS: R$ %.2f\n", media);
		
		

		sc.close();

	}

}
