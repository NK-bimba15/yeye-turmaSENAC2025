package Hashset;

import java.util.HashSet;

/**
 *
 * @author ADM
 */
public class ex8 {
    public static void main(String[] args) {
        
        HashSet<String> cidades = new HashSet<>();

        cidades.add("Rio de Janeiro");
        cidades.add("São Paulo");
        cidades.add("Belo Horizonte");
        cidades.add("Curitiba");

        cidades.remove("São Paulo");

        
        System.out.println("Cidades após remoção: " + cidades);
    }
}

       
