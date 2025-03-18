package arraylolo;

import java.util.ArrayList;

/**
 *
 * @author ADM
 */
public class ex3 {
    public static void main(String[] args) {
        
     ArrayList<Double> dc = new ArrayList <>();
     
     dc.add(10, Double.NaN);
     dc.add(50, Double.NaN);
     dc.add(100, Double.NaN);
     dc.add(60, Double.NaN);
     dc.add(20, Double.NaN);
     
     double pn = dc.get(3);
     System.out.println(pn);
        
    }
}
