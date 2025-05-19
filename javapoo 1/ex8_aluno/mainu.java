package ex8_aluno;

import ex8_aluno.salala.Atividade8;

/**
 *
 * @author ADM
 */
public class mainu {
    
    public static void main(String[] args) {
         
        double[] notas = {8.0, 7.5, 9.0};
        Atividade8.Aluno aluno = new Atividade8.Aluno("Maria", 1234, notas);
        System.out.println("Média do aluno: " + aluno.calcularMedia());

    }

    
}
