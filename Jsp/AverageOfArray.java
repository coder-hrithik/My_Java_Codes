package Jsp;

public class AverageOfArray {
    public static void main(String[] args) {
        int[] arr = { 6, 4, 1, 3, 5, 2 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        int average = sum / arr.length;
        System.out.println("Average of array is: " + average);
    }
}
