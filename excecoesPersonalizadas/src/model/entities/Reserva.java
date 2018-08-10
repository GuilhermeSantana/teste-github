package model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reserva {

	private Integer numeroQuarto;
	private Date checkin;
	private Date checkout;

	
	private static SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/aaaa");
	
	
	public Reserva() {
		super();
	}

	public Reserva(Integer numeroQuarto, Date checkin, Date checkout) {
		super();
		this.numeroQuarto = numeroQuarto;
		this.checkin = checkin;
		this.checkout = checkout;
	}

	public Integer getNumeroQuarto() {
		return numeroQuarto;
	}

	public void setNumeroQuarto(Integer numeroQuarto) {
		this.numeroQuarto = numeroQuarto;
	}

	public Date getCheckin() {
		return checkin;
	}

	public Date getCheckout() {
		return checkout;
	}
	
	public long duracao() {
		long diferenca = checkout.getTime() - checkin.getTime();
		return TimeUnit.DAYS.convert(diferenca, TimeUnit.MILLISECONDS);
	}
	
	public void updateData(Date checkin, Date checkout) {
		this.checkin = checkin;
		this.checkout = checkout;
	}

	@Override
	public String toString() {
		return "QUARTO "
				+ numeroQuarto
				+ ", CHECKIN: "
				+ sdf.format(checkin)
				+ ", CHECKOUT: "
				+ sdf.format(checkout)
				+ duracao()
				+ " NOITES.";
	
	

}
