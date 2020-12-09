
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MatrixAddition {
    public static void run() {
        List<List<Integer>> newM = new ArrayList<List<Integer>>();
        List<List<Integer>> m1 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,1)),new ArrayList<Integer>(Arrays.asList(2,2))));
        List<List<Integer>> m2 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,1)),new ArrayList<Integer>(Arrays.asList(2,3))));
        for (int VAR0 = 0; VAR0 <= ((m2.size())-1); VAR0++) {
            newM.add(m1.get(0));
        }
        int x = 0;
        int l = 0;
        while ((x!=((m1.size())))) {
        	int y = 0;
        	while ((y!=(((m1.get(0)).size())))) {
        		l = (m1.get(x).get(y))+(m2.get(x).get(y));
        		System.out.println("x: "+x+", y: "+y+" ,sum: "+l);
        		newM.get((x)).set((y),l);
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
