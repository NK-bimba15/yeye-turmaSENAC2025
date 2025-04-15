package PROVA;

/**
 *
 * Implemente um programa que leia nomes de 10 alunos em um ArrayList e exiba apenas os que têm mais de 6 letras.
 * 
 * @author ADM
 */
public class ex2 {
    public static void main(String[] args) {
        
        String[] nomes = {"Amanda", "João", "Carolina", "Lucas", "Fernanda", "Ana", "Gabriel","Julia","Maria","Persephone"};

        System.out.println("Nomes com mais de 6 letras:");

        
        for (String nome : nomes) {
            if (nome.length() > 6) {
                System.out.println(nome);
            }
        }
    }
}
