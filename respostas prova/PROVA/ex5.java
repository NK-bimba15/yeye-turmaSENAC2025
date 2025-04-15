package PROVA;

import java.util.Scanner;

/**
 *
 * Desenvolva um algoritmo que leia idade de um grupo e informe quantas pessoas tem entre 18 a 30
 * 
 * @author ADM
 */
public class ex5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int quantidade;
        int contador = 0;

        System.out.println("Digite a quantidade de pessoas no grupo:");
        quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = sc.nextInt();

            if (idade >= 18 && idade <= 30) {
                contador++;
            }
        }

        System.out.println("\nNúmero de pessoas com idade entre 18 e 30 anos: " + contador);

        sc.close();
    }
}
