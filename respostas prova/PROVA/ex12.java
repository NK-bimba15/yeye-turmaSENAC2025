package PROVA;

/**
 *
 * Crie um metodo que receba um array de doubles e retorne a medida dos valores maiores que 5.0
 * 
 * @author ADM
 */
public class ex12 {
    public static double mmqc(double[] valores) {
        double s = 0;
        int c = 0;

        for (double valor : valores) {
            if (valor > 5.0) {
                s += valor;
                c++;
            }
        }

        if (c == 0) {
            return 0.0; 
        }

        return s / c;
    }

    public static void main(String[] args) {
        double[] numeros = {4.5, 6.2, 5.0, 7.1, 3.3, 8.0};

        double media = mmqc(numeros);

        System.out.println("Média dos valores maiores que 5.0: " + media);
    }
}
