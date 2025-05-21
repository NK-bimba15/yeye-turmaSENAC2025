package ex7_circulolo;

/**
 *
 * @author ADM
 */
public class Main {
     public static void main(String[] args) {
        Circulo c = new Circulo(2.5);

        System.out.println("Raio: " + c.getRaio());
        System.out.println("Área: " + c.calcularArea());
        System.out.println("Circunferência: " + c.calcularCircunferencia());
    }
}


