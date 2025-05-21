package ex7_circulolo;

/**
 *
 * @author ADM
 */
public class Circulo {
     private double raio;

    public Circulo(double raio) {
        this.raio = raio;
        
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * raio;
    }
}




