package ArraysP;

public class DiagonalDifference {
	public static void main(String[] args) {
		int[][] arr = { { 1, 2, 5 }, { 4, 5, 6 }, { 6, 8, 9 } };
		int diagonal1 = 0;
		for (int i = 0; i < arr.length; i++) {
			diagonal1 += arr[i][i];
			diagonal1 -= arr[i][arr.length - (i + 1)];
		}
		System.out.println(Math.abs(diagonal1));
	}
}
