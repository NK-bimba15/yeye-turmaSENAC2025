package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex10 {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();
        
        
        animais.add("Cachorro");
        animais.add("Gato");
        animais.add("Elefante");
        animais.add("Leão");
        
       
        ArrayList<String> copiaAnimais = new ArrayList<>(animais);
        
    
        System.out.println(copiaAnimais);
    }
}

