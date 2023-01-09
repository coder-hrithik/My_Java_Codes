package basic;

public class LCM {
    public static void main(String[] args) {
        int num1 = 50;
        int num2 = 60;
        int b2 = num2;

        while (num1 % num2 != 0) {
            int rem = num1 % num2;
            num1 = num2;
            num2 = rem;
        }
        System.out.println("GCD / HCF : " + num2);

        int lcm = num1 * b2 / num2;
        System.out.println("LCM : " + lcm);
    }
}
