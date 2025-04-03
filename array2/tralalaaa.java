package array2;

/**
 *
 * @author ADM
 */
public class tralalaaa {
    public static void main(String[] args) {
        
        double[] n = {8.5, 9.0, 7.5, 6.0, 10.0};
        double m = 0;
        
        for(double ns : n){
            
            m += ns;
            
        }
        
        m /= n.length;
        System.out.println("Media das notas: "+m);
        
        
    }

}
