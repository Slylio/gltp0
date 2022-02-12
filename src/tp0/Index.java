package tp0;

import java.util.Vector;

/**
 * La classe pour l'index : un vecteur trie sur les mots.
 
 */
public class Index extends Vector<Entry> {

	/**
	 * default serial id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Constructeur par defaut.
	 */
	public Index () {
		super();
	}
	 
	 /** 
	  * @param e
	  * @return boolean
	  */
	 // autre versionvoid
	public boolean add(Entry e) {
		if(!this.contains(e)){
			super.add(e);
			this.sort(new SortEntry());
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Determine si le mot est deja reference ou pas.
	 * @param m le mot
	 * @return booleen
	 */
	public boolean isIn(String m) {
		if (this.contains(this.get(m))){
			return true;
		}
		return false;
	}

	/**
	 * Retourne l'entree correspondant au mot dans l'index.
	 */
	public Entry get(String m) {
		for (Entry e : this) {
			if (e.getMot().equals(m)){
				return e;
			}
		}
		return null;
	}
	/**
	 * Representation sous forme de chaine.
	 * @return une string
	 */
	public String toString() {
		String sortie="";
		for (Entry i : this) {
			sortie+=i.toString() + "\n";
		}
		return sortie;
	}

}
