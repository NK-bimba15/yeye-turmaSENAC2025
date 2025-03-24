package Hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 *
 * @author ADM
 */
public class ex5 {
    
    public static void main(String[] args) {
        
        HashSet<String> c = new HashSet<>();

        
        c.add("Vermelho");
        c.add("Azul");
        c.add("Verde");
        c.add("Amarelo");

        
        List<String> l = new ArrayList<>(c);

        
        System.out.println("Lista de cores: " + l);
    }
}
