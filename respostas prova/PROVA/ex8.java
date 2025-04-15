package PROVA;

import java.util.ArrayList;

/**
 *
 * Implemente um método que leia dois arrays e retorne um terceiro com a intercessão entre eles. 
 * 
 * @author ADM
 */
public class ex8 {
    public static int[] intersecao(int[] array1, int[] array2) {
        ArrayList<Integer> intersecao = new ArrayList<>();

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j] && !intersecao.contains(array1[i])) {
                    intersecao.add(array1[i]);
                }
            }
        }

        int[] resultado = new int[intersecao.size()];
        for (int i = 0; i < intersecao.size(); i++) {
            resultado[i] = intersecao.get(i);
        }

        return resultado;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {3, 4, 5, 6, 7};

        int[] inter = intersecao(a, b);

        System.out.println("Interseção dos arrays:");
        for (int num : inter) {
            System.out.print(num + " ");
        }
    }
}
