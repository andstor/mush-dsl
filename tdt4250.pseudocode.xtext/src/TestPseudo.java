import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.ArrayList;

class PARTITION2 {
	public static int run(int p, int r) {
		int a = 0;
		return a;
	}
}

class PARTITION3 {
	public static List<List<List<Integer>>> run(List<String> p, int r) {
		List<List<List<Integer>>> ff = new ArrayList<List<List<Integer>>>(Arrays
				.asList(new ArrayList<List<Integer>>(Arrays.asList(new ArrayList<Integer>(Arrays.asList(1, 2))))));
		List<Integer> B = new ArrayList<Integer>(Arrays.asList(1, 2));
		List<Integer> B1 = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));

		List<Integer> B2 = new ArrayList<Integer>(Arrays.asList(1, 1, 1, 1));
		List<List<Integer>> B3 = new ArrayList<List<Integer>>(
				Arrays.asList(new ArrayList<Integer>(Arrays.asList(1)), new ArrayList<Integer>(Arrays.asList(1)),
						new ArrayList<Integer>(Arrays.asList(1)), new ArrayList<Integer>(Arrays.asList(1))));
		List<Set<Integer>> y = new ArrayList<Set<Integer>>(Arrays.asList(new HashSet<Integer>(Arrays.asList(1, 1)),
				new HashSet<Integer>(Arrays.asList(1, 1)), new HashSet<Integer>(Arrays.asList(3, 3))));
		int x = B.get(r);
		List<String> i = p;
		i = i;
        x -= 2;
		List<String> j = p;
		int f = 0;
		int ww = PARTITION2.run(1, 1);
		for (int VAR0 = 1; VAR0 <= r; VAR0++) {
			int temp = B.get(1);
			if (2 <= x + 1) {
				String iasd = PARTITION2.run(1, 1) + "lol";
				int VAR1 = B.get(1);
				int VAR2 = B.get(1);
				B.set(1, VAR2);
				B.set(1, VAR1);
			}
		}
		int VAR3 = B.get(1);
		int VAR4 = B.get(r);
		B.set(1, VAR4);
		B.set(r, VAR3);
		System.out.print(ff);

		return ff;
	}
}

public class TestPseudo {
	public static void main(String[] args) {
		System.out.println(2333 + "lol");
		System.out.println(PARTITION3.run(new ArrayList<String>(), 1));
	}
}