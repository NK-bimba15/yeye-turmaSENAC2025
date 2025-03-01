package nk_exercicios_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class casoteste {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Em que ano estamos? ");
        int ano = teclado.nextInt();
        
        System.out.println("Em que ano você nasceu? ");
        int idade = teclado.nextInt();
        
        System.out.println("Em "+ano+" você tera "+idade+" anos");
        
        if (idade >= 18){
            System.out.println("E já atingiu a maioridade - bora beber");
        }
    }
}
