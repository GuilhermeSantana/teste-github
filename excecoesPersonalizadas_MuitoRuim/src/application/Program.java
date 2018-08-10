package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reserva;

public class Program {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("NUMERO DO QUARTO: ");
		int numero = sc.nextInt();
		System.out.print("DATA DO CHECKIN: (DD/MM/AAAA): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("DATA DO CHECKOUT: (DD/MM/AAAA): ");
		Date checkOut = sdf.parse(sc.next());

		if (!checkOut.after(checkIn)) {
			System.out.println("A DATA DO CHECKOUT DEVE SER POSTERIOR À DATA DE CHECKIN");
		}

		else {
			Reserva reserva = new Reserva(numero, checkIn, checkOut);
			System.out.println("RESERVA: " + reserva);

			System.out.println();
			System.out.println("DADOS PARA ATUALIZAR A RESERVA: ");
			System.out.print("DATA DO CHECKIN: (DD/MM/AAAA): ");
			checkIn = sdf.parse(sc.next());
			System.out.print("DATA DO CHECKOUT: (DD/MM/AAAA): ");
			checkOut = sdf.parse(sc.next());

			Date now = new Date();
			if (checkIn.before(now) || checkOut.before(now)) {
				System.out.println("AS DATAS PARA ATUALIZAÇÃO DA RESERVA DEVEM SER FUTURAS");
			}

			else if (!checkOut.after(checkIn)) {
				System.out.println("A DATA DO CHECKOUT DEVE SER POSTERIOR À DATA DE CHECKIN");

			} else {
				reserva.updateData(checkIn, checkOut);
				System.out.println("RESERVA ATUALIZADA: " + reserva);
			}
		}

		sc.close();

	}

}
