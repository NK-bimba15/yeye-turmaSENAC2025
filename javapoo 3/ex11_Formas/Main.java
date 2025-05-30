/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex11_Formas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicka
 */
public class Main {
    public static void main(String[] args) {
        List<Forma> formas = new ArrayList<>();
        formas.add(new Quadrado(4));
        formas.add(new Circulo(3));
        formas.add(new Triangulo(5, 3, 5, 4, 3));

        System.out.println("--- Cálculo de áreas e perímetros ---");
        for (Forma forma : formas) {
            System.out.println(forma.getClass().getSimpleName());
            System.out.printf("Área: %.2f\n", forma.calcularArea());
            System.out.printf("Perímetro: %.2f\n\n", forma.calcularPerimetro());
        }
    }
}
