package HackerRank;

public class MarseSOS {
	public static void main(String[] args) {
		String s = "SOSOOSOSOSOSOSSOSOSOSOSOSOS";
		int count = 0;
		for (int i = 0; i < s.length() - 1; i += 3) {
			if (!(s.substring(i, i + 3).equals("SOS"))) {
				String n = "SOS";
				String m = s.substring(i, i + 3);
				for (int j = 0; j < n.length(); j++) {
					if (n.charAt(j) != m.charAt(j)) {
						count++;
					}
				}
			}

		}
		System.out.println(count);
	}
}
