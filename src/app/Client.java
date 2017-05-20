package app;

import enums.Accommodation;
import enums.Destination;
import enums.Transport;
import facade.TravelAgency;
import facade.TravelAgencyImpl;

public class Client {
	
	public static void main(String[] args) {
		TravelAgency agency = new TravelAgencyImpl();
		agency.chooseDestination(Destination.KRIT);
		agency.chooseAccommodation(Accommodation.HOTEL);
		agency.chooseTransport(Transport.AVION);
		agency.chooseNumberOfDays(10);
		agency.print(agency.finalizeTravellingProgram());
	}
}
