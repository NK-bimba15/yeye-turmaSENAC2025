package ex5;

/**
 *
 * @author ADM
 */
public interface Impressora {
    void imprimir(String documento);
}

class ImpressoraJatoDeTinta implements Impressora {
    @Override
    public void imprimir(String documento) {
        System.out.println("[Jato de Tinta] Imprimindo: " + documento);
    }
}

class ImpressoraLaser implements Impressora {
    @Override
    public void imprimir(String documento) {
        System.out.println("[Laser] Imprimindo: " + documento);
    }
}




