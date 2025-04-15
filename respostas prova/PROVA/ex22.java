package PROVA;

import java.util.Scanner;

/**
 *
 * Escreve um algoritmo que leia uma matriz de 4x4 e informe o maior números de cada coluna 
 * 
 * @author ADM
 */
public class ex22 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];

        System.out.println("Digite os elementos da matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nMaior número de cada coluna:");

        for (int col = 0; col < 4; col++) {
            int maior = matriz[0][col]; 

            for (int lin = 1; lin < 4; lin++) {
                if (matriz[lin][col] > maior) {
                    maior = matriz[lin][col];
                }
            }

            System.out.println("Coluna " + col + ": " + maior);
        }

        sc.close();
    }
}
