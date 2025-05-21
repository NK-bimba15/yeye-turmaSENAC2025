package ex5_produtin;

/**
 *
 * @author ADM
 */
public class main {
     public static void main(String[] args) {
        Produto produto = new Produto("Caneta", 2.50, 100);

        System.out.println("Produto: " + produto.getNome());
        System.out.println("Preço: " + produto.getPreco());
        System.out.println("Estoque inicial: " + produto.getQuantidadeEmEstoque());

        int quantidadeComprar = 30;
        if (produto.comprar(quantidadeComprar)) {
            System.out.println("Compra de " + quantidadeComprar + " unidades realizada com sucesso");
        } else {
            System.out.println("Estoque insuficiente para comprar " + quantidadeComprar + " unidades");
        }

        System.out.println("Estoque atual: " + produto.getQuantidadeEmEstoque());
    }
}


