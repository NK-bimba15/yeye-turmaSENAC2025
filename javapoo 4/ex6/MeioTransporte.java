package ex6;

/**
 *
 * @author ADM
 */
public interface MeioTransporte {
    void mover();
}

class Carro implements MeioTransporte {
    @Override
    public void mover() {
        System.out.println("O carro está se movendo pelas estradas.");
    }
}

class Aviao implements MeioTransporte {
    @Override
    public void mover() {
        System.out.println("O avião está voando pelos céus.");
    }
}

class Navio implements MeioTransporte {
    @Override
    public void mover() {
        System.out.println("O navio está navegando pelos mares.");
    }
}
