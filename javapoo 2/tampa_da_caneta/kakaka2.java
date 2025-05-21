package tampa_da_caneta;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class kakaka2 {
    String modelo, cor; 
    double ponta;
    boolean tampada;
    
    public void status() {
        System.out.println("canetosa");
        System.out.println("modelo: "+this.modelo);
        System.out.println("Ponta: "+this.ponta);
        System.out.println("Cor: "+this.cor);
        System.out.println("tamparam? "+(this.tampada ? "sim" : "não"));

}
    void escrever() {
        if(this.tampada == true){
            System.out.println("Esta tampeda");
        }else{
            System.out.println("Esta destampoeda");
        }
        
    }
    public void tampar(){
        this.tampada = true;
      
    }
    public void destampar(){
        this.tampada = false;
}
    public boolean Perguntartampada(){
        Scanner sc2 = new Scanner (System.in);
        System.out.println("Tapeda? (si/no)");
        String resposta = sc2.nextLine().toLowerCase();
        
        if(resposta.equals("si")){
            return true;
        }else if (resposta.equals("no")){
            return false;
        }else{
            System.out.println("Try denovo");
            return Perguntartampada();
        }
    }
    
}
