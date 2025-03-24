package Hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADM
 */
public class ex7 {
    public static void main(String[] args) {
        
         Set<String> c = new HashSet <>();
        
        c.add("azul");
        c.add("verde");
        c.add("amarelo");
        c.add("laranja");
        
        String b = "vermelho";
        
        if (c.contains(b)) {
            System.out.println("Vermelho esta no conjunto");
        } else {
            System.out.println("Vermelho não esta no conjunto");
        }
    }

}
        
