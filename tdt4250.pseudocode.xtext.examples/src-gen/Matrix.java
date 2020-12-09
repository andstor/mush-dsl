
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class Matrix {
    public static void run() {
        List<Integer> i = new ArrayList<Integer>(Arrays.asList(1,2,3,4));
        i.add(3);i.remove(1);System.out.print(i.length()+1);
    }
    
    public static void main(final String[] args) {
        run();
    }
}
