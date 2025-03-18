package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex8 {
     
    public static void main(String[] args) {
        ArrayList<String> paises = new ArrayList<>();
        
      
        paises.add("Brasil");
        paises.add("Canadá");
        paises.add("Japão");
        paises.add("Alemanha");
        paises.add("Austrália");
        
    
        for (int i = 0; i < paises.size(); i++) {
            System.out.println("País " + (i + 1) + ": " + paises.get(i));
        }
    }
}
