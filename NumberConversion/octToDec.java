package NumberConversion;

// Wap to convert Octal to Decimal
public class octToDec {
    public static void main(String[] args) {
        int n = 12;
        int sum = 0;
        int k = 0;

        while (n != 0) {
            int res = n % 10;
            sum = sum + res * pow(8, k++);
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
