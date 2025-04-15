package PROVA;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * Escreva metodos de inteiros e remova os repetidos
 * 
 * @author ADM
 */
public class ex10 {
    public static int[] removerDuplicatas(int[] numeros) {
        Set<Integer> conjunto = new HashSet<>();

        for (int num : numeros) {
            conjunto.add(num);
        }

        int[] r = new int[conjunto.size()];
        int i = 0;
        for (int num : conjunto) {
            r[i++] = num;
        }

        return r;
    }

    public static void main(String[] args) {
        int[] numeros = {5, 3, 9, 5, 2, 3, 1, 9, 4};

        int[] semDuplicatas = removerDuplicatas(numeros);

        System.out.println("Array sem duplicatas:");
        for (int num : semDuplicatas) {
            System.out.print(num + " ");
        }
    }
}
