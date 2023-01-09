package RecursionP;

public class LCMrecursive {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;

        System.out.println("GCD: " + FindGcd(num1, num2));
        System.out.println("LCM: " + FindLcm(num1, num2));
    }

    private static int FindLcm(int num1, int num2) {
        return (num1 * num2) / (FindGcd(num1, num2));
    }

    private static int FindGcd(int num1, int num2) {
        if (num1 % num2 == 0)
            return num2;
        else
            return FindGcd(num2, num1 % num2);
    }
}
