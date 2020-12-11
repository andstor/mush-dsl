 package matrix;

import java.util.List;
import java.util.ArrayList;

public class MatrixMultiplication {
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
        int i = 0;
        int l = 0;
        while ((x!=((m1.size())))) {
        	int y = 0;
        	while ((y!=(((m2.get(0)).size())))) {
        		int z = 0;
        		i = 0;
        		while ((z!=((m2.get(y)).size()))) {
        			l = ((m1.get(x).get(z))*(m2.get(z).get(y)));
        			i += l;
        			z++;
        		}
        		newM.get(x).set(y,i);
        		y++;
        	}
        	x++;
        }
        return newM;
    }
    
}
