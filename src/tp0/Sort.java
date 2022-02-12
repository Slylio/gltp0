package tp0;
import java.util.Comparator;
public class Sort implements Comparator<Integer> {
    
    /** 
     * @param o1
     * @param o2
     * @return Entry
     */
    public int compare(Integer o1, Integer o2){
        if((int)o1 > (int)o2){
            return 1;
        }else if(o1==o2){
            return 0;
        }
        return -1;
    }
} 