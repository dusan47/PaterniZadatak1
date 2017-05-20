package travellingProgram;

import java.util.Random;

import enums.Accommodation;
import enums.Destination;
import enums.Transport;

public class ProgramBuilderImpl implements ProgramBuilder {
	
	private Destination destination;
	private Transport transport;
	private Accommodation accommodation;
	private int days = -1;

	@Override
	public TravellingProgram build() {
		checkInformation();
		TravellingProgram program = createProgram();
		resetInformation();
		return program;
	}

	private void checkInformation() {
		if (destination == null || transport == null || accommodation == null || days == -1) {
			throw new BuildingException("Not enough information");
		}
	}

	private TravellingProgram createProgram() {
		TravellingProgram program = new TravellingProgram();
		program.setAccommodation(accommodation);
		program.setDestination(destination);
		program.setTransport(transport);
		program.setDays(days);
		program.setPrice(calculatePrice());
		return program;
	}

	private double calculatePrice() {
		return new Random().nextDouble() * 1000 + 100;
	}
	
	private void resetInformation() {
		accommodation = null;
		transport = null;
		destination = null;
		days = -1;
	}

	@Override
	public ProgramBuilder to(Destination destination) {
		this.destination = destination;
		return this;
	}

	@Override
	public ProgramBuilder by(Transport transport) {
		this.transport = transport;
		return this;
	}

	@Override
	public ProgramBuilder stayIn(Accommodation accommodation) {
		this.accommodation = accommodation;
		return this;
	}

	@Override
	public ProgramBuilder duration(int days) {
		this.days = days;
		return this;
	}

}
