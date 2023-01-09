package patterns;

public class W {
    public static void main(String[] args) {
        int n = 5;

        for (int r = 1; r <= n; r++) {
            for (int c = 1; c <= n; c++) {
                if (c == 1 || c == n || c == r && r >= n / 2 + 1 || c + r == n + 1 && r >= n / 2 + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        System.out.println();
        for (int r = n; r >= 1; r--) {
            for (int c = 1; c <= n; c++) {
                if (c == 1 || c == n || c == r && r >= n / 2 + 1 || c + r == n + 1 && r >= n / 2 + 1) {
                    System.out.print("# ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
