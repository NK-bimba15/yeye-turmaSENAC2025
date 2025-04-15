package PROVA;

import java.util.Scanner;

/**
 *
 * Implemente um código que leia uma frase e diga se ela contem "java", ignorando maiúsculo/minúsculo 
 * 
 * @author ADM
 */
public class ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        if (frase.toLowerCase().contains("java")) {
            System.out.println("A frase contém a palavra 'java'.");
        } else {
            System.out.println("A frase NÃO contém a palavra 'java'.");
        }

        sc.close();
    }
}


