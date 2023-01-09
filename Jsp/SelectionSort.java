package Jsp;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] a = { 4, 5, 1, 2, 3 };
        selection(a);
        System.out.println(Arrays.toString(a));
    }

    public static void selection(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int last = a.length - 1 - i;
            int max = getMax(a, 0, last);
            swap(a, last, max);
        }
    }

    public static void swap(int a[], int start, int end) {
        int temp = a[start];
        a[start] = a[end];
        a[end] = temp;
    }

    public static int getMax(int[] a, int start, int end) {
        int max = start;
        for (int i = 0; i < end; i++) {
            if (a[i] > max) {
                max = i;
            }
        }
        return max;
    }
}
