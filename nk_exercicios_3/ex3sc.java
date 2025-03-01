package nk_exercicios_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex3sc {
    
     public static void main(String[] args) {
        
     Scanner teclado = new Scanner (System.in);
    
     System.out.println("Digite uma palavra: ");  
     String palavra = teclado.nextLine();
            
        String invertida = new StringBuilder(palavra).reverse().toString();  
        System.out.println("A palavra "+palavra+" invertida fica"+invertida);
     
   
} 
}