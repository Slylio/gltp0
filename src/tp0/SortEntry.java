package tp0;
import java.util.Comparator;

public class SortEntry implements Comparator<Entry> {
    
    
    /** 
     * @param e1
     * @param e2
     * @return int
     */
    public int compare(Entry e1, Entry e2){
        return e1.compareTo(e2);
    }

} 