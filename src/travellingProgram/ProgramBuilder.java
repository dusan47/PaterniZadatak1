package travellingProgram;

import enums.Accommodation;
import enums.Destination;
import enums.Transport;

public interface ProgramBuilder {

	TravellingProgram build();

	ProgramBuilder to(Destination destination);

	ProgramBuilder by(Transport transport);

	ProgramBuilder stayIn(Accommodation accommodation);

	ProgramBuilder duration(int days);
	
	static class BuildingException extends RuntimeException {
		
		private static final long serialVersionUID = -6581259226426540487L;
		
		public BuildingException(String message) {
			super(message);
		}
		
	}
}
