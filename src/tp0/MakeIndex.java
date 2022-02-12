package tp0;

/**
 * Classe simple qui lit un fichier en entr�e ligne par ligne
 *  et reecrit son contenu un mot par ligne.
 */
public class MakeIndex extends Loader {

	/**
	 * Index du document.
	 */
	private Index index;

	/**
	 * Constructeur par defaut.
	 * @param name
	 */
	public MakeIndex(String name) {
		super(name);
		this.index = new Index();
	}

	/**
	 * Analyse les mots et cree l'index.
	 */
	public void process() {
		int i=0;
		while (i<getMots().size()){
			String mot=getMots().get(i);
			//on regarde si le mot est dans l'index
			if(index.isIn(mot)){
				//set de la page number du mot
				int pageNumber=Integer.parseInt(getMots().get(i+1));
				//on va chercher l'entry correspondant au mot, on y ajoute la page a l'aide de la méthode add(page)
				index.get(mot).add(pageNumber);
			} else {
				//on crée une nouvelle liste
				SortedListOfInteger sl = new SortedListOfInteger();
				//on va chercher la page du mot
				int pageNumber=Integer.parseInt(getMots().get(i+1));
				//ajout page à la nouvelle liste du mot
				sl.addPage(pageNumber);
				//on crée l'entry correspondate
				index.add(new Entry(mot, sl));
			}
			//incrémentation
			i+=2;
		}
	}

	/**
	 * @return the index
	 */
	public Index getIndex() {
		return index;
	}

	/**
	 * @param index the index to set
	 */
	public void setIndex(Index index) {
		this.index=index;
	}

	public String toString () {
		return index.toString();
	}
}
