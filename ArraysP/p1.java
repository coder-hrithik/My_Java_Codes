package ArraysP;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] a = new int[size];
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter number to find: ");
        int find = sc.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (find == a[i]) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("The count of " + find + " is: " + count);
        } else {
            System.out.println("Not found");
        }
        // System.out.println(Arrays.toString(a));

        sc.close();
    }

}
