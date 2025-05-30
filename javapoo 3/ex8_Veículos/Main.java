/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex8_Veículos;

/**
 *
 * @author nicka
 */
public class Main {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo moto = new Moto();
        Veiculo bicicleta = new Bicicleta();

        System.out.println("--- Testando veículos ---");

        carro.acelerar();
        carro.virar("direita");
        carro.frear();

        System.out.println();

        moto.acelerar();
        moto.virar("esquerda");
        moto.frear();

        System.out.println();

        bicicleta.acelerar();
        bicicleta.virar("direita");
        bicicleta.frear();
    }
}
