package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex2 {
 public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        
        
        for (int i = 1; i <= 10; i++) {
            numeros.add(i);
        }
        
        numeros.removeIf(n -> n % 2 == 0);
        
        System.out.println(numeros);
    }
}

