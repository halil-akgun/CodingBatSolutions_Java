package array_1;

import java.util.Arrays;

/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.

maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
public class CB12_maxEnd3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(maxEnd3(arr)));
    }

    public static int[] maxEnd3(int[] nums) {
        int[] arr = new int[nums.length];
        int max = Math.max(nums[0], nums[nums.length - 1]);
        Arrays.fill(arr, max);
        return arr;
    }
}
