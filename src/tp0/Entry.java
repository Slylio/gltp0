package tp0;

/**
 * La classe pour l'index : un mot et sa liste
 * de page
 */
public class Entry  {

	/** le mot de l'entree. */
	private String mot;

	/** la liste des pages du mot. */
	private SortedListOfInteger pages;

	/**
	 * Creation d'une nouvelle entree
	 * @param w
	 * @param ps
	 */
	public Entry(String w, SortedListOfInteger ps) {
		mot=w;
		pages=ps;
	}

	/**
	 * Ajoute une page dans la liste de l'entree.
	 */
	public void add(Integer page) {
		SortedListOfInteger liste=this.getPages();
		liste.addPage(page);
	}

	/**
	 * Representation en string.
	 */
	public String toString() {
		return mot +" " +pages;
	}

	/**
	 * Fonction de comparaisons.
	 */
	public int compareTo(Entry other) {
		return this.mot.compareTo(other.getMot());
	}

	/**
	 * @return le mot
	 */
	public String getMot() {
		return mot;
	}

	/**
	 * @param mot le mot a changer
	 */
	public void setMot(String mot) {
		this.mot=mot;
	}

	/**
	 * @return les pages
	 */
	public SortedListOfInteger getPages() {
		return pages;
	}

	/**
	 * @param pages les pages a changer
	 */
	public void setPages(SortedListOfInteger pages) {

	}

}
