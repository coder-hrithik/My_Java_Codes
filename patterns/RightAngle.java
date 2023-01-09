package patterns;

public class RightAngle {
    public static void main(String[] args) {
        int n = 5;
        char k = 'A';
        // int k = 1;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(k++ + " "); // if(i + j >= n + 1)
            }
            // k++;
            System.out.println();
        }

        // for (int i = 1; i <=n; i++) {
        // for (int j = n; j > i; j--) {
        // System.out.print(k-- + " ");
        // }
        // System.out.println();
        // }
    }
}
