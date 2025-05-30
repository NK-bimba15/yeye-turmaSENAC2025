/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex10_Ordenação;

import java.util.List;

/**
 *
 * @author nicka
 */
public interface Ordenacao<T extends Comparable<T>> {
    void ordenar(List<T> lista);
}