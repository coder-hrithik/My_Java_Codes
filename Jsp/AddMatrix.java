package Jsp;

// Addition of two matrices
public class AddMatrix {
    public static void main(String[] args) {
        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int[][] b = { { 1, 2, 1 }, { 1, 3, 1 }, { 1, 0, 0 } };

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + b[i][j] + " ");
            }
            System.out.println();
        }

    }
}
// wap to find largest element 