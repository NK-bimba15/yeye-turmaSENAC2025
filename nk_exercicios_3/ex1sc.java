package nk_exercicios_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex1sc {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        String nome;
        
            System.out.println("Digite seu nome: ");
                nome = teclado.nextLine();
        
        if (nome.length() > 5){
            System.out.println("Seu nome possui mais de 5 caracteres");
        }else if (nome.length() < 5)
            System.out.println("Seu nome possui menos que 5 caracteres");
     
                
    }

}
