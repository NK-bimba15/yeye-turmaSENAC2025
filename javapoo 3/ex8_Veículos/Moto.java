/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_Veículos;

/**
 *
 * @author nicka
 */
public class Moto implements Veiculo {
    @Override
    public void acelerar() {
        System.out.println("Moto acelerando rapidamente.");
    }

    @Override
    public void frear() {
        System.out.println("Moto freando com freio a disco.");
    }

    @Override
    public void virar(String direcao) {
        System.out.println("Moto inclinando para a " + direcao + " para virar.");
    }   
}
