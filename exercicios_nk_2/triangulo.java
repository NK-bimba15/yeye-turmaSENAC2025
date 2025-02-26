package exercicios_nk_2;

import java.util.Scanner;

public class triangulo {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite um dos lados: ");
        double l1 = teclado.nextDouble();
        
        System.out.println("Digite um dos lados: ");
        double l2 = teclado.nextDouble();
        
        System.out.println("Digite um dos lados: ");
        double l3 = teclado.nextDouble();
        
        boolean tri = (l1 < l2+l3 && l2 < l1+l3 && l3<l1);
        System.out.println("Pode formar um triangulo?  "+tri);
                }
    }
