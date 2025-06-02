package ex9;

/**
 *
 * @author ADM
 */
public interface Desenho {
    void desenhar();
}

class Circulo implements Desenho {
    public void desenhar() {
        System.out.println("Círculo: ( )");
    }
}

class Quadrado implements Desenho {
    public void desenhar() {
        System.out.println("Quadrado: [ ]");
    }
}

class Triangulo implements Desenho {
    public void desenhar() {
        System.out.println("Triângulo: /_\\");
    }
}

