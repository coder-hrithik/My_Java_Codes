package Jsp;

public class AvgOfLarSma {
    public static void main(String[] args) {
        int[] arr = { 1, 4, 3, 4 };
        int large = Integer.MIN_VALUE;
        int small = Integer.MAX_VALUE;
        float count = 0;
        int sumOfLarge = 0;
        int sumOfSmall = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                large = arr[i];
            }
            if (arr[i] < small) {
                small = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (large == arr[i]) {
                sumOfLarge += large;
                count++;
            }
            if (small == arr[i]) {
                sumOfSmall += small;
                count++;
            }
        }
        float avg = (sumOfLarge + sumOfSmall) / count;
        System.out.println(avg);

    }
}
