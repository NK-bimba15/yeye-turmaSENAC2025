package exercicios_nk_2;

import java.util.Scanner;


//Exercício 2 – Verificar se um ano é bissexto
//Utiliza boolean para aplicar a regra de ano bissexto.


public class e2 {
    
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    int ano = teclado.nextInt();
    
    boolean bissexto = ((ano % 4 == 0) && (ano % 100 !=0) || (ano % 40 == 0));
    
        System.out.println("O ano "+ano+" é bissexto? "+bissexto);
    
    }
    
}
