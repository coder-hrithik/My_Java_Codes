package ArraysP;

import java.util.Scanner;

public class AntiDiagonal {
    public static void main(String[] args) {
        int a[][] = new int[20][20];
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("OG Matrix");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Anti Diagonal array");
        for (int i = 0; i < r + c - 1; i++) {
            for (int j = 0; j < r; j++) {
                for (int k = 0; k < c; k++) {
                    if (j + k == i) {
                        System.out.print(a[j][k]);
                    }
                }
            }
            System.out.println();
        }
        sc.close();
    }
}
