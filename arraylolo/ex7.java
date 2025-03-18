package arraylolo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author ADM
 */
public class ex7 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        Random random = new Random();
        
       
        for (int i = 0; i < 10; i++) {
            numeros.add(random.nextInt(100)); // Números aleatórios de 0 a 99
        }
        
      
        Collections.sort(numeros);
        
     
        System.out.println(numeros);
    }
}

