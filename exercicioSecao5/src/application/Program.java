package application;

import java.util.Locale;
import java.util.Scanner;

import conta.Conta;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		Conta conta;
		
		System.out.print("ENTRE COM O NUMERO DA CONTA: ");
		int numero = sc.nextInt();
		
		System.out.print("ENTRE COM O NOME DO TITULAR DA CONTA: ");
		sc.nextLine();
		String titular = sc.nextLine();
		
		System.out.print("DESEJA DEPOSITO INICIAL ? (S/N): ");
		char resposta = sc.next().charAt(0);
		
		if (resposta == 's') {
			System.out.print("DIGITE O VALOR INICIAL: ");
			double depositoInicial = sc.nextDouble();
			conta = new Conta(numero, titular, depositoInicial);
		}		
		else {
			conta = new Conta(numero, titular);
		}
		
		System.out.println();
		System.out.println("DADOS DA CONTA: ");
		System.out.println(conta.toString());
		
		System.out.println();
		System.out.print("DIGITE O VALOR DO DEPOSITO: ");
		double valorDeposito = sc.nextDouble();
		conta.depositar(valorDeposito);
		
		System.out.println("ATUALIZA��O DA CONTA: ");
		System.out.println(conta);
		
		System.out.println();
		System.out.println("DIGITE O VALOR DO SAQUE: ");
		double valorSaque = sc.nextDouble();
		conta.sacar(valorSaque);

		System.out.println("ATUALIZA��O DA CONTA: ");
		System.out.println(conta);
		
		
		sc.close();
	}

}
