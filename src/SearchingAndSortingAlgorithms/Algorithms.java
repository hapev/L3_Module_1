package SearchingAndSortingAlgorithms;

import java.util.List;

public class Algorithms {
	public static int findBrokenEgg(List<String> eggs) {

		int y = 0;
		for (String s : eggs) {
			if (s == "cracked") {
				y++;
			}
		}
		return y;
	}

	public static int countPearls(List<Boolean> x) {
		int y = 0;
		for (Boolean s : x) {
			if (s == true) {
				y++;
			}
		}
		return y;
	}

	public static double findTallest(List<Double> peeps) {
		// TODO Auto-generated method stub
		double p = peeps.get(0);
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > p) {
				p = peeps.get(i);
			}
		}
		return p;
	}

	public static String findLongestWord(List<String> s) {
		// TODO Auto-generated method stub
		String longestWord = "a";
		for (String a : s) {
			if (a.length() > longestWord.length()) {
				longestWord = a;
			}

		}
		return longestWord;
		// Add other methods here
	}

	public static Object containsSOS(List<String> s) {
		for (String a : s) {
			if (a.contains("... --- ...")) {
				return true;

			}

		}
		return false;
	}

	public static List<String> sortScores(List<Double> results) {
		
		return null;
	
	
	}
}