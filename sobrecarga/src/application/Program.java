package application;

import java.util.Locale;
import java.util.Scanner;

import produto.Produto;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("ENTRE COM OS DADOS: ");
		System.out.print("NOME: ");
		String nome = sc.nextLine();

		System.out.print("PREÇO: ");
		double preco = sc.nextDouble();

		Produto produto = new Produto(nome, preco);

		System.out.println();
		System.out.print("DADOS DO PRODUTO: " + produto);

		System.out.println();
		System.out.println();
		System.out.print("ENTRE COM A QUANTIDADE DE PRODUTOS PARA A ADIÇÃO DE ESTOQUE: ");
		int quantidade = sc.nextInt();
		produto.adicionarProdutos(quantidade);

		System.out.println();
		System.out.println("DADOS ATUALIZADOS DO ESTOQUE: " + produto);

		System.out.println();
		System.out.println();
		System.out.print("ENTRE COM A QUANTIDADE DE PRODUTOS PARA A REMOÇÃO DO ESTOQUE: ");
		quantidade = sc.nextInt();
		produto.removerProdutos(quantidade);

		System.out.println();
		System.out.print("DADOS ATUALIZADOS DO ESTOQUE: " + produto);

		sc.close();
	}

}
