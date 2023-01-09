package DsSorting;

import java.util.Arrays;

public class MergeSort { // Time O(nlogn) Divide & Conquer

    private static void merge(int[] arr, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;
        int b[] = new int[arr.length];
        while (i <= mid && j <= right) {
            if (arr[i] < arr[j]) {
                b[k++] = arr[i++];
            } else {
                b[k++] = arr[j++];
            }
        }
        if (i > mid) {
            while (j <= right) {
                b[k++] = arr[j++];
            }
        } else {
            while (i <= mid) {
                b[k++] = arr[i++];
            }
        }
        for (k = left; k <= right; k++) {
            arr[k] = b[k];
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    public static void main(String[] args) {
        int[] arr = { 9, 4, 7, 6, 3, 1, 5 };
        int left = 0;
        int right = arr.length - 1;
        mergeSort(arr, left, right);
        System.out.println(Arrays.toString(arr));
    }

}
