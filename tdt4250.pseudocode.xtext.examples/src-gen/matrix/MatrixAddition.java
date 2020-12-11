 package matrix;

import java.util.List;
import java.util.ArrayList;

public class MatrixAddition {
    public static List<List<Integer>> run(List<List<Integer>> m1, List<List<Integer>> m2) {
        List<List<Integer>> newM = new ArrayList<List<Integer>>();
        for (int VAR0 = 0; VAR0 <= ((m2.size())-1); VAR0++) {
            List<Integer> p = new ArrayList<Integer>();
            for (int VAR1 = 0; VAR1 <= (((m2.get(0)).size())-1); VAR1++) {
                p.add(0);
            }
            newM.add(p);
        }
        int x = 0;
        int l = 0;
        int y = 0;
        while ((x!=((m1.size())))) {
        	y = 0;
        	while ((y!=(((m1.get(0)).size())))) {
        		l = (m1.get(x).get(y))+(m2.get(x).get(y));
        		newM.get(x).set(y,l);
        		y++;
        	}
        	x++;
        }
        return newM;
    }
    
}
