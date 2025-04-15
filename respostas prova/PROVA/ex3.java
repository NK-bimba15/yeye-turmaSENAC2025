package PROVA;

import java.util.Scanner;

/**
 *
 * Crie uma classe Produto com atributos nome e preço. Leia 5 produtos, armazene em um
ArrayList e exiba os mais caros que R$ 100.
 * 
 * @author ADM
 */
public class ex3 {
    
    class Produto {
    String nome;
    double preco;

    
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Produto[] produtos = new Produto[5];
            
            for (int i = 0; i < produtos.length; i++) {
                System.out.println("Digite o nome do produto " + (i + 1) + ":");
                String nome = sc.nextLine();
                
                System.out.println("Digite o preço do produto " + (i + 1) + ":");
                double preco = sc.nextDouble();
                sc.nextLine();
                
//                produtos[i] = new Produto(nome,preco);
            }
            
            System.out.println("\nProdutos com preço maior que R$100,00:");
            for (Produto p : produtos) {
                if (p.preco > 100.0) {
                    System.out.println(p.nome + " - R$" + p.preco);
                }
            }
        }
    }
}
}