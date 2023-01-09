package basic;

// Square root of a number
// root is equal to (X + N/X)/2
public class NewtonRapson {

    static double sqrt(int n) {
        double x = n;
        double root = 0;
        while (true) {
            root = 0.5 * (x + (n / x));
            if (Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;
        }
        return root;
    }

    public static void main(String[] args) {
        System.out.printf("\n Ans: " + "%.3f", sqrt(40));
    }
}
