package PROVA;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * Crie um Hashset com nomes de animais digitados pelo usuário. Depois verifique duplicatas. 
 * 
 * @author ADM
 */
public class ex9 {
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> an = new HashSet<>();
        Set<String> d = new HashSet<>();

        System.out.println("Digite nomes de animais (digite 'fim' para encerrar):");

        while (true) {
            System.out.print("Animal: ");
            String nome = sc.nextLine().trim();

            if (nome.equalsIgnoreCase("fim")) {
                break;
            }

            if (!an.add(nome)) {
                d.add(nome);
            }
        }

        System.out.println("\nAnimais digitados (sem duplicatas): " + an);

        if (d.isEmpty()) {
            System.out.println("Nenhum nome duplicado foi digitado.");
        } else {
            System.out.println("Nomes duplicados encontrados: " + d);
        }

        sc.close();
    }
}


