package NumberConversion;

import java.util.Scanner;

public class MagicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int n = sc.nextInt();
        int temp = n;
        String res = "";
        while (n != 0) {
            int rem = n % 2;
            res = rem + res;
            n /= 2;
        }
        System.out.println("The Binary number of " + temp + " is: " + res);
        int r = Integer.parseInt(res);
        int ans = 0;
        int k = 1;
        while (r != 0) {
            int d = r % 10;
            ans = ans + d * pow(5, k++);
            r /= 10;
        }
        System.out.println(temp + "th magic number is: " + ans);
        sc.close();

    }

    static int pow(int n, int p) {
        int po = 1;
        for (int i = 0; i < p; i++) {
            po = po * n;
        }
        return po;
    }
}

/*
 * int n = 6;
 * int ans = 0;
 * int base = 5;
 * while(n > 0){
 * int last = n & 1;
 * n = n >> 1;
 * ans += last * base;
 * base = base * 5;
 * }
 * sop(ans);
 */