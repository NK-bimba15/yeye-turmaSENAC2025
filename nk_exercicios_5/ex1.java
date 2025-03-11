package nk_exercicios_5;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        int s = 0;
        int c = 0;
        
        System.out.println("Digite a sua idade: (-1 para sair)");
        int idade = teclado.nextInt();
        
        while (idade >= 0){ 
            s += idade;
            c++;
            System.out.println("Digite a sua idade: (-1 para sair)");
            idade = teclado.nextInt();
            
            
        }
        if (c > 0);{
       
            double media = s / c;
            System.out.println("A média da idade da turma é: "+media);
            }else{ 
            System.out.println("Nenhuma idade foi informada.");
            }
            
    }

}
