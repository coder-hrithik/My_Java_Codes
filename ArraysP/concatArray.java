package ArraysP;

import java.util.Arrays;

public class concatArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        System.out.println(Arrays.toString(rev(arr)));
    }

    public static int[] rev(int[] arr) {
        int n = arr.length;
        int[] c = new int[2 * n];
        for (int i = 0; i < c.length; i++) {
            c[i] = arr[i % n];
            System.out.print(i % n + " ");
        }
        return c;
    }
}
