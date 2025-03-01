package nk_exercicios_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex10sc {
    public static void main(String[] args) {
        
    Scanner teclado = new Scanner (System.in);
    String email;
   
    System.out.println("Digite seu E-mail: ");
    email = teclado.nextLine();
    
    if (email.contains("@") && email.endsWith(".com")) {
        System.out.println("Seja bem-vindo "+email+", sua conta possui tudo para funcionar!");
    }else{
        System.out.println("ERROR, NÃO ACHAMOS SEU ENDEREÇO DE EMAIL.");
    }
}
}
