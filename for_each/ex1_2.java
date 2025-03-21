package for_each;

/**
 *
 * @author ADM
 */
public class ex1_2 {
     public static void main(String[] args) {
       
        int[] n = {5, 12, 8, 20, 15, 3, 7, 25, 10, 11};

        int c = 0;

        
        for (int num : n) {
            if (num > 10) {
                c++;
            }
        }
     }

}