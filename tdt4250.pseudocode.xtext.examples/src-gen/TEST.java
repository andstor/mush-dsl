
import java.util.List;
import java.util.Arrays;
import no.sort.Quicksort;
import java.util.ArrayList;

public class test {
    public static void run() {
        List<Integer> x = new ArrayList<Integer>(Arrays.asList(4,3,6,7,4,2));
        Quicksort.run(x,0,5);System.out.println(x);
    }
    
    public static void main(final String[] args) {
        run();
    }
}
