
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MatrixAddition {
    public static void run() {
        List<List<Integer>> newM = new ArrayList<List<Integer>>();
        List<List<Integer>> m1 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,1)),new ArrayList<Integer>(Arrays.asList(2,2)),new ArrayList<Integer>(Arrays.asList(2,3))));
        List<List<Integer>> m2 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,1)),new ArrayList<Integer>(Arrays.asList(10,3)),new ArrayList<Integer>(Arrays.asList(1,2))));
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
        System.out.println(newM);
    }
    
    public static void main(final String[] args) {
        run();
    }
}
