package Jsp;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = {4, 2, 3, 1, 5};
        for (int i = 1; i < a.length; i++) {
            int temp = a[i];
            // int j = i;
            while (i > 0 && a[i-1] > temp){
                a[i] = a[i - 1];
                i = i- 1;
            }
            a[i] = temp;
        }
        System.out.println(Arrays.toString(a));
        // for (int i = 0; i < a.length; i++) {
        //     System.out.print(a[i] + " ");
        // }
    }
}
