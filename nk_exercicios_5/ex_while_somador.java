package nk_exercicios_5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex_while_somador {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int c = 1, soma = 0, numero;
        int maior = Integer.MIN_VALUE;
        
        while (c <= 5){
            System.out.println("Digite o "+c+"º valor: ");
            numero = teclado.nextInt();
            if (numero > maior);{
                maior = numero;
        }
            soma += numero;
            c++;
        }
        System.out.println("A soma de todos eles são: "+soma);
        System.out.println("O maior numero digitado é: "+maior);
        
    }

}
