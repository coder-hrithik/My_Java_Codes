package basic;

public class GCD {
    public static void main(String[] args) {
        int a = 1000;
        int b = 2000;

        while (a % b != 0) {
            int r =  a % b;
            a = b;
            b = r;
        }
        System.out.println(b);
    }
}
