package ex5;

/**
 *
 * @author ADM
 */
public class TesteImpressoras {

    public void executarTestes() {
        Impressora jato = new ImpressoraJatoDeTinta();
        Impressora laser = new ImpressoraLaser();

        jato.imprimir("Relatório de Vendas");
        laser.imprimir("Fatura do Cliente");
    }
}

