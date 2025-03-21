package for_each;

/**
 *
 * @author ADM
 */
public class ex1 {
    
    public static void main(String[] args) {
        
        int[] n = {10, 20, 30, 40, 50};

        
        int s = 0;

        
        for (int num : n) {
            s += num;
        }

        
        System.out.println("A soma dos elementos do array é: " + s);
    }
}



 