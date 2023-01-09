package Leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int target = 6;
        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    static int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        Map<Integer, Integer> h = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            if (h.containsKey(target - numbers[i])) {
                res[1] = i;
                res[0] = h.get(target - numbers[i]);
                return res;
            }
            h.put(numbers[i], i);
        }
        return res;
    }
}
