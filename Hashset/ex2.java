package Hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADM
 */
public class ex2 {
    
    public static void main(String[] args) {
        
        Set<String> f = new HashSet <>();
         
        f.add("pessego");
        f.add("banana");
        f.add("laranja");
        f.add("uva"); 
        
        for (String ft: f){
            System.out.println(ft);
            
        }
        
        if (f.contains("banana")){
            System.out.println("\nAchamos a banana");
            System.out.println("-------------------");
            System.out.println(" ");
            
        }
        
        f.remove("banana");
        
        for (String ft: f){
            System.out.println(ft);
            
           
        }
        
        if (f.contains("banana")){
            System.out.println("\nAchamos a banana");
            
        }
        
    }


}