package nk_exercicios_5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex3 {
 public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n;

        System.out.print("Digite um número inteiro positivo: ");
        n = teclado.nextInt();

        while (n <= 0) {
            System.out.println("Número inválido! Digite um número inteiro positivo.");
            System.out.print("Digite um número inteiro positivo: ");
            n = teclado.nextInt();
        }

        int c = 1;
        while (c <= 10) {
            System.out.println(n + " x " + c + " = " + (n * c));
            c++;
        }
        
        teclado.close();
    }
}


