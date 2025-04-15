package PROVA;

import java.util.Scanner;

/**
 *
 * Crie um programa que leia um texto e substitua todas vogais em "*"
 * 
 * @author ADM
 */
public class ex24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um texto: ");
        String texto = sc.nextLine();

        String resultado = texto.replaceAll("(?i)[aeiou]", "*");

        System.out.println("Texto com vogais substituídas: ");
        System.out.println(resultado);

        sc.close();
    }
}
