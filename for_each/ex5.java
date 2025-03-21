package for_each;

import java.util.HashSet;

/**
 *
 * @author ADM
 */
public class ex5 {
         public static void main(String[] args) {
       
        HashSet<String> nomes = new HashSet<>();
       
        nomes.add("Alice");
        nomes.add("Bruno");
        nomes.add("Carlos");
        nomes.add("Diana");

        System.out.println("Elementos do HashSet:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }

}
