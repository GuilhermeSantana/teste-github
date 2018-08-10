package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numeroQuarto;
	private Date checkIn;
	private Date checkOut;

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public Reserva() {
		super();
	}

	public Reserva(Integer numeroQuarto, Date checkIn, Date checkOut) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.checkIn = checkIn;
		this.checkOut = checkOut;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckIn() {
		return checkIn;
	}

	public Date getCheckOut() {
		return checkOut;
	}

	public long duracao() {
		long diferenca = checkOut.getTime() - checkIn.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}

	public String updateData(Date checkIn, Date checkOut) {

		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			return "AS DATAS PARA ATUALIZAÇÃO DA RESERVA DEVEM SER FUTURAS";
		}

		if (!checkOut.after(checkIn)) {
			return "A DATA DO CHECKOUT DEVE SER POSTERIOR À DATA DE CHECKIN";
		}

		this.checkIn = checkIn;
		this.checkOut = checkOut;
		return null;
	}

	@Override
	public String toString() {
		return "QUARTO " + numeroQuarto + ", CHECKIN: " + sdf.format(checkIn) + ", CHECKOUT: " + sdf.format(checkOut)
				+ " " + duracao() + " NOITES.";
	}

}
