package PROVA;

/**
 *
 * Crie um método que verifique se dois arrays de inteiros são iguais, considerando a ordem
dos elementos.
 * 
 * @author ADM
 */
public class ex6 {
    public static boolean saoIguais(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            return false;
        }

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {1, 2, 3, 4};
        int[] c = {4, 3, 2, 1};

        System.out.println("a e b são iguais? " + saoIguais(a, b)); 
        System.out.println("a e c são iguais? " + saoIguais(a, c)); 
    }
}


