package nk_exercicios_5_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
            
            System.out.println("--------------------------");
            System.out.println(" ");
            System.out.println(" MENU DAS BEBIDAS DA CASA");
            System.out.println(" ");
            System.out.println("   1- Refrigerantes");
            System.out.println("   2- Suco");
            System.out.println("   3- Água");
            System.out.println(" ");
            System.out.println("--------------------------");
            
            int op = teclado.nextInt();
            String mensagem = null;
            switch(op){
                
                case 1:
                mensagem = "Possuimos: Coca-cola, Fruki, Pepsi.";
                break;
                
                case 2:
                mensagem = "Possuimos: Morango, Abacaxi, Limão.";
                break;
                
                case 3:
                mensagem = "Possuimos: C/gás, Sem gás.";
                break;
            } 
            
            System.out.println("-------------------------");
            System.out.println(mensagem);
            System.out.println("-------------------------");
            teclado.close();
    }

}
