package print;

/**
 * Klasa koja nam samo sluzi da bismo ilustrovali kako fasada delegira pozive na
 * vise komponenti, nije u principu bila potrebna.
 * 
 * @author Tijana
 *
 */
public class Printer {

	public void print(PrettyPrintable prettyPrintable) {
		prettyPrintable.prettyPrint();
	}
}
