package ex13_animales;

/**
 *
 * @author ADM
 */
public class Animal {
    private String nome;
    private String especie;

    public Animal(String nome,String especie) {
        this.nome = nome;
        this.especie = especie;
        
    }
 

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
 

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }
}

