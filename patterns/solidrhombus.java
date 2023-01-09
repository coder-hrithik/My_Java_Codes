package patterns;

public class solidrhombus {
    public static void main(String[] args) {
        int n=5;
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= n; j++) {
                if (j==1 || j==n || i==1 || i==n) {
                    
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
