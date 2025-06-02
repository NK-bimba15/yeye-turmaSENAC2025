package ex6;

/**
 *
 * @author ADM
 */
public class TesteTransportes {
 public void executarTestes() {
        MeioTransporte carro = new Carro();
        MeioTransporte aviao = new Aviao();
        MeioTransporte navio = new Navio();

        carro.mover();
        aviao.mover();
        navio.mover();
    }

}
