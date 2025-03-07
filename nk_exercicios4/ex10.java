package nk_exercicios4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex10 {
    public static void main(String[] args) {
        
        Random rm = new Random();
        Scanner teclado = new Scanner (System.in);
        
        int numero = rm.nextInt(100);
        int tentativas = 0;
        int palpite = 0;
        
        System.out.println("Tente adivinhar um numero entre 1 a 100: ");
        
        for (tentativas = 1; tentativas <=7; tentativas++){
            
            
            System.out.println("Tentativas "+tentativas+": ");
            palpite = teclado.nextInt();
            
            if (palpite == numero) {
                
                System.out.println("Você acertou!");
                
            }if else(Palpite < numero){
                     System.out.println("numero é maior");
            }else{
             System.out.println("numero é menor");
            }
                    if (palpite != numero){
                        System.out.println("Você não conseguiu.");
                    }
            
        }
        
    }

}
