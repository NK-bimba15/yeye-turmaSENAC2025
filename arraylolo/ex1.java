package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex1 {
    public static void main(String[] args) {
        
        ArrayList<String> lc = new ArrayList <>();
        
        lc.add("Gramado");
        lc.add("Canela");
        lc.add("Torres");
        lc.add("Bento Gonçalves");
        lc.add("Nova Petrópolis");
        
        for (String ns : lc){
        System.out.println(ns);
        
        }
        int t = lc.size();
        System.out.println("\nSuas "+t+" Turisticas no RS estão a cima");
        
    }

}
