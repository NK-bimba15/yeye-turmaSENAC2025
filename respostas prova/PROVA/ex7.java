package PROVA;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * Crie um programa que leia 10 números e armazene apenas os ímpares em um ArrayList.
Depois, mostre-os em ordem reversa.
 * 
 * @author ADM
 */
public class ex7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> impares = new ArrayList<>();

        System.out.println("Digite 10 números:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Número " + i + ": ");
            int num = sc.nextInt();

            if (num % 2 != 0) {
                impares.add(num); 
            }
        }

        Collections.reverse(impares);

        System.out.println("\nNúmeros ímpares em ordem reversa:");
        for (int num : impares) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}
