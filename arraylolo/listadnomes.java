package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class listadnomes {
    public static void main(String[] args) {
        
        ArrayList<String> listadnomes = new ArrayList <>();
        
        listadnomes.add("NK");
        listadnomes.add("Rodrigo");
        listadnomes.add("Luiz");
        
        for (String nome : listadnomes){
        System.out.println(nome);
        
        }
        
        int t = listadnomes.size();
        System.out.println("\nNa nossa salla possuem "+t+" alunos.");
//        String pn = listadnomes.get(1);
//        System.out.println(pn);

        boolean contemRodrigo = listadnomes.contains("Rodrigo");
        
        System.out.println("Na turma contem um rodrigo? "+contemRodrigo);
        

    }

}
 