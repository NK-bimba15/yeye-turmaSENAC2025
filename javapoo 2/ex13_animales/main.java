package ex13_animales;

/**
 *
 * @author ADM
 */
public class main {
   public static void main(String[] args) {
        Animal animal = new Animal("Luna", "Gato");

        System.out.println("Informações do Animal:");
        System.out.println("Nome: " + animal.getNome());
        System.out.println("Espécie: " + animal.getEspecie());
    }
}
