package ex1_ClasseP;

/**
 *
 * @author ADM
 */
public class peso {
    private String nome;
    private int idade;
    private double altura;

    public peso(String n, int i, double a) {
        this.nome = n;
        this.idade = i;
        this.altura = a;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String n) {
        this.nome = n;
    }

    public void setIdade(int i) {
        this.idade = i;
    }

    public void setAltura(double a) {
        this.altura = a;
    }
   

}
