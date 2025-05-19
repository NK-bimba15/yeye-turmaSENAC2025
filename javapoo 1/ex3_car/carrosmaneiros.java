package ex3_car;

/**
 *
 * @author ADM
 */
public class carrosmaneiros {
    
       public class Atividade3 {
    public static class Carro {
        private String marca;
        private String modelo;
        private int ano;
        private boolean ligado;

        public Carro(String marca, String modelo, int ano) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.ligado = false;
        }

        public void ligar() {
            
            if (ligado = true){
              System.out.println("Carro ligado.");  
            }
            
        }

        public void desligar() {
           if (ligado = false){
               System.out.println("Carro desligado.");
           }
           
        }
    }
}
}



