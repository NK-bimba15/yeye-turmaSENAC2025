package ex16_aviao;

/**
 *
 * @author ADM
 */
public class main {
    public static void main(String[] args) {
        Aviao aviao = new Aviao("Boeing 747", 416, 920.0);

        System.out.println("Informações do Avião:");
        System.out.println("Modelo: " + aviao.getModelo());
        System.out.println("Capacidade de Passageiros: " + aviao.getCapacidadePassageiros());
        System.out.println("Velocidade Máxima: " + aviao.getVelocidadeMaxima() + " km/h");
    }
}

