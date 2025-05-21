package ex2_conta;

/**
 *
 * @author ADM
 */
public class co {
    private int nc;
    private double s;
    private String titular;

    public co(int nc, double s, String titular) {
        this.nc = nc;
        this.s = s;
        this.titular = titular;
    }

    public int getNc() {
        return nc;
    }

    public double getS() {
        return s;
    }

    public String getTitular() {
        return titular;
    }

    public void setNc(int nc) {
        this.nc = nc;
    }

    public void setS(double s) {
        this.s = s;
    }

    public void setTitular(String t) {
        this.titular = t;
    }
    
    private void depositar(double valor){
        if (valor>0){
            this.s += valor;
            System.out.println("Deposito "+valor+" feito");
        }else{
            System.out.println("negado");
        }
    }

    public void sacar (double valor){
        if (valor > 0 && valor <= s){
            s -= valor;
            System.out.println("saque "+valor+" feito");
        }else{
            System.out.println("negado");
        }
    }
    
    public void exibirinfo () {
        System.out.println("\n titulo: "+titular);
        System.out.println("conta: "+nc);
        System.out.println("Saldo atual: "+s);
    }
}
