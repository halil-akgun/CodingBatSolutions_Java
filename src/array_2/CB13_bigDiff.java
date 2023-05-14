package array_2;

import java.util.Arrays;

/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.

bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
 */
public class CB13_bigDiff {
    public static void main(String[] args) {
        int[] arr = {4, 4, 10, 2, 3};
        System.out.println(bigDiff(arr));
    }

    public static int bigDiff(int[] nums) {
        Arrays.sort(nums);
        return nums.length > 0 ? nums[nums.length - 1] - nums[0] : 0;
    }
}
