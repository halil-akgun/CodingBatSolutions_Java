package array_1;

import java.util.Arrays;

/*
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.

midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
Go...S
 */
public class CB08_midThree {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        System.out.println("midThree() = " + Arrays.toString(midThree(arr)));
    }

    public static int[] midThree(int[] nums) {
        int[] arr = new int[3];
        arr[0] = nums[(nums.length / 2) - 1];
        arr[1] = nums[nums.length / 2];
        arr[2] = nums[(nums.length / 2) + 1];
        return arr;
    }
}
