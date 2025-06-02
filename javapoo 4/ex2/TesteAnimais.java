package ex2;

/**
 *
 * @author ADM
 */
public class TesteAnimais {

    public void executarTestes() {
        Animal a1 = new Cachorro();
        Animal a2 = new Gato();
        Animal a3 = new Vaca();

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
    }
}


