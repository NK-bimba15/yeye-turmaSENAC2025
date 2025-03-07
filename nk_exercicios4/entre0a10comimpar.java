package nk_exercicios4;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class entre0a10comimpar {

    public static void main(String[] args) {
       
    Scanner teclado = new Scanner (System.in);
    
    int count = 0;
    int somaimpar = 0;
    
    for(int i = 1; i <= 6; i++){
        System.out.println("digite um valor");
        int v = teclado.nextInt();
        
        if (v >=0 && v <=10){
            count++;
        }else if (v % 2 == 1){
            somaimpar += v;
            
        }
    }
        System.out.println("Ao todo foram "+count+" valores entre 0 a 10.");
        System.out.println("Neste intervalo, a soma dos impares foi "+somaimpar);
    }
    
}
