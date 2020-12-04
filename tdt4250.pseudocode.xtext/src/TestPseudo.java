import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.xtext.serializer.sequencer.LegacyTransientValueService;

import tdt4250.pseudocode.Print;
import tdt4250.pseudocode.Variable;

public class TestPseudo {
	public static void main(String[] args) {
		implementation(0, 1);

	}

	public static int implementation(int alder, int hoyde) {
		int e = 2 * (1 + 2);
		ArrayList<Integer> G = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		ArrayList<ArrayList<Integer>> G1 = new ArrayList<ArrayList<Integer>>(Arrays
				.asList(new ArrayList<Integer>(Arrays.asList(1, 1)), new ArrayList<Integer>(Arrays.asList(2, 2))));
		ArrayList<ArrayList<Integer>> G2 = new ArrayList<ArrayList<Integer>>(Arrays
				.asList(new ArrayList<Integer>(Arrays.asList(3, 3)), new ArrayList<Integer>(Arrays.asList(3, 3))));
		G.addAll(new ArrayList<Integer>(Arrays.asList(1, 1)));
		int i = 1;//11 + 3 * 2 + -3;
		int j = alder;
		ArrayList<Integer> k = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
		if (i <= 10) {
			System.out.println("If works!");
			ArrayList<ArrayList<Integer>> VAR0 = G1;
			ArrayList<ArrayList<Integer>> VAR1 = G2;
			G1 = VAR1;
			G2 = VAR0;
			int VAR2 = G1.get(1).get(1);
			int VAR3 = G2.get(i).get(j);
			G1.get(1).set(1, VAR3);
			G2.get(i).set(j, VAR2);
			for (int VAR4 = 2; VAR4 <= 4; VAR4++) {
				System.out.println("For works!");
				break;
			}
			while (i <= 5) {
				System.out.println("While works!");
				i += 2;
			}
		} else {
			int u = 9;
		}
		return i;
	}
}