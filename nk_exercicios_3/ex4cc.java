package nk_exercicios_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex4cc {
    
    public static void main(String[] args){ 
        
        int m;
        int n1;
        int n2;
        Scanner teclado = new Scanner (System.in);
       
        System.out.println("Digite sua primeira nota: ");
            n1 = teclado.nextInt();
        System.out.println("Digite sua segunda nota: ");
            n2 = teclado.nextInt();
        m = n1+n2/2;    
        if (m<4.5){
        System.out.println("Reprovado sua nota foi de: "+m);
        
        }else if (m>=5 && m<=6.9){
        System.out.println("Recuperação com sua nota: "+m);
        
        }else{
        System.out.println("Você está passado! sua nota é "+m);
        }
        }
}
    