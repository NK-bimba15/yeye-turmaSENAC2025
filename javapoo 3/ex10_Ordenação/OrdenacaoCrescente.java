/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_Ordenação;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author nicka
 */
public class OrdenacaoCrescente<T extends Comparable<T>> implements Ordenacao<T> {
    @Override
    public void ordenar(List<T> lista) {
        Collections.sort(lista);
        System.out.println("Lista ordenada em ordem crescente.");
    }
}
