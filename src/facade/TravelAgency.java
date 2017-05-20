package facade;

import enums.Accommodation;
import enums.Destination;
import enums.Transport;
import travellingProgram.TravellingProgram;

/**
 * Interfejs koji predstavlja fasadu aplikacije.
 * 
 * @author Tijana
 *
 */
public interface TravelAgency {

	void chooseDestination(Destination destination);
	void chooseTransport(Transport transport);
	void chooseAccommodation(Accommodation accommodation);
	void chooseNumberOfDays(int days);
	TravellingProgram finalizeTravellingProgram();
	void print(TravellingProgram program);
}
