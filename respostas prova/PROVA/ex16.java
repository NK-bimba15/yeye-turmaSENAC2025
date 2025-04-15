package PROVA;

import java.util.Scanner;

/**
 *
 * Implemente um sistema que cadastre produtos com nome e preço e depois liste os que tem desconto (preço < 50)
 * 
 * @author ADM
 */
public class ex16 {
 class Produto {
    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class CadastroProdutos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Produto[] produtos = new Produto[5]; 

        System.out.println("Cadastro de Produtos:");

        
        for (int i = 0; i < produtos.length; i++) {
            System.out.print("Nome do produto " + (i + 1) + ": ");
            String nome = sc.nextLine();

            System.out.print("Preço do produto " + (i + 1) + ": R$ ");
            double preco = sc.nextDouble();
            sc.nextLine(); 

//            produtos[i] = Produto(nome, preco);
        }

        System.out.println("\nProdutos com desconto (preço menor que R$50):");
        boolean encontrou = false;
        for (Produto p : produtos) {
            if (p.preco < 50.0) {
                System.out.println("- " + p.nome + " | R$ " + p.preco);
                encontrou = true;
            }
        }

        if (!encontrou) {
            System.out.println("Nenhum produto com desconto.");
        }

        sc.close();
    }
}
}


