import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;

class PARTITION {
    public static String implementation( int p, int r ) {
        List<List<List<Integer>>> ff = new ArrayList<List<List<Integer>>>(Arrays.asList(new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,2))))));
        List<Integer> B = new ArrayList<Integer>(Arrays.asList(1,2));
        ArrayList<Integer> B1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        ArrayList<Integer> B2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1));
        Set<Set<Integer>> y = new HashSet<Set<Integer>>(Arrays.asList(new HashSet<Integer>(Arrays.asList(1,1)),new HashSet<Integer>(Arrays.asList(1,1)),new HashSet<Integer>(Arrays.asList(3,3))));
        int x = B.get(r);
        int i = p;
        i = i;
        int j = p;
        int f = 0;
        String ww = PARTITION.implementation();
        for (int VAR0 = 1; VAR0 <= r+1; VAR0++) {
            int temp = B.get(j);
            if (2<=x+1) {
                i = f+22-1+(2*22);
                int VAR1 = B.get(i);
                int VAR2 = B.get(j);
                B.set(i,VAR2);
                B.set(j,VAR1);
            }
        }
        int VAR3 = B.get(i+1);
        int VAR4 = B.get(r);
        B.set(i+1,VAR4);
        B.set(r,VAR3);
        System.out.println(ff);
        String testing = LOL.implementation()+"asdasdasdasd";
        return testing;
    }
}import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;

class LOL {
    public static String implementation( String lol ) {
        int a = 0;
        return ""+2+"lol";
    }
}