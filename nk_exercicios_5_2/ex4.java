package nk_exercicios_5_2;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int r;
 
        do{
            System.out.println("======================");
            System.out.println("       M E N U");
            System.out.println(" ");
            System.out.println(" 1 - CADASTRAR");
            System.out.println(" 2 - CONSULTAR");
            System.out.println(" 3 - SAIR");
            System.out.println("======================");
            r = teclado.nextInt(); 
            
            if (r == 1){
                System.out.println("Não podemos cadastrar contas agora, tente mais tarde");   
            }else if (r == 2){
                System.out.println("Não podemos consultar agora.");
        }
        } while (r != 3);
            System.out.println("Saindo do programa...");
            teclado.close();
    }
    }  

