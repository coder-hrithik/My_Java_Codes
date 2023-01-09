package ArraysP;

public class JspSecondLar {
    public static void main(String[] args) {
        int[] arr = { 122, 18, 22, 9, 6 };
        int large = Integer.MIN_VALUE;
        int slarge = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > large) {
                slarge = large;
                large = arr[i];
            } else if (arr[i] > slarge && arr[i] != large) {
                slarge = arr[i];
            }
        }
        System.out.println("largest: " + large);
        System.out.println("second largest: " + slarge);

    }
}
