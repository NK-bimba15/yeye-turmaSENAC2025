package for_each;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex4 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

      
        System.out.print("Quantas notas deseja inserir? ");
        int q = teclado.nextInt();
        
        double[] n = new double[q];
        double s = 0;

        
        for (int i = 0; i < q; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            n[i] = teclado.nextDouble();
            s += n[i];
        }
       
        double m = s / q;
       
        System.out.printf("A média das notas é: %.2f%n", m);

        teclado.close();
    }
}



