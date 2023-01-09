package basic;

import java.math.BigInteger;

public class LargeFactorial {
    public static void main(String[] args) {
        int n = 40;

        BigInteger fact = new BigInteger("1");

        while (n > 1) {
            fact = fact.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.println("\n Factorial is: " + fact);
    }
}
