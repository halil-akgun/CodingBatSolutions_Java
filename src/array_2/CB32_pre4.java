package array_2;

import java.util.Arrays;

/*
Given a non-empty array of ints, return a new array containing the elements from
the original array that come before the first 4 in the original array. The original array will
contain at least one 4. Note that it is valid in java to create an array of length 0.

pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
 */
public class CB32_pre4 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 2, 2, 2, 4, 1};
        System.out.println(Arrays.toString(pre4(arr)));
    }

    public static int[] pre4(int[] nums) {
        if (nums.length == 0) return nums;
        int[] result = new int[0];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4) {
                result = new int[i];
                break;
            }
        }
        System.arraycopy(nums, 0, result, 0, result.length);
        return result;
    }
}
