package ArraysP;

/*Write a Java program to find the two elements from a given array of
positive and negative numbers such that their sum is closest to zero.*/
public class MinSum {
    public static void main(String[] args) {
        int arr[] = {1, 5, -4, 7, 8, -6};

        int a = arr[0];
        int b = arr[1];
        int minSum = arr[0] + arr[1];

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if(Math.abs(minSum) > Math.abs(sum)){
                    minSum = sum;
                    a = i;
                    b = j; 
                }
            }
        }
        System.out.println(arr[a] + " " + arr[b]);
    }
}
