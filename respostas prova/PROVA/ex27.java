package PROVA;

import java.util.Scanner;

/**
 *
 * Implemente um algoritmo que leia o nome de 6 frutas e exiba somente as que inciam com vogal
 * 
 * @author ADM
 */
public class ex27 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] frutas = new String[6];

        System.out.println("Digite o nome de 6 frutas:");
        for (int i = 0; i < frutas.length; i++) {
            System.out.print("Fruta " + (i + 1) + ": ");
            frutas[i] = sc.nextLine();
        }

        System.out.println("\nFrutas que começam com vogal:");
        for (String fruta : frutas) {
            if (fruta.length() > 0) {
                char primeiraLetra = Character.toLowerCase(fruta.charAt(0));
                if (primeiraLetra == 'a' || primeiraLetra == 'e' ||
                    primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra == 'u') {
                    System.out.println(fruta);
                }
            }
        }

        sc.close();
    }
}
