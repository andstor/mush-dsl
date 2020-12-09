
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MatrixMultiplication {
    public static void run() {
        List<List<Integer>> newM = new ArrayList<List<Integer>>();
        List<List<Integer>> m1 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(2,1)),new ArrayList<Integer>(Arrays.asList(1,1))));
        List<List<Integer>> m2 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(3,2)),new ArrayList<Integer>(Arrays.asList(2,2))));
        newM = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(0,0)),new ArrayList<Integer>(Arrays.asList(0,0))));
        int x = 0;
        while ((x!=((m1.size())))) {
        	int y = 0;
        	while ((y!=((m2.size())))) {
        		int z = 0;
        		int i = 0;
        		System.out.println((m2.get(y)).size());
        		while ((z!=((m2.get(y)).size()))) {
        			i += ((m1.get(x).get(z))*(m2.get(z).get(y)));
        			z++;
        		}
        		newM.get(x).set(y,i);
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
