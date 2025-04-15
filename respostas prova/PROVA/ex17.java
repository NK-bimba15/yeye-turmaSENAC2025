package PROVA;

/**
 *
 * Crie um metodo que receba uma matriz de 3x3 e retorne a soma dos valores da diagonal secundária (aquela que vai do canto superior direito até o inferior esquerdo) 
 * 
 * @author ADM
 */
public class ex17 {

    public static int sds(int[][] m) {
        int s = 0;

        for (int i = 0; i < 3; i++) {
            s += m[i][2 - i]; 
        }

        return s;
    }

    public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int resultado = sds(m);

        System.out.println("Soma da diagonal secundária: " + resultado);
    }
}
