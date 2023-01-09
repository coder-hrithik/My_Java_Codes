package ArraysP;

import java.util.*;

public class reverseArray {

    static void reverse(int[] a) {
        int start = 0;
        int end = a.length - 1;

        while (start < end) {
            int temp = a[start];
            a[start] = a[end];
            a[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Two pointer method
        int[] a = { 1, 2, 3, 4, 5 };
        reverse(a);
        System.out.println(Arrays.toString(a));
    }

}
