package basic;

// Print 0 1 2 6 12 25 48
public class printSeries {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        int k = 2;
        System.out.print(a +" "+b);

        for (int i = 4; i <= 8; i++) {
            int c = a + b;
            System.out.print(" " + c * k );
            k++;
            a = b;
            b = c;

        }
    }
}
