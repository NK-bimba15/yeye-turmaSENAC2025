package for_each;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex2 {
    public static void main(String[] args) {
        
        ArrayList<String> l = new ArrayList<>();
        
        l.add("jessica");
        l.add("marcelo");
        l.add("cleide");
        
       for (String string : l) {
		System.out.println(string.toUpperCase());
        
    }
}
}
