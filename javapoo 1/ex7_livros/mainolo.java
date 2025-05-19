package ex7_livros;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class mainolo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        lalalalalalalaalalalala livro = new lalalalalalalaalalalala();
        
        System.out.println("Digite o titulo do livro:");
        livro.titulo = sc.nextLine();
        
        System.out.println("Digite autor:");
        livro.autor = sc.nextLine();
        
        System.out.println("Digite ano da publi:");
        livro.anopubli = sc.nextInt();
        
       livro.dispo = true;
       
        System.out.println(" INFORMAÇÕES DO LIVRO CADASTRADO ");
        System.out.println(" Titulo:"+livro.titulo);
        System.out.println(" Autor:"+livro.autor);
        System.out.println("Ano da publi:"+livro.anopubli);
        
        System.out.println("\nDeseja emprestar o livro? (s/n)");
        sc.nextLine();
        String opcao = sc.nextLine(); 
           
        if (opcao.equalsIgnoreCase("s")){
            livro.emprestar();
        }
        
        System.out.println("\nDeseja emprestar o livro? (s/n)");
        sc.nextLine();
           
        if (opcao.equalsIgnoreCase("n")){
            livro.devolver();
        
        
    }
}
}