package nk_exercicios_5_3;

import java.util.Scanner;

/**
 *
 * @author ADM
 */
public class ex3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Primeiro lado: ");
        double l1 = teclado.nextDouble();
        
        System.out.println("Segundo lado: ");
        double l2 = teclado.nextDouble();
        
        System.out.println("Terceiro lado: ");
        double l3 = teclado.nextDouble();
        
        if ((l1 + l2 > l3)&& (l1 + l3 > l2)&&(l2+l3>l1)){
            int tri = 0;
            if (l1 == l2) tri++;
            if (l1 == l3) tri++;
            if (l2 == l3) tri++;
        
        switch(tri){
            case 1:
                System.out.println("Equilatero");
                break;
                
            case 2:
                System.out.println("Isosceles");
                break;
                
            case 3: 
                System.out.println("Escaleno");
                break;
            default:
                System.out.println("Indefinida");
                break;
        }
        }else{ 
                System.out.println("Os lados informados não formam um triangulo");
                }
}
    }
 
