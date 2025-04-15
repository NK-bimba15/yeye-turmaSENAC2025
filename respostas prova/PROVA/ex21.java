package PROVA;

import java.util.Random;

/**
 *
 * Crie um programa que gere 10 números aleatórios entre 1 a 100, armazene um array e informe os múltiples de 4 
 * 
 * @author ADM
 */
public class ex21 {
 public static void main(String[] args) {
        int[] n = new int[10];
        Random random = new Random();

        System.out.println("Números gerados:");
        for (int i = 0; i < n.length; i++) {
            n[i] = random.nextInt(100) + 1; 
            System.out.print(n[i] + " ");
        }

        System.out.println("\n\nMúltiplos de 4:");
        for (int num : n) {
            if (num % 4 == 0) {
                System.out.println(num);
            }
        }
    }
}
