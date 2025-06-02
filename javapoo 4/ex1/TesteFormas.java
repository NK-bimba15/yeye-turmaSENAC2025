package ex1;

/**
 *
 * @author ADM
 */
public class TesteFormas {

    public void executarTestes() {
        Forma f1 = new Circulo(5.0);
        Forma f2 = new Retangulo(4.0, 6.0);
        Forma f3 = new Triangulo(3.0, 4.0);

        System.out.println("Área do Círculo: " + f1.calcularArea());
        System.out.println("Área do Retângulo: " + f2.calcularArea());
        System.out.println("Área do Triângulo: " + f3.calcularArea());
    }
}



