package ArraysP;

import java.util.*;

public class addArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] a = new int[size];

        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Array is: " + Arrays.toString(a));
        sc.close();
    }
}
