package ex3;

/**
 *
 * @author ADM
 */
public abstract class Funcionario {
    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    public abstract double calcularBonus();

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário base: R$ " + salario);
        System.out.println("Bônus: R$ " + calcularBonus());
        System.out.println("Salário Total: R$ " + (salario + calcularBonus()));
        System.out.println("---------------------------");
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.20; // 20% de bônus
    }
}

class Vendedor extends Funcionario {
    public Vendedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.10; // 10% de bônus
    }
}

class Desenvolvedor extends Funcionario {
    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public double calcularBonus() {
        return salario * 0.15; // 15% de bônus
    }
}

