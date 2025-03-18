package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex5 {
    public static void main(String[] args) {
            
            ArrayList<String> c = new ArrayList <>();
            
            c.add("A");
            c.add("B");
            c.add("C");
            c.add("D");

           for (String letras : c){
           System.out.println(letras); 
            
           }
            
            int t = c.size();
            System.out.println("\nNessa lista possuem "+t+" caracteres.");
            
    }

}

