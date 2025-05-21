package ex1_ClasseP;

/**
 *
 * @author ADM
 */
public class main {
    public static void main(String[] args) {
        
        peso p1 = new peso ("momo",18,1.40);
        
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Idade: "+p1.getIdade());
        System.out.println("Altura: "+p1.getAltura());
    }

}
