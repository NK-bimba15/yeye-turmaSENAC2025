package Hashset;

import java.util.HashSet;

/**
 *
 * @author ADM
 */
public class ex9 {
    
    public static void main(String[] args) {
        
    
        HashSet<Character> letras = new HashSet<>();

        
        for (char c = 'A'; c <= 'Z'; c++) {
            letras.add(c);
        }

     
        System.out.println("Tamanho do HashSet: " + letras.size());
    }
}


