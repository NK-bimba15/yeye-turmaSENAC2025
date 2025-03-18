package arraylolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADM
 */
public class ex9 {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> nm = new ArrayList <>();
        Collections.addAll(nm,10,20,30,40,50,20,60,30,70,80);
        
        Set<Integer> unicos = new HashSet<>();
        Set<Integer> duplicatas = new HashSet <>();
        
        for (int num : nm) {
            if (!unicos.add(num)){
                duplicatas.add(num);
            }
        }
        
        if (!duplicatas.isEmpty()){
            System.out.println("Numeros encontrados: "+duplicatas);
        }else{
            System.out.println("Não há duplicatas.");
        }
      
    }
}
