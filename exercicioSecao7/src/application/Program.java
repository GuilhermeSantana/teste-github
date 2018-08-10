package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Departamento;
import entities.HorasContrato;
import entities.Trabalhador;
import entities.enums.NivelTrabalho;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("NOME DO DEPARTAMENTO: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("DIGITE OS DADOS DO TRABALHADOR: ");
		System.out.print("NOME: ");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("NIVEL: ");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("SALARIO BASE: ");
		double salarioBase = sc.nextDouble();

		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalho.valueOf(nivelTrabalhador), salarioBase,
				new Departamento(nomeDepartamento));

		System.out.print("QUANTOS CONTRATOS ESSE TRABALHADOR VAI TER ? ");
		int n = sc.nextInt();

		for (int i = 1; i < n; i++) {
			System.out.println("INSIRA OS DADOS DO #" + i + " CONTRATO: ");
			System.out.print("DATA (DD/MM/AAAA): ");
			Date dataContrato = sdf.parse(sc.next());
			System.out.print("VALOR POR HORA: ");
			double valorPorHora = sc.nextDouble();
			System.out.print("DURAÇÃO(HORAS): ");
			int horas = sc.nextInt();
			HorasContrato contrato = new HorasContrato(dataContrato, valorPorHora, horas);
			trabalhador.adicionarContratos(contrato);
		}
		System.out.println();
		System.out.print("INSIRA MÊS E ANO PARA CALCULAR A RENDA (MM/AAAA): ");
		String mesAno = sc.next();
		int mes = Integer.parseInt(mesAno.substring(0, 2));
		int ano = Integer.parseInt(mesAno.substring(3));

		System.out.println();
		System.out.println("NOME: " + trabalhador.getNome());
		System.out.println("DEPARTAMENTO: " + trabalhador.getDepartamento().getNome());
		System.out.println("RENDA: " + mesAno + ": " + String.format("%.2f", trabalhador.renda(ano, mes)));
		sc.close();

	}

}
