package ArraysP;

import java.util.Arrays;

public class RemoveDup {
	public static void main(String[] args) {
		int[] a = { -1, 1, 1, 2, 3, 4, 4, 5, 5, 4 };
		int[] n = new int[a.length];
		int k = 0;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (a[j] < a[j - 1]) {
					swap(a, j, j - 1);
				} else {
					break;
				}
			}
		}
		System.out.print("Ater sorting: " + " ");
		System.out.println(Arrays.toString(a));

		for (int i = 0; i < n.length - 1; i++) {
			if (a[i] != a[i + 1]) {
				n[k++] = a[i];
			}
		}
		n[k++] = a[a.length - 1];

		//print array
		for (int i = 0; i < k; i++) {
			System.out.print(n[i] + " ");
		}

	}

	public static void swap(int[] a, int s, int e) {
		int temp = a[s];
		a[s] = a[e];
		a[e] = temp;
	}
}
