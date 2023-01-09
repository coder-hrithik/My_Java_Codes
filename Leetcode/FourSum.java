package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = { 1, 1, 1, 2, 2, 3, 3, 4, 4, 4 };
        int target = 6;
        System.out.println(fourSum(nums, target));
    }

    public static ArrayList<List<Integer>> fourSum(int[] nums, int target) {

        ArrayList<List<Integer>> res = new ArrayList<List<Integer>>();
        if (nums == null || nums.length == 0)
            return res;

        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int target2 = target - nums[i] - nums[j];
                int front = j + 1;
                int back = nums.length - 1;

                while (front < back) {
                    int twoSum = nums[front] + nums[back];

                    if (twoSum < target2)
                        front++;
                    else if (twoSum > target2)
                        back--;
                    else {
                        List<Integer> quad = new ArrayList<Integer>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[front]);
                        quad.add(nums[back]);

                        res.add(quad);

                        while (front < back && nums[front] == quad.get(2))
                            ++front;
                        while (back > front && nums[back] == quad.get(3))
                            --back;
                    }
                }
                while (j + 1 < nums.length && nums[j + 1] == nums[j])
                    ++j;
            }
            while (i + 1 < nums.length && nums[i + 1] == nums[i])
                ++i;
        }
        return res;
    }
}
