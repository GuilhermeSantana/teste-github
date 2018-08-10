package application;

import entities.Conta;
import entities.ContaComercial;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {

		Conta co = new Conta(1001, "Alex", 0.0);
		ContaComercial coc = new ContaComercial(1002, "Maria", 0.0, 500.00);

		//UPCASTING
		Conta co1 = coc;
		Conta co2 = new ContaComercial(1003, "Bob", 0.0, 200.00);
		Conta co3 = new ContaPoupanca(1004, "Ana", 0.0, 0.01);
	
		//DOWNCASTING
		
		ContaComercial co4 = (ContaComercial)co2;
		co4.emprestimo(100.0);
	
	//	ContaComercial co5 = (ContaComercial)co3;  //Acontece erro na hora da execução.//
	
		if (co3 instanceof ContaComercial) {
			ContaComercial co5 = (ContaComercial)co3;
			co5.emprestimo(200.0);
			System.out.println("EMPRESTIMO!");
		}
		
		if (co3 instanceof ContaPoupanca) {
			ContaPoupanca co5 = (ContaPoupanca)co3;
			co5.atualizarSaldo();
			System.out.println("UPDATE!");
		}
		
	}

}
