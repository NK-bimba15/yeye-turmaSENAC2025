package nk_exercicios4;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class somador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int soma = 0;
        
        for(int i = 1; i <=5; i++){
            System.out.println("Digite um valor");
            int valor = teclado.nextInt();
            soma += valor;
    }
        System.out.println("A soma dos valores é: "+soma);
        
    }

}
