package Jsp;

public class missing {
    public static void main(String[] args) {
        int[] arr = { 6, 1, 3, 4, 2, 7, 9, 8, 10 };
        int n = arr.length +1;
        int sum1 = n * (n+1) / 2;
        int sum2 = 0;
        for (int i = 0; i < arr.length; i++) {
            sum2 += arr[i];
        }
        System.out.println(sum1-sum2);
    }
}
