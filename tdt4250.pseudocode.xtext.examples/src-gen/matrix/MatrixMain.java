 package matrix;

import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class MatrixMain {
    public static void run() {
        List<List<Integer>> m1 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,1)),new ArrayList<Integer>(Arrays.asList(1,1)),new ArrayList<Integer>(Arrays.asList(1,3))));
        List<List<Integer>> m2 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1,1)),new ArrayList<Integer>(Arrays.asList(1,1)),new ArrayList<Integer>(Arrays.asList(1,1))));
        List<List<Integer>> matrixAddition = MatrixAddition.run(m1,m2);
        System.out.println("Matrix Addition of: "+m1+" and "+m2);
        System.out.println("= "+matrixAddition);
        System.out.println("");
        System.out.println("--------------------");
        System.out.println("");
        List<List<Integer>> m3 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(4,1)),new ArrayList<Integer>(Arrays.asList(1,1))));
        List<List<Integer>> m4 = new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(2,2)),new ArrayList<Integer>(Arrays.asList(1,3))));
        List<List<Integer>> matrixMultiplication = MatrixMultiplication.run(m3,m4);
        System.out.println("Matrix Addition of: "+m3+" and "+m4);
        System.out.println("= "+matrixMultiplication);
    }
    
    public static void main(final String[] args) {
        run();
    }
}
