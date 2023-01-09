package NumberConversion;

public class binaryToDec {
    public static void main(String[] args) {
        int n = 1100;
        int sum = 0;
        int p = 0;

        while (n != 0) {
            int res = n % 10;
            sum = sum + res * pow(2, p++);
            n /= 10;
        }
        System.out.print("Decimal Number is: " + sum);
    }

    public static int pow(int n, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++) {
            res = res * n;
        }
        return res;
    }
}
