package for_each;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex3 {
    public static void main(String[] args) {
        ArrayList<Integer> nms = new ArrayList<>();
        
        nms.add(10);
        nms.add(25);
        nms.add(3);
        nms.add(78);
        nms.add(56);
        nms.add(89);
        nms.add(12);
        
        System.out.println(nms);
        
        int[] n = {10, 25, 3, 78, 56, 89, 12};
        int m = Integer.MIN_VALUE;

        for (int num : n) {
            if (num > m) {
                m = num;
            }
        }

        System.out.println("O maior número é: " + m);
    }
}



