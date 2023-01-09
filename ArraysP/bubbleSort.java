package ArraysP;

import java.util.*;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size = sc.nextInt();
        char[] c = new char[size];
        System.out.println("Enter the data: ");
        for (int i = 0; i < c.length; i++) {
            c[i] = sc.next().charAt(0);
        }
        for (int i = 0; i < c.length - 1; i++) {
            for (int j = 0; j < c.length - i - 1; j++) {
                if (c[j] > c[j + 1]) {
                    char temp = c[j];
                    c[j] = c[j + 1];
                    c[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(c));
        sc.close();
    }
}
