package for_each;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex2_2 {
    
        public static void main(String[] args) {
        
        ArrayList<String> n = new ArrayList<>();
        
        int c = 1;
        
        n.add("Alice");
        n.add("André");
        n.add("Bruna");
        n.add("Amanda");
        n.add("Carlos");
        n.add("Ana");
    
            
           for (String ns : n) {
            if (ns.startsWith("A")) {
                c++;


                 System.out.println("Quantidade de nomes que começam com 'A': " + c);
  
            }
}
        }
}


