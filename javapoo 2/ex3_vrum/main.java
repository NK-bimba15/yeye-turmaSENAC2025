package ex3_vrum;

/**
 *
 * @author ADM
 */
public class main {
    
    public static void main(String[] args) {
        
        Carro meuCarro = new Carro("Toyota", "Corolla", 2020);

        System.out.println("Marca: " + meuCarro.getMarca());
        System.out.println("Modelo: " + meuCarro.getModelo());
        System.out.println("Ano: " + meuCarro.getAno());
        System.out.println("Está ligado? " + meuCarro.isLigado());
       
    }
}



