
import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;

public class PARTITION {
    public static int run(List<String> p, int r, String lol) {
        List<List<List<Integer>>> ff = new ArrayList<List<List<Integer>>>(Arrays.asList(new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,2))))));
        List<Integer> B = new ArrayList<Integer>(Arrays.asList(1,3));
        List<Integer> B1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<Integer> B4 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<List<Integer>> B3 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1)),new ArrayList<Integer>(Arrays.asList(1)),new ArrayList<Integer>(Arrays.asList(1)),new ArrayList<Integer>(Arrays.asList(1))));
        Set<Set<Integer>> y = new HashSet<Set<Integer>>(Arrays.asList(new HashSet<Integer>(Arrays.asList(3,1)),new HashSet<Integer>(Arrays.asList(2,1)),new HashSet<Integer>(Arrays.asList(3,33))));
        int x = B.get(r);
        int i = 1;
        i = OMG.run(2,2);
        double j = 0.192939393932;
        double f = 32+-4.4332;
        System.out.print("asdlola");
        System.out.println("lol");
        System.out.print(2);
        for (int VAR0 = 1; VAR0 <= r; VAR0++) {
            int temp = B.get(j);
            if (2<=x+1) {
                int VAR1 = B.get(i);
                int VAR2 = B.get(j);
                B.set(i,VAR2);
                B.set(j,VAR1);
            }
        }
        int VAR3 = B.get(i);
        int VAR4 = B.get(r);
        B.set(i,VAR4);
        B.set(r,VAR3);
        System.out.print(ff);
        return 2;
    }
    
    public static void main(final String[] args) {
        List<String> ARG0 = args[0];
        int ARG1 = Integer.parseInt(args[1]);
        String ARG2 = args[2];
        run(ARG0,ARG1,ARG2);
    }
}
