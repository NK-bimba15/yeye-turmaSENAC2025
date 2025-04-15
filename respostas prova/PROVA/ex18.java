package PROVA;

import java.util.Scanner;

/**
 *
 * Faça um programa que leia uma matriz 3x3 e verifique se ela é uma matriz identidade. 
 * 
 * @author ADM
 */
public class ex18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        System.out.println("Digite os elementos da matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        boolean identidade = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j && matriz[i][j] != 1) {
                    identidade = false;
                } else if (i != j && matriz[i][j] != 0) {
                    identidade = false;
                }
            }
        }

        if (identidade) {
            System.out.println("\nA matriz é uma matriz identidade.");
        } else {
            System.out.println("\nA matriz NÃO é uma matriz identidade.");
        }

        sc.close();
    }
}


