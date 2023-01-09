package DsSorting;

import java.util.Arrays;

public class CyclicSort {
    public static void main(String[] args) {
        int[] a = { 4, 3, 1, 2, 5 };
        Sort(a);
        System.out.println(Arrays.toString(a));
    }
    public static void Sort(int[] a) {
        int i = 0;
        while (i < a.length) {
            int correct = a[i] - 1;
            if (a[i] != a[correct]) {
                swap(a, i, correct);
            } else {
                i++;
            }
        }
    }
    public static void swap(int[] a, int s, int e) {
        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;
    }
}
