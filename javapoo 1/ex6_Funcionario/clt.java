package ex6_Funcionario;

/**
 *
 * @author ADM
 */
public class clt {
    
    public class Atividade6 {
    public static class Funcionario {
        private String nome;
        private double salario;
        private String departamento;

        public Funcionario(String nome, double salario, String departamento) {
            this.nome = nome;
            this.salario = salario;
            this.departamento = departamento;
        }

        public void aumentarSalario(double percentual) {
            salario += salario * (percentual / 100);
        }

        public double getSalario() {
            return salario;
        }
    }
}


}
