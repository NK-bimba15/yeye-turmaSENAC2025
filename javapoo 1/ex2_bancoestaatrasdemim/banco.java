package ex2_bancoestaatrasdemim;

/**
 *
 * @author ADM
 */
public class banco {
    String numeroConta;
    double saldo;
    String titular;
    
    void depositar (double valor){
        saldo+=valor;
        System.out.println("Deposito de R$"+valor+"realizando com sucesso.\nNovo saçdo: R$"+saldo);
    }
    
    void sacar (double valor) {
        if (valor <= saldo){
            saldo-=valor;
            System.out.println("saque de R$"+valor+" realizado com sucesso.\n Novo saldo: R$"+saldo);
        }else{
            System.out.println("Saldo pra saque");
        }
        
    }

}
