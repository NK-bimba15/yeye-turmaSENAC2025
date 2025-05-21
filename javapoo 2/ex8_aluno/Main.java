package ex8_aluno;

/**
 *
 * @author ADM
 */
public class Main {
    public static void main(String[] args) {
        double[] notas = {8.5, 7.0, 9.0};
        Aluno aluno = new Aluno("Maria Silva", "20231234", notas);

        System.out.println("Nome: " + aluno.getNome());
        System.out.println("Matrícula: " + aluno.getMatricula());
        System.out.println("Média: " + aluno.calcularMedia());
    }
}
    


