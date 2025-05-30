/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex5_pagavel;

/**
 *
 * @author nicka
 */
public class FuncionarioHorista implements Pagavel {
    private String nome;
    private double horasTrabalhadas;
    private double valorHora;

    public FuncionarioHorista(String nome, double horasTrabalhadas, double valorHora) {
        this.nome = nome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

    public String getNome() {
        return nome;
    }
}
