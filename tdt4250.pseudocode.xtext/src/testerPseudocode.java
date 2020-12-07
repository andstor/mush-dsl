import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;
import java.util.StringTokenizer;

import javax.swing.Popup;

import tdt4250.pseudocode.Print;

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

		System.out.println(B);

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

public class testerPseudocode {
	public static void main(String[] args) {
		List<List<Integer>> B3 = new ArrayList<List<Integer>>(Arrays.asList(
								 new ArrayList<Integer>(Arrays.asList(1, 3, 4)),
								 new ArrayList<Integer>(Arrays.asList(1, 3, 4))));
		List<List<Integer>> B4 = new ArrayList<List<Integer>>( Arrays.asList(
				new ArrayList<Integer>( Arrays.asList(1,1,2,2)),
				new ArrayList<Integer>( Arrays.asList(3,4))));
		String lol = "List<List<String>>";
		String val = "[[[1]]]";
		
		List<String> listTypes = new ArrayList<String>(Arrays.asList(lol.replace(">", "").split("<")));
		String innerType = listTypes.get(listTypes.size()-1);
		
		System.out.println("---------");
		System.out.println(parseStringToList(val.replace(" ", ""), innerType));
		System.out.println("---------");
	}

	private static String parseStringToList(String string, String innerType) {
		String result = "";
		int i = 0;
		int level = 0;
		int maxLevel = determineLevel(string);
		while (i < string.length()) {
			char c = string.charAt(i);
			if (c == '[') {
				String type = "";
				String closing = "";
				for (int j = level; j <= maxLevel; j++) {
					if (j == level)  {
						type += "ArrayList<";						
					} else if (j == maxLevel) {
						closing += ">";
						type += innerType;
					} else {
						closing += ">";
						type += "List<";
					}
				}
				type += closing;
				result += "\nnew " + type + "( Arrays.asList(";
				level++;
			} else if (c == ']') {
				result += ")";
				level--;
			} else if (c == ',' && level != maxLevel) {
				result += "),";
			} else {
				result += c;
			}
			i++;
		}
		result += ")";
		return result;
	}

	public static int determineLevel(String string) {
		int i = 0;
		int level = 0;
		while (i < string.length()) {
			char c = string.charAt(i);
			if (c == '[')level++;
			if (c == ']') return level;
			i++;
		}
		return level;
	}
}