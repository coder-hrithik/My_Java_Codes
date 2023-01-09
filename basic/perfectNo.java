package basic;

public class perfectNo {
    public static void main(String arg[]) {
		int sum = 0;
		int count = 0;
		for (int i = 1; i < 1000; i++) {
			sum = 0;
			for (int j = 1; j < i; j++) {
				if (i % j == 0) {
					sum = sum + j;
				}
			}
			if (sum == i && sum != 0)
			count ++;
				// System.out.print(i + "\t");
		}
		System.out.println(count);
	}
}
