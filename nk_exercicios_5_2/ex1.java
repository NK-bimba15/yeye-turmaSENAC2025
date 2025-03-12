package nk_exercicios_5_2;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int s = 0;
        int r;
            do {
             System.out.print("Digite um valor para ser somado: ");
                int n = teclado.nextInt();
                   s += n;
                System.out.print("Você quer continuar? Caso não digite '0' ");
                    r = teclado.nextInt();
            } while (r != 0);
                    System.out.println("A soma de todos os valores é: " + s);
                    teclado.close();
    }

}
