/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex6_DE;

/**
 *
 * @author nicka
 */
public class Televisao implements DispositivoEletronico {
    private boolean ligada;

    @Override
    public void ligar() {
        ligada = true;
        System.out.println("TV ligada.");
    }

    @Override
    public void desligar() {
        ligada = false;
        System.out.println("TV desligada.");
    }

    @Override
    public String obterStatus() {
        return "Televisão está " + (ligada ? "ligada" : "desligada");
    }
}
