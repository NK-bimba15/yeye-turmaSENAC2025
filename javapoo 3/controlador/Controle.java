package lalala;

/**
 *
 * @author ADM
 */
public class Controle implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean filmeLigado;

    public Controle() {
        this.volume = 50;
        this.ligado = true;
        this.filmeLigado = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isFilmeLigado() {
        return filmeLigado;
    }

    public void setFilmeLigado(boolean filmeLigado) {
        this.filmeLigado = filmeLigado;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("A tv esta ligada? " + this.isLigado());
        System.out.println("Esta passando filme? " + this.isFilmeLigado());
        System.out.print("Volume: " + this.getVolume());
        for (int i = 1; i <= this.getVolume(); i+=11){
        System.out.print(" | ");
    }
        System.out.println(" ");
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu.");
    }

    @Override
    public void maisVolume() {
        if(this.isLigado()){
            this.setVolume(this.getVolume()+10);
        }
    }

    @Override
    public void menosVolume() {
         if(this.isLigado()){
            this.setVolume(this.getVolume()-10);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligaMudo() {
        if (this.isLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.isLigado() && !(this.isFilmeLigado())){
            this.setFilmeLigado(true);
            System.out.println("*sons de aventura*");
        }else{
            System.out.println("Não deu firme...");
        }
    }

    @Override
    public void pause() {
        if(this.isLigado() && (this.isFilmeLigado())){
            this.setFilmeLigado(false);
            System.out.println("pausado");
        }
    }
    
    

}
