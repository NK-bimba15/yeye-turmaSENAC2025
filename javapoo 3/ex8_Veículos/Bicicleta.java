/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_Veículos;

/**
 *
 * @author nicka
 */
public class Bicicleta implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Bicicleta ganhando velocidade com pedaladas.");
    }

    @Override
    public void frear() {
        System.out.println("Bicicleta freando com manetes.");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Bicicleta virando o guidão para a " + direcao + ".");
    }  
}
