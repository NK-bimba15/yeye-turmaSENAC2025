package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex4 {
    public static void main(String[] args) {
        
                ArrayList<String> c = new ArrayList <>();

                c.add("Vermelho");
                c.add("Azul");
                c.add("Verde");
                
        boolean ca = c.contains("Amarelo");
        
        System.out.println("Na lista contem amarelo? "+ca);
    }
}
