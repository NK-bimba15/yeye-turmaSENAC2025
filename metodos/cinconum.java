package metodos;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class cinconum {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("A média dos numeros é: "+cm(sc));
        
    }

    public static double cm(Scanner sc) {
        double s = 0;
        for(int i = 1; i <=5; i++){
            System.out.println("Digite o numero "+i+":");
            double n = sc.nextDouble();
            s += n;
            
        }
        
        return s / 5;
      
    }

}
