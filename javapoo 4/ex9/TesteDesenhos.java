package ex9;

/**
 *
 * @author ADM
 */
public class TesteDesenhos {
    public void executar() {
        Desenho[] desenhos = {
            new Circulo(),
            new Quadrado(),
            new Triangulo()
        };

        for (Desenho d : desenhos) {
            d.desenhar();
        }
    }
}
