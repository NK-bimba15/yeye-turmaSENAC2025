package PROVA;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * Crie metodo que receba um array inteiro e retorne os maiores com a média
 * 
 * @author ADM
 */
public class ex1 {
    
    public static List<Integer> maioresQueMedia(int[] numeros) {
        List<Integer> m = new ArrayList<>();

        if (numeros == null || numeros.length == 0) {
            return m; 
        }

        
        int s = 0;
        for (int num : numeros) {
            s += num;
        }

        
        double media = (double) s / numeros.length;

        
        for (int num : numeros) {
            if (num > media) {
                m.add(num);
            }
        }

        return m;
    }

    public static void main(String[] args) {
        int[] array = {10, 20, 30, 40, 50};
        List<Integer> r = maioresQueMedia(array);

        System.out.println("Números maiores que a média: " + r);
    }
}
