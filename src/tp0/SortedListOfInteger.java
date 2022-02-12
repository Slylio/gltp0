package tp0;

import java.util.Vector;

/**
 * Classe pour les listes d'entiers positifs et trie en ordre strictement
 * croissant.
 */
public class SortedListOfInteger extends Vector<Integer> {

	/**
	 * default serial id.
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * Liste de page vide.
	 */
	public SortedListOfInteger() {
		super();
	}
	
	/**
	 * 
	 * @param page
	 */
	public void addPage(Integer page) {
		if(!this.contains(page)&&page>=0){
			super.add(page);
			this.sort(new Sort());
		}
	}

	/**
	 * Format de sortie avec des "," comme séparateur.
	 */
	public String toString() {
		String sortie="";
		for(int i=0; i<this.elementCount;i++){
			if(sortie.compareTo("")!=0){
				sortie+=" , ";
			}
			sortie+=this.get(i);
		}
		return sortie;
	}	
}
