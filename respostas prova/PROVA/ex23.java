package PROVA;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * Crie um código que leia 8 valores e exiba o segundo maior valor. 
 * 
 * @author ADM
 */
public class ex23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[8];

        System.out.println("Digite 8 valores inteiros:");
        for (int i = 0; i < valores.length; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            valores[i] = sc.nextInt();
        }

        Arrays.sort(valores);

        int sm = valores[6];

        System.out.println("\nSegundo maior valor: " + sm);

        sc.close();
    }
}
