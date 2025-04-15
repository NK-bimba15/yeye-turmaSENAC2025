package PROVA;

import java.util.Scanner;

/**
 *
 * Escreva um código que leia 5 palavras e diga quais contem "e" mais de uma vez
 * 
 * @author ADM
 */
public class ex15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] palavras = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite a palavra " + (i + 1) + ": ");
            palavras[i] = sc.nextLine();
        }

        System.out.println("\nPalavras que contêm a letra 'e' mais de uma vez:");

        for (String palavra : palavras) {
            int ce = 0;

            for (int i = 0; i < palavra.length(); i++) {
                if (palavra.charAt(i) == 'e' || palavra.charAt(i) == 'E') {
                    ce++;
                }
            }

            if (ce > 1) {
                System.out.println(palavra);
            }
        }

        sc.close();
    }
}

