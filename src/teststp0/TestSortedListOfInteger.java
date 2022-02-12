package teststp0;
import java.io.IOException;

import tp0.SortedListOfInteger;

public class TestSortedListOfInteger {
    
    
    /** 
     * @param args
     * @throws IOException
     */
    public static void main(String [] args) throws IOException {
        SortedListOfInteger mylist = new SortedListOfInteger();
        mylist.addPage(5);
        System.out.println(mylist.toString());
        mylist.addPage(7);
        System.out.println(mylist.toString());
        mylist.addPage(6);
        System.out.println(mylist.toString());
        mylist.addPage(6);
        System.out.println(mylist.toString());
        mylist.addPage(3);
        System.out.println(mylist.toString());

    }

}
