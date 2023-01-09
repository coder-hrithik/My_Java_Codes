package ArraysP;

// WAP to find the largest element in the array
public class JspLargest {
    public static void main(String[] args) {
        int[] arr = { 16, 9, 2, 33, 10 };

        int large = Integer.MIN_VALUE;
        int slarge = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                slarge = large;
                large = arr[i];
            } else if (arr[i] > slarge && large != arr[i]) {
                slarge = arr[i];
            }
        }
        System.out.println(large);
        System.out.println(slarge);
    }
}
