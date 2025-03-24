package Hashset;

import java.util.HashSet;


/**
 *
 * @author ADM
 */
public class ex3 {
    
    public static void main(String[] args) {
        
        HashSet<Integer> ns = new HashSet<>();

       
        for (int i = 1; i <= 5; i++) {
            ns.add(i);
        }

     
        System.out.println("HashSet antes: " + ns);

        ns.clear();

        if (ns.isEmpty()) {
            System.out.println("O HashSet está vazio.");
        }
    }
}



