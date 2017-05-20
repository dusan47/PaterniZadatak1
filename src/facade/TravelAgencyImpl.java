package facade;

import enums.Accommodation;
import enums.Destination;
import enums.Transport;
import print.Printer;
import travellingProgram.ProgramBuilder;
import travellingProgram.ProgramBuilderImpl;
import travellingProgram.TravellingProgram;

public class TravelAgencyImpl implements TravelAgency {
	
	private ProgramBuilder builder = new ProgramBuilderImpl();
	private Printer printer = new Printer();

	@Override
	public void chooseDestination(Destination destination) {
		builder.to(destination);
	}

	@Override
	public void chooseTransport(Transport transport) {
		builder.by(transport);
	}

	@Override
	public void chooseAccommodation(Accommodation accommodation) {
		builder.stayIn(accommodation);
	}

	@Override
	public void chooseNumberOfDays(int days) {
		builder.duration(days);
	}

	@Override
	public TravellingProgram finalizeTravellingProgram() {
		return builder.build();
	}

	@Override
	public void print(TravellingProgram program) {
		printer.print(program);
	}

}
