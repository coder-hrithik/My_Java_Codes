package ArraysP;
/*Write a Java program to find smallest and second smallest elements of a given array */
public class SmallestSecond {
    public static void main(String[] args) {
        int arr[] = {5, 7, -8, 5, 14, 1};

        int min = Integer.MAX_VALUE;
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                s = min;
                min = arr[i];
            } else if(arr[i] < s && arr[i] != min){
                s = arr[i];
            }
        }
        System.out.println(min);
        System.out.println(s);
    }
}
