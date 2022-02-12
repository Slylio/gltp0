package tp0;


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Vector;

/**
 * Classe simple qui lit un fichier en entree ligne par ligne
 *  et reecrit son contenu un mot par ligne.
 */
public class Loader {

	/** constantes pour les suffixes. */
	private static String IN = ".idx";
	private static String OUT = ".ind";

	/**
	 * Le nom du fichier.
	 */
	private String fileName;

	/**
	 * La liste des mot +page du texte.
	 */
	private Vector<String> motsEtPages;

	/**
	 * Le constructeur.
	 */
	public Loader(String name) {
		this.fileName = name;
		this.motsEtPages = new Vector<String>();
	}

	/**
	 * Lecture du fichier et traitement des erreurs.
	 */
	public void load() {
		try {
			FileInputStream fis = new FileInputStream(this.getFileName() + IN);
			BufferedReader br = new BufferedReader(new InputStreamReader(fis));
			this.read(br);
			// pour fermer
			br.close();
			fis.close();
		} catch (FileNotFoundException e) {
			System.err.println(" Loader.load: fichier inexistant  " + e);
		} catch (IOException e) {
			System.err.println(" Loader.load: problème de lecture " + e);
		}
	}

	/**
	 * Lecture des lignes et d�coupage des mots
	 * et memorisation.
	 * @param br
	 */
	private void read(BufferedReader br) {
		try {
			while (br.ready()) {
				String ligne = br.readLine();
				// oublie les lignes vides et les commentaires commen�ant par '%'
				if ((ligne.length() != 0) && (ligne.charAt(0) != '%')) {
					// decoupage en mots
					String[] tokens = ligne.split(" ");
					// memorisation des mots
					for (int i = 0; i < tokens.length; i++) {
						this.getMots().add(tokens[i]);
					}
				}
			}
		} catch (IOException e) {
			System.err.println(" Loader.read: probl�me de lecture  " + e);
		}
	}

	/**
	 * Ecriture d'une chaine dans le fichier
	 * de sortie.
	 */
	public void output(String str) {
		FileWriter fos;
		PrintWriter f;
		try {
			fos = new FileWriter(this.getFileName() + OUT);
			f = new PrintWriter(fos);
			// entete
			f.println("% fichier des mots de " + this.getFileName());
			// ecriture
			f.println(str);
			f.close();
		} catch (Exception e) {
			System.out.println("Loader.output: fichier alerte " + e);
		}
	}

	/**
	 * Representation sous forme de chaine.
	 * @return string
	 */
	public String toString() {
		String result = "";
		for (String str : this.getMots()) {
			result += str + "\n";
		}
		return result;
	}

	/**
	 * @return the fileName
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * @param name the file name to set
	 */
	public void setFileName(String name) {
		this.fileName = name;
	}

	/**
	 * @return the mots
	 */
	public Vector<String> getMots() {
		return motsEtPages;
	}

	/**
	 * @param mots the mots to set
	 */
	public void setMots(Vector<String> mots) {
		this.motsEtPages = mots;
	}

}
