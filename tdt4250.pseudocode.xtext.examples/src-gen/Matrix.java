
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Matrix {
    public static void run() {
        List<List<Integer>> m1 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,3)),new ArrayList<Integer>(Arrays.asList(3,1))));
        List<List<Integer>> m2 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(2,2)),new ArrayList<Integer>(Arrays.asList(2,2))));
        System.out.print(m1.get(0));
    }
    
    public static void main(final String[] args) {
        run();
    }
}
