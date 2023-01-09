package NumberConversion;

// WAP to convert binary to octal 
public class binaryToOctal {
    public static void main(String[] args) {
        // binary to decimal
        int n = 1100;
        int dec = 0;
        int k = 0;
        while (n != 0) {
            int d = n % 10;
            dec = dec + d * pow(2, k++);
            n /= 10;
        }
        System.out.println("The decimal value: " + dec);
        // decimal to octal
        int oct = dec;
        String ans = "";
        while (oct != 0) {
            int rem = oct % 8;
            ans = rem + ans;
            oct /= 8;
        }
        System.out.println("The octal value is: " + ans);

    }

    public static int pow(int n, int p) {
        int m = 1;
        for (int i = 1; i <= p; i++) {
            m = m * n;
        }
        return m;
    }
}
