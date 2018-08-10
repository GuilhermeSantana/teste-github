package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario;
import entities.TercerizarFuncionario;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		List<Funcionario> list = new ArrayList<>();

		System.out.print("QUAL O NUMERO DE FUNCIONARIOS: ");
		int n = sc.nextInt();
		System.out.println();

		for (int i = 1; i <= n; i++) {
			System.out.println("DADOS DO #" + i + " FUNCIONARIO: ");
			System.out.print("FUNCIONARIO TERCERIZADO ? (S/N): ");
			char ch = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("NOME: ");
			String nome = sc.next();
			sc.nextLine();

			System.out.print("HORAS: ");
			int horas = sc.nextInt();
			sc.nextLine();

			System.out.print("VALOR POR HORA: ");
			double valorPorHora = sc.nextDouble();
			sc.nextLine();

			if (ch == 's') {
				System.out.print("COBRANÇA ADICIONAL: ");
				double cobrancaAdicional = sc.nextDouble();
				Funcionario fun = new TercerizarFuncionario(nome, horas, valorPorHora, cobrancaAdicional);
				list.add(fun);
			} 
			else {
				Funcionario fun = new Funcionario(nome, horas, valorPorHora);
				list.add(fun);
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println("PAGAMENTOS");
		for (Funcionario funcionario : list) {
		System.out.println(funcionario.getNome() + " - R$ " + String.format("%.2f", funcionario.pagamento()));
		}

		sc.close();

	}

}
