package ex3_car;

import ex3_car.carrosmaneiros.Atividade3;


/**
 *
 * @author ADM
 */
public class maino {
     public static void main(String[] args) {
        
        Atividade3.Carro carro = new Atividade3.Carro("Ford", "Fiesta", 2012);
        
        carro.ligar();
        carro.desligar();
     }
}