package nk_exercicios_5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex_while_dolar {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        double cd = 5.79;
        System.out.println("Quantas vezes você quer converter? ");
        int v = teclado.nextInt();
        int c = 1;
        
        while (c <= v){
            System.out.println("Qual o valor em real? ");
            double vr = teclado.nextDouble();
            double vd = vr / cd;
            System.out.println("o valor convertido é: "+vd);
            c++;
        }
    }

}
