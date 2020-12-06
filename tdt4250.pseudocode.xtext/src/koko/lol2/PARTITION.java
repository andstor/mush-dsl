package koko.lol2;

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import koko.lol2.LOL;
import java.util.Set;
import java.util.ArrayList;

public class PARTITION {
    public static String run(List<List<Integer>> p, int r) {
        List<List<List<Integer>>> ff = new ArrayList<List<List<Integer>>>(Arrays.asList(new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,2,4))))));
        List<Integer> B = new ArrayList<Integer>(Arrays.asList(1,2,3));
        List<Integer> B1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        List<Integer> B2 = new ArrayList<Integer>(Arrays.asList(1,1,1,1));
        Set<Set<Integer>> y = new HashSet<Set<Integer>>(Arrays.asList(new HashSet<Integer>(Arrays.asList(1,1)),new HashSet<Integer>(Arrays.asList(1,1)),new HashSet<Integer>(Arrays.asList(3,3))));
        int x = B.get(r);
        List<List<Integer>> i = p;
        i = i;
        List<List<Integer>> j = p;
        int f = 22;
        String ww = LOL.run();
        for (int VAR0 = 1; VAR0 <= r+1+3; VAR0++) {
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
        System.out.print(ff);
        String testing = LOL.run()+"asdasdasdasd";
        return testing;
    }
}