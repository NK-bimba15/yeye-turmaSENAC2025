package ex8;

/**
 *
 * @author ADM
 */
public class TesteInstrumentos {
    public void executarTestes() {
        InstrumentoMusical guitarra = new Guitarra();
        InstrumentoMusical piano = new Piano();
        InstrumentoMusical bateria = new Bateria();

        guitarra.tocar();
        piano.tocar();
        bateria.tocar();
    }

}
