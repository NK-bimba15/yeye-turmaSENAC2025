package ex15_emprego;

/**
 *
 * @author ADM
 */
public class Main {
public static void main(String[] args) {
        Empregado empregado = new Empregado("Ana Oliveira", "Analista de Sistemas", 6000.00);

        System.out.println("Dados do Empregado:");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Cargo: " + empregado.getCargo());
        System.out.println("Salário: R$ " + empregado.getSalario());
        System.out.println("Bônus (10%): R$ " + empregado.calcularBonus());
    }
}

