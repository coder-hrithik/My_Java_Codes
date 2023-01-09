package Jsp;

/*  Anumber is said to be an armstrong number if sum of each digit raised to the number
    of digit is equal to the original number then the number is armstrong number  */
public class ArmStrong {
    public static void main(String[] args) {
        int n = 153;
        int temp = n;
        int sum = 0;
        // int count = countDigit(n);
        int count = (int) Math.log10(n) + 1;

        while (n != 0) {
            int d = n % 10;
            sum = sum + pow(d, count);
            n /= 10;
        }
        if (temp == sum) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not armstrong");
        }
    }

    public static int pow(int d, int p) {
        int res = 1;
        for (int i = 1; i <= p; i++)
            res *= d;
        return res;
    }

    // public static int countDigit(int n){
    // int count = 0;
    // while(n != 0){
    // count ++;
    // n /= 10;
    // }
    // return count;
    // }
}
