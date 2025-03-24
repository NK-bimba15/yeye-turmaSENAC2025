package Hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADM
 */
public class ex6 {
    
    public static void main(String[] args) {
        
        Set<String> a = new HashSet <>();
        
        a.add("gato");
        a.add("cachorro");
        a.add("leão");
        a.add("tigre");
        
        String b = "gato";
        
        if (a.contains(b)) {
            System.out.println(b+" esta no conjunto");
        } else {
            System.out.println(b+" não esta no conjunto");
        }
    }

}
