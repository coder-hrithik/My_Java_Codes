package Jsp;
// Wap to count how many times we should decrease the number to be divisible by k.
public class decOpt {
    public static void main(String[] args) {
        int[] a = {5, 9, 12, 16, 25};
        int k = 6;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + (a[i] % k);
        }
        System.out.println(sum);
    }
}
