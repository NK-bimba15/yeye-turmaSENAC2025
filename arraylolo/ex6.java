package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex6 {
     public static void main(String[] args) {
        ArrayList<String> frutas = new ArrayList<>();
        
        
        frutas.add("Maçã");
        frutas.add("Banana");
        frutas.add("Uva");
        frutas.add("Laranja");
        frutas.add("Pera");
        

        frutas.set(3, "Morango");
        
       
        System.out.println(frutas);
    }
}

