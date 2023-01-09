package Tutorial;

public class MissingNumber {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3, 4, 6 };
        int n = a.length + 1;

        int sum1 = n * (n + 1) / 2;
        int sum2 = 0;

        for (int i = 0; i < a.length ; i++) {
            sum2 = sum2 + a[i];
        }

        int mis = sum1 - sum2;
        System.out.println(mis);
    }
}
