package ex6_retangulo;

/**
 *
 * @author ADM
 */
public class main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo(5.0, 3.0);

        System.out.println("Largura: " + ret.getLargura());
        System.out.println("Altura: " + ret.getAltura());
        System.out.println("Área: " + ret.calcularArea());
        System.out.println("Perímetro: " + ret.calcularPerimetro());
    }
}

