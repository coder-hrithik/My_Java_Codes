package ArraysP;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 1, 4, 5, 6 };
        int k = 2;
        rotate(arr, k);
    }

    public static void rotate(int[] arr, int k) {
        k = k % arr.length;
        rev(arr, 0, arr.length - 1);
        System.out.println("1: "+Arrays.toString(arr));
        rev(arr, 0, k - 1);
        System.out.println("2: "+Arrays.toString(arr));
        rev(arr, k, arr.length - 1);
        System.out.println("3: "+Arrays.toString(arr));

    }

    public static void rev(int[] arr, int s, int e) {
        while (s < e) {
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
        }
    }
}
