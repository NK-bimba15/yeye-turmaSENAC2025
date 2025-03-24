package Hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADM
 */
public class ex10 {
    
    public static void main(String[] args) {
        
        Set<String> a = new HashSet <>();
        
        a.add("gato");
        a.add("cachorro");
        a.add("leão");
        a.add("tigre");
        
        System.out.println("lista 1:"+a);
        
          a.clear();
        
        a.add("guepardo");
        a.add("urso");
        a.add("axolote");
        a.add("pato");
        
        
        System.out.println("lista 2:"+a);
          
        
    }
   
        
    } 
        


        
       