package ex7_livros;

/**
 *
 * @author ADM
 */
public class lalalalalalalaalalalala {
    String titulo; 
    String autor;
    int anopubli;
    boolean dispo;
    
    void emprestar(){
        if(dispo){
            dispo = false;
            System.out.println("Livro "+titulo+" emprestado com sucesso.");
            
        }else{
            System.out.println("Livro "+titulo+" não esta desponivel para empréstimo.");
        }
    }
    void devolver (){
        if(!dispo){
            dispo = true;
            System.out.println("Livro "+titulo+" esta disponivel com sucesso.");
        }
    
}
          

}
