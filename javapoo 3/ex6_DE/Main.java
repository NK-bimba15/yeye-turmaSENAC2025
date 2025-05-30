/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_DE;

/**
 *
 * @author nicka
 */
public class Main {
public static void main(String[] args) {
        DispositivoEletronico tv = new Televisao();
        DispositivoEletronico radio = new Radio();
        DispositivoEletronico celular = new Celular();

        System.out.println("--- Ligando dispositivos ---");
        tv.ligar();
        radio.ligar();
        celular.ligar();

        System.out.println("\n--- Status dos dispositivos ---");
        System.out.println(tv.obterStatus());
        System.out.println(radio.obterStatus());
        System.out.println(celular.obterStatus());

        System.out.println("\n--- Desligando celular ---");
        celular.desligar();
        System.out.println(celular.obterStatus());
    }
}

