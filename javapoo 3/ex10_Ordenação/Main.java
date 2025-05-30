/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_Ordenação;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author nicka
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 6));

        System.out.println("Lista original:");
        System.out.println(numeros);

        Ordenacao<Integer> crescente = new OrdenacaoCrescente<>();
        crescente.ordenar(numeros);
        System.out.println(numeros);

        Ordenacao<Integer> decrescente = new OrdenacaoDecrescente<>();
        decrescente.ordenar(numeros);
        System.out.println(numeros);
    }
}
