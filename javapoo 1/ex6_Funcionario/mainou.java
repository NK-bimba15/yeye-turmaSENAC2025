package ex6_Funcionario;

import ex6_Funcionario.clt.Atividade6;

/**
 *
 * @author ADM
 */
public class mainou {
    public static void main(String[] args) {
        
   
        Atividade6.Funcionario func = new Atividade6.Funcionario("João", 3000.0, "TI");
        func.aumentarSalario(10);
        System.out.println("Novo salário: " + func.getSalario());
    }

}
