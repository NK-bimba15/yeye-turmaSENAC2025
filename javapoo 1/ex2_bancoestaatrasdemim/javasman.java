package ex2_bancoestaatrasdemim;

/**
 *
 * @author ADM
 */
public class javasman {
    public static void main(String[] args) {
           banco conta1 = new banco();
           conta1.numeroConta = "12345-6";
           conta1.titular = "nk";
           conta1.saldo = 200.0;
           
           conta1.depositar(20.0);
           conta1.sacar(12);
                   
    }
}
