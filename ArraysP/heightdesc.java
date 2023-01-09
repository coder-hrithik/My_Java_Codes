package ArraysP;

import java.util.Arrays;
import java.util.Scanner;

class A1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // read size from the user
        int size = s.nextInt(); // create array
        double[] a = new double[size]; // read data from the user
        for (int i = 0; i < a.length; i++) {
            a[i] = s.nextDouble();
        } // end of for // sort them in desc
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - i - 1; j++) { // compare
                if (a[j] < a[j + 1]) {
                    double temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            } // end of inner
        } // end of outer // print the height
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        s.close();
    }
}
