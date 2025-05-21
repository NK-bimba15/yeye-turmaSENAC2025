package ex4_bookonthetable;

/**
 *
 * @author ADM
 */
public class main {
    public static void main(String[] args) {
       
        Livro livro = new Livro("1984", "George Orwell", 1949);

        
        System.out.println("Título: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano de Publicação: " + livro.getAnoPublicacao());
        System.out.println("Está disponível? " + livro.isDisponivel());

        
        livro.emprestar();
        System.out.println("Livro emprestado. Está disponível? " + livro.isDisponivel());

       
        livro.devolver();
        System.out.println("Livro devolvido. Está disponível? " + livro.isDisponivel());
    }
}


