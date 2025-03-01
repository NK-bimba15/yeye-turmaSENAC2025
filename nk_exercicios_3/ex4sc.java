package nk_exercicios_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex4sc {
    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
     
        System.out.println("Digite uma palavra: ");
        String palavra = teclado.nextLine();
        
        boolean temVogal = false;
        
        for(int i=0; < palavra.length();i++){
            char letra = palavra.charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u'){
                temVogal = true;
            }
        if (temVogal){
            System.out.println("A palavra tem vogal!");
        }else{
            System.out.println("Não tem vogal");
        }
        
    }
}
}