package ex2_animal;

/**
 *
 * @author nicka
 */
public class Main {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal gato = new Gato();
        Animal passaro = new Passaro();
        
        System.out.println("Emissão de sons dos animais:");
        cachorro.emitirSom();
        gato.emitirSom();
        passaro.emitirSom();

    }
}
    
