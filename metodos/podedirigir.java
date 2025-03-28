package metodos;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class podedirigir {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        System.out.println("sua idade: ");
            int i = sc.nextInt();
            
        System.out.println("possui carteira? ");
            boolean cnh = sc.nextBoolean();
            
        System.out.println("Pode dirigir? "+pd(i,cnh));
   
        
    }
    
    public static boolean pd(int i, boolean cnh){
        return i >= 18 && cnh;
        
    }

}
