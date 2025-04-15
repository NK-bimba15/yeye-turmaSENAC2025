package PROVA;

import java.util.Scanner;

/**
 *
 * 14. Crie um programa que simule um menu de opções com do-while: 1-Cadastrar, 2-Listar,3-Sair.
 * 
 * @author ADM
 */
public class ex14 {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int r;
 
        do{
            System.out.println("======================");
            System.out.println("       M E N U");
            System.out.println(" ");
            System.out.println(" 1 - CADASTRAR");
            System.out.println(" 2 - LISTAR");
            System.out.println(" 3 - SAIR");
            System.out.println("======================");
            r = sc.nextInt(); 
            
            if (r == 1){
                System.out.println("Não podemos cadastrar contas agora, tente mais tarde");   
            }else if (r == 2){
                System.out.println("Não podemos listar agora.");
        }
        } while (r != 3);
            System.out.println("Saindo do programa...");
            sc.close();
    }
    }  


