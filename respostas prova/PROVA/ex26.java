package PROVA;

import java.util.Scanner;

/**
 *
 * 26. Crie um sistema de login com limite de 3 tentativas. Após isso, bloqueie o acesso.
 * 
 * @author ADM
 */
public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        for (int i = 0; i < 3; i++) {
            
            System.out.println("Digite sua senha");
            int s = sc.nextInt();
            
            if (s == 1234){
                System.out.println("Bem-vindo!");
                break;
            }else if(s != 1234){
                System.out.println("Tente denovo.");
            }else if(i<3){ 
                break;
            }
            
        }
    }

}
