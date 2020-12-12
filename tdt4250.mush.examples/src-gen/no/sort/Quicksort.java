package no.sort;

import java.util.List;

public class Quicksort {
    public static void run(List<Integer> t, int left, int right) {
        int i = left;
        int j = right;
        int pivot = t.get(left+((right-left)/2));
        while (i<=j) {
            while ((t.get(i))<pivot) {
                i++;
            }
            while ((t.get(j))>pivot) {
                j--;
            }
            if (i<=j) {
                int VAR0 = t.get(i);
                int VAR1 = t.get(j);
                t.set(i,VAR1);
                t.set(j,VAR0);
                i++;
                j--;
            }
            if (left<j) {
                Quicksort.run(t,left,j);
            }
            if (i<right) {
                Quicksort.run(t,i,right);
            }
        }
    }
    
}
