package metodos;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class metodo4{
    
    public static int r(int c) {
        return (c * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escreva sua temperatura em Cº: ");
        int cel = sc.nextInt();
        
        int fah = r(cel);
        
        System.out.println("A temperatura em Fahrenheit é: " + fah + "°F");
        
        sc.close();     
    }
}

