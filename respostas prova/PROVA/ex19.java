package PROVA;

/**
 *
 * Escreva um método que receba uma string e retorne quantas palavras ela contém
 * 
 * @author ADM
 */
public class ex19 {
   public static int contarPalavras(String frase) {
        String[] p = frase.trim().split("\\s+");

        if (frase.trim().isEmpty()) {
            return 0;
        }

        return p.length;
    }

    public static void main(String[] args) {
        String texto = "Java é uma linguagem de programação complicada pra kel";
        int qu = contarPalavras(texto);
        System.out.println("Quantidade de palavras: " + qu);
    }
}
