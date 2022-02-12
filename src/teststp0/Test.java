package teststp0;
import java.io.IOException;
import tp0.MakeIndex;


/**
 * Classe pour tester la lecture.

 */
public class Test {
	
	
	/** 
	 * @param args
	 * @throws IOException
	 */
	public static void main(String [] args) throws IOException {
		MakeIndex mi = new MakeIndex("../resources/montexte");
        mi.load();
        mi.process();
		mi.output(mi.toString());
		System.out.println(mi.toString());
	}

}