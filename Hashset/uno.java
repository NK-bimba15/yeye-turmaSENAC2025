package Hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADM
 */
public class uno {
    
    public static void main(String[] args) {
        
        Set<String> f = new HashSet <>();
        
        f.add("maça");
        f.add("banana");
        f.add("laranja");
        f.add("maça");
        
        
        System.out.println(f);
           
        //ou
        
        for (String ft: f){
            System.out.println(ft);
        }
        if (f.contains("banana")){
            System.out.println("\nAchamos sua banana");
            
        }
                
    }

}
