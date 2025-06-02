package ex4;

/**
 *
 * @author ADM
 */
public class TesteContas {
public void executarTestes() {
        ContaBancaria cc = new ContaCorrente("CC123", 500.0);
        ContaPoupanca cp = new ContaPoupanca("CP456", 1000.0);

        cc.depositar(300);
        cc.sacar(1000);
        cc.exibirSaldo();

        cp.depositar(200);
        cp.sacar(150);
        cp.aplicarRendimento(); // aplicar rendimento da poupança
        cp.exibirSaldo();
    }
}
