package tampa_da_caneta;

/**
 *
 * @author ADM
 */
public class kakaka {
    String modelo, cor; 
    double ponta;
    boolean tampada;

    public kakaka(String m, String c, double p) {
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.setTampar(true);
    

    }
    
    public void status() {
        System.out.println("canetosa");
        System.out.println("modelo: "+this.getModelo());
        System.out.println("Ponta: "+this.getPonta());
        System.out.println("Cor: "+this.getCor());
        System.out.println("tamparam? "+this.getTampar());
    }
    public String getCor() {
        return cor;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPonta() {
        return ponta;
    }

    public boolean getTampar() {
        return tampada;
    }

    public void setModelo(String m) {
        this.modelo = m;
    }

    public void setPonta(double p) {
        this.ponta = p;
    }

    public void setTampar(boolean t) {
        this.tampada = t;
    }
    
     public void setCor(String c) {
        this.cor = c;
     }
}

    
   
    


