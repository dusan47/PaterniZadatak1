package travellingProgram;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import enums.Accommodation;
import enums.Destination;
import enums.Transport;
import print.PrettyPrintable;

public class TravellingProgram implements PrettyPrintable {

	private Destination destination;
	private Transport transport;
	private Accommodation accommodation;
	private int days;
	private Date created;
	private double price;

	protected TravellingProgram() {
		created = Calendar.getInstance().getTime();
	}

	public Destination getDestination() {
		return destination;
	}

	public Transport getTransport() {
		return transport;
	}

	public Accommodation getAccommodation() {
		return accommodation;
	}

	public int getDays() {
		return days;
	}

	public Date getCreated() {
		return created;
	}

	public double getPrice() {
		return price;
	}

	protected void setDestination(Destination destination) {
		this.destination = destination;
	}

	protected void setTransport(Transport transport) {
		this.transport = transport;
	}

	protected void setAccommodation(Accommodation accommodation) {
		this.accommodation = accommodation;
	}

	protected void setDays(int days) {
		this.days = days;
	}

	protected void setCreated(Date created) {
		this.created = created;
	}

	protected void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Ponuda kreirana: " + new SimpleDateFormat("dd/MM/yyyy").format(created))
				.append("\nDestinacija: " + destination).append("\nTip prevoza: " + transport)
				.append("\nSmestajni objekat: " + accommodation).append("\nBroj dana " + days)
				.append("\nCena: " + ((int)(price * 100)) / 100.0);
		return sb.toString();
	}

	@Override
	public void prettyPrint() {
		System.out.println("**** TURISTICKA AGENIJA ARROUND THE WORLD ****");
		System.out.println(this);
		System.out.println("**********************************************");
	}
}
