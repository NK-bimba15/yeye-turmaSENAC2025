/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_user;

/**
 *
 * @author nicka
 */
public class UsuarioComum implements ContaUsuario {
    private String nome;

    public UsuarioComum(String nome) {
        this.nome = nome;
    }

    @Override
    public void acessarSistema() {
        System.out.println("Usuário comum " + nome + " acessou o sistema.");
    }

    @Override
    public void realizarOperacao() {
        System.out.println("Usuário comum " + nome + " não tem permissão para realizar esta operação.");
    }
}
