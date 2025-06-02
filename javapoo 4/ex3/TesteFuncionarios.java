package ex3;

/**
 *
 * @author ADM
 */
public class TesteFuncionarios {
 public void executarTestes() {
        Funcionario f1 = new Gerente("Alice", 8000.0);
        Funcionario f2 = new Vendedor("Bruno", 4000.0);
        Funcionario f3 = new Desenvolvedor("Carlos", 6000.0);

        f1.exibirInformacoes();
        f2.exibirInformacoes();
        f3.exibirInformacoes();
    }
}





