package RecursionP;

public class FibonacciRecursive {

    // int n1, n2;

    // FibonacciRecursive() {
    // n1 = 0;
    // n2 = 1;
    // System.out.print(n1 + " " + n2 + " ");
    // }

    // void ans(int n) {
    // if (n > 2) {
    // int n3 = n1 + n2;
    // n1 = n2;
    // n2 = n3;
    // System.out.print(n3 + " ");
    // ans(n - 1);
    // }
    // }

    // public static void main(String[] args) {
    // FibonacciRecursive fr = new FibonacciRecursive();
    // fr.ans(10);
    // }

    static int n1 = 0;
    static int n2 = 1;
    static {
        
        System.out.print(n1 + " " + n2 + " ");
    }

    private static void findFibo(int i) {
        if ( i > 2) {
            int n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(n3 + " ");
            findFibo(i - 1);
        }
    }
    public static void main(String[] args) {
        findFibo(10);
    }
}
