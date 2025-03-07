package nk_exercicios4;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex3 {
    
     public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int soma = 0;
        
        for(int i = 1; i <=10; i++){
            System.out.println("Digite um valor para soma: ");
            int valor = teclado.nextInt();
            soma += valor;
    }
        System.out.println("O total é: "+soma);
        
    }

}
