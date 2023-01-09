package DsSorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = { 4, 5, 1, 2, 3 };
        selection(a);
        System.out.println(Arrays.toString(a));
    }

    public static int[] selection(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int last = a.length - 1 - i;
            int max = getMax(a, 0, last);
            swap(a, last, max);
        }
        return a;
    }

    public static int getMax(int[] a, int s, int e) {
        int max = s;
        for (int i = 0; i <= e; i++) {
            if (a[i] > a[max]) {
                max = i;
            }
        }
        return max;
    }

    public static void swap(int[] a, int s, int e) {
        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;

    }
}
