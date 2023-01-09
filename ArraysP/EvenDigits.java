package ArraysP;

public class EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 10, 245, 6666, 2, 12 };
        System.out.println(findNumbers(nums));
    }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }

    static boolean even(int num) {

        return digits2(num) % 2 == 0;
    }

    // static int digits(int num) {
    //     if (num < 0) {
    //         num *= -1;
    //     }
    //     int count = 0;
    //     while (num > 0) {
    //         count++;
    //         num = num / 10;
    //     }
    //     return count;
    // }

    static int digits2(int num){
        return (int)(Math.log10(num)) + 1;
    }
}
