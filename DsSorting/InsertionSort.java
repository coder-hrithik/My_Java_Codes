package DsSorting;

// Works very well on partially sorted data
import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] a = { 4, 3, 1, 2, 5 };
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    swap(a, j, j - 1);
                } else
                    break;
            }
        }
        System.out.println(Arrays.toString(a));
    }

    public static void swap(int[] a, int s, int e) {
        int temp = a[s];
        a[s] = a[e];
        a[e] = temp;
    }
}
