package metodos;

/**
 *
 * @author ADM
 */
public class metodo3 {
   
    public static void main(String[] args) {
         
    int s = cs(1, 10);
        System.out.println("soma de 1 a 10: " + s);
    }

    public static int cs(int in, int f) {
        int s = 0;
        for (int i = in; i <= f; i++) {
            s += in;
        }
        return s;
    }
}

