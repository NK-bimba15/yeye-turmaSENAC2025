package ex4;

/**
 *
 * @author ADM
 */
public abstract class ContaBancaria {
    protected String numeroConta;
    protected double saldo;

    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    public abstract void depositar(double valor);
    public abstract void sacar(double valor);

    public void exibirSaldo() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Saldo atual: R$ " + saldo);
        System.out.println("---------------------------");
    }
}

class ContaCorrente extends ContaBancaria {
    private double limiteSaque = 1000.0;

    public ContaCorrente(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo + limiteSaque) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido na conta corrente.");
        }
    }
}

class ContaPoupanca extends ContaBancaria {
    private double rendimentoMensal = 0.005; // 0.5% ao mês

    public ContaPoupanca(String numeroConta, double saldoInicial) {
        super(numeroConta, saldoInicial);
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    @Override
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saque inválido na conta poupança.");
        }
    }

    public void aplicarRendimento() {
        saldo += saldo * rendimentoMensal;
    }
}

