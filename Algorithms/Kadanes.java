package Algorithms;

// Maximum subarray sum
public class Kadanes {
    public static void main(String[] args) {
        int[] a = { 5, -4, -2, 6, -1, 4 };

        System.out.println(maxSumSubArray(a));
    }

    static int maxSumSubArray(int[] a) {
        int maxsum = Integer.MIN_VALUE;
        int cursum = Integer.MIN_VALUE;

        for (int i = 0; i < a.length; i++) {
            cursum += a[i];
            if (cursum > maxsum) {
                maxsum = cursum;
            }
            if (cursum < 0) {
                cursum = 0;
            }
        }
        return maxsum;
    }
}
