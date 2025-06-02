package ex10;

/**
 *
 * @author ADM
 */
public class TestePessoas {
    public void executar() {
        Pessoa[] pessoas = {
            new Professor("Luciana", "História"),
            new Aluno("Rafael", "Engenharia"),
            new Funcionario("João", "Administrativo")
        };

        for (Pessoa p : pessoas) {
            p.apresentar();
        }
    }
}

