package application;

import java.util.Date;

import entities.Pedido;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
	
	System.out.println(pedido);
	
	}

}
