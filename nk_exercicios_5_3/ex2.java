package nk_exercicios_5_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
         System.out.println("Digite um numero de 1 a 7 e te direi o dia da semana: ");
         
          int op = teclado.nextInt();
            String mensagem = null;
            switch(op){
                
                case 1:
                mensagem = "1 = Domingo!";
                break;
                
                case 2:
                mensagem = "2 = Segunda!";
                break;
                
                case 3:
                mensagem = "3 = Terça!";
                break;
                
                case 4:
                mensagem = "4 = Quarta!";
                break;
                
                case 5:
                mensagem = "5 = quinta!";
                break;
                
                case 6:
                mensagem = "6 = Sexta!";
                break;
                
                case 7:
                mensagem = "7 = Sábado!!! :-3";
                break;
            } 
            
            System.out.println("-------------------------");
            System.out.println(mensagem);
            System.out.println("-------------------------");
            teclado.close();
    }

}
