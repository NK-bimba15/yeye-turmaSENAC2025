package ex8;

/**
 *
 * @author ADM
 */
public interface InstrumentoMusical {
    void tocar();
}

class Guitarra implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Guitarra: *som de guitarra* ");
    }
}

class Piano implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Piano: Plim plim plom ");
    }
}

class Bateria implements InstrumentoMusical {
    @Override
    public void tocar() {
        System.out.println("Bateria: Tum tum pá ");
    }
}

