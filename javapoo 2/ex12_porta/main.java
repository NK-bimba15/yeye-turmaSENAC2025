package ex12_porta;

/**
 *
 * @author ADM
 */
public class main {
    public static void main(String[] args) {
        Porta porta = new Porta("Azul");

        System.out.println("Cor da porta: " + porta.getCor());

        porta.abrir();
        System.out.println("Porta aberta? " + porta.isAberta());

        porta.fechar();
        System.out.println("Porta aberta? " + porta.isAberta());
    }
}
