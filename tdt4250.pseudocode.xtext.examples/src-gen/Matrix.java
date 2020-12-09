
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Matrix {
    public static void run() {
        List<List<Integer>> m1 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,3)),new ArrayList<Integer>(Arrays.asList(1,1))));
        List<List<Integer>> m2 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,3)),new ArrayList<Integer>(Arrays.asList(1,1))));
        List<List<List<Integer>>> lol = new ArrayList<List<List<Integer>>>(Arrays.asList(m1,m2));
        System.out.print(lol);
    }
    
    public static void main(final String[] args) {
        run();
    }
}
