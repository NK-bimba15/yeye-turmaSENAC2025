package nk_exercicios_5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int senha;
        
        System.out.println("Digite sua senha: ");
        senha = teclado.nextInt();
        
        while (senha != 1234){
            System.out.println("Sua senha está incorreta.");
           
        }
        if (senha == 1234){
            System.out.println("Bem vindo!");
            
        }
        
    }

}
