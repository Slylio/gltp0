package teststp0;

import java.io.IOException;

import tp0.Loader;


/**
 * Classe pour tester la lecture.

 */
public class TestLoader {
	
	
	/** 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String [] args) throws IOException {
		Loader ld = new Loader("../resources/montexte");
		// lecture
		ld.load();
		// "criture
		ld.output(ld.toString());
	}

}
