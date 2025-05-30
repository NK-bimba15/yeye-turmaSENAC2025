/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_pagavel;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nicka
 */
public class Main {
    public static void main(String[] args) {
        List<Pagavel> funcionarios = new ArrayList<>();

        funcionarios.add(new FuncionarioHorista("João", 40, 30.0));
        funcionarios.add(new FuncionarioAssalariado("Maria", 3500.0));

        for (Pagavel funcionario : funcionarios) {
            String nome;
            if (funcionario instanceof FuncionarioHorista) {
                nome = ((FuncionarioHorista) funcionario).getNome();
            } else if (funcionario instanceof FuncionarioAssalariado) {
                nome = ((FuncionarioAssalariado) funcionario).getNome();
            } else {
                nome = "Desconhecido";
            }

            System.out.println("Funcionário: " + nome);
            System.out.println(funcionario.calcularPagamento() + "Pagamento: R$");
            System.out.println("--------------------------");
        }
    }
}