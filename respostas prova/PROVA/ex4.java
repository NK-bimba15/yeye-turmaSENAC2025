package PROVA;

import java.util.Scanner;

/**
 *
 * Crie um programa que leia frases e conte quantas palavras tem mais de 4 letras. 
 * 
 * @author ADM
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite uma frase:");
        String frase = sc.nextLine();

        String[] palavras = frase.split(" ");

        int contador = 0;

        for (String palavra : palavras) {
            if (palavra.length() > 4) {
                contador++;
            }
        }

        System.out.println("Número de palavras com mais de 4 letras: " + contador);

        sc.close();
    }
}

