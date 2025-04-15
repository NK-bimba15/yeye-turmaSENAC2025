package PROVA;

import java.util.Scanner;

/**
 *
 * Crie um programa que leia um número inteiro e diga se é um quadrado perfeito usando Math.sqrt.
 * 
 * @author ADM
 */
public class ex11 {
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = sc.nextInt();

        double raiz = Math.sqrt(numero);

        if (raiz == (int) raiz) {
            System.out.println(numero + " é um quadrado perfeito.");
        } else {
            System.out.println(numero + " NÃO é um quadrado perfeito.");
        }

        sc.close();
    }
}
