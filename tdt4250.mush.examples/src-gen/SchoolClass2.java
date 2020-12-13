import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;

public class SchoolClass2 {
    public static void run() {
        List<String> classList = new ArrayList<String>(Arrays.asList("Hanne","Ole","Line","Fredrik"));
        List<Integer> grades = new ArrayList<Integer>(Arrays.asList(4,6,2,5));
        int i = 0;
        System.out.println("The gade for each student:");
        for (int VAR0 = 0; VAR0 <= 3; VAR0++) {
            String c = classList.get(i);
            int g = grades.get(i);
            System.out.println(c+": "+g);
            i++;
            classList.set(2,"asd");
        }
    }
    
    public static void main(final String[] args) {
        run();
    }
}
