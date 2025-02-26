package exercicios_nk_2;

import java.util.Scanner;

//Exercício 3 – Verificar se uma pessoa pode dirigir
//A pessoa deve ter 18 anos ou mais e possuir carteira de motorista (CNH).

public class e3 {
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();
        
        System.out.println("Você possui carteira de motororista? s/n");
        boolean temCNH = teclado.nextBoolean();
        
        
    boolean  podeDirigir = (idade>=18) && temCNH;
    
        System.out.println("A pessoa pode dirigir? "+podeDirigir);
    
}
} 
