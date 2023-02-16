package array_1;

import java.util.Arrays;
import java.util.List;

/*
Given an array of ints, return the sum of the first 2 elements in the array. If the array length is less than 2,
just sum up the elements that exist, returning 0 if the array is length 0.

sum2([1, 2, 3]) → 3
sum2([1, 1]) → 2
sum2([1, 1, 1, 1]) → 2
 */
public class CB21_sum2 {
    public static void main(String[] args) {
        System.out.println(sum2(new int[]{1, 2, 3}));
    }

    public static int sum2(int[] nums) {
        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];
        return nums[0] + nums[1];
    }
}
