/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex9_user;

/**
 *
 * @author nicka
 */
public class Main {
    public static void main(String[] args) {
        ContaUsuario admin = new Administrador("Fernanda");
        ContaUsuario usuario = new UsuarioComum("João");

        System.out.println("--- Acessos ao sistema ---");
        admin.acessarSistema();
        admin.realizarOperacao();

        System.out.println();

        usuario.acessarSistema();
        usuario.realizarOperacao();
    }
}
