package ArraysP;

import java.util.Arrays;

public class LeftShift {
    public static void main(String[] args) {
        // [3,4,5,6,1,2]
		int[] a = {1,2,3,4,5,6};
		int s = 2;

		for (int i = 0; i < s; i++) {
			int arrayFirst = a[0];
			for (int j = 0; j < a.length - 1; j++) {
				a[j] = a[j + 1];
			}
			a[a.length-1] = arrayFirst;
		}
		System.out.println(Arrays.toString(a));
    }
}
