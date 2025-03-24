package Hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADM
 */
public class ex4 {
    
    public static void main(String[] args) {
        
        Set<String> nm = new HashSet <>();
        
        nm.add("nk");
        nm.add("digo");
        nm.add("luis");
        nm.add("male");
        
         if (nm.isEmpty()) {
            System.out.println("A lista está vazia.");
        } else {
            System.out.println("A lista não está vazia.");
        }
        
    }

}
