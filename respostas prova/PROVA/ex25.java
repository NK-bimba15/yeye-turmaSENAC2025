package PROVA;

import java.util.HashSet;

/**
 *
 * Implemente um metodo que receba uma palavra e diga se ela tem palavras repetidas. 
 * 
 * @author ADM
 */
public class ex25 {
    public static boolean temPalavrasRepetidas(String frase) {
        String[] palavras = frase.toLowerCase().split("\\s+");
        HashSet<String> conjunto = new HashSet<>();

        for (String palavra : palavras) {
            if (conjunto.contains(palavra)) {
                return true; 
            }
            conjunto.add(palavra);
        }

        return false; 
    }

    public static void main(String[] args) {
        String exemplo = "Java é uma linguagem e Java é divertida";

        if (temPalavrasRepetidas(exemplo)) {
            System.out.println("A frase contém palavras repetidas.");
        } else {
            System.out.println("A frase NÃO contém palavras repetidas.");
        }
    }
}
