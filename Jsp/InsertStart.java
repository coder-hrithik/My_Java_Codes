package Jsp;

import java.util.Arrays;

public class InsertStart {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        arr = add(arr, 0, 1);
        arr = update(arr, 5, 1);
        arr = delete(arr, 2);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] add(int[] arr, int element, int index) {
        if (index < 0 || index > arr.length) {
            System.out.println("wrong index");
            return arr;
        }
        int b[] = new int[arr.length + 1];
        b[index] = element;

        for (int i = 0; i < arr.length; i++) {
            if (i < index) {
                b[i] = arr[i];
            } else {
                b[i + 1] = arr[i];
            }
        }
        return b;
    }

    public static int[] update(int[] arr, int element, int index) {
        if (index >= 0 && index < arr.length) {
            arr[index] = element;
        } else {
            System.out.println(" Wrong Index");
            return arr;
        }
        return arr;
    }

    public static int[] delete(int[] arr, int element) {
        int[] b = new int[arr.length - 1];
        for (int i = 0; i < b.length; i++) {
            if (arr[i] == element) {
                b[i] = arr[i + 1];
            } else {
                b[i] = arr[i];
            }
        }
        return b;
    }

}
