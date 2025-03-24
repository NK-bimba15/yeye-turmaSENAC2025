package Hashset;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author ADM
 */
public class ex1 {
    public static void main(String[] args) {
        
        Set<Integer> n = new HashSet <>();
        
        n.add(1);
        n.add(2);
        n.add(3);
        n.add(4);
        n.add(5);
        n.add(6);
        n.add(7);
        n.add(8);
        n.add(9);
        n.add(10);
        
        for (Integer num: n){
            System.out.println(num);
             
        }
       
         if (n.contains(5)){
            System.out.println("\n5 esta presente");
        
    }

}
}