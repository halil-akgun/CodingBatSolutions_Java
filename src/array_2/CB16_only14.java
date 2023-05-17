package array_2;

import java.util.Arrays;

/*
Given an array of ints, return true if every element is a 1 or a 4.

only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */
public class CB16_only14 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4};
        System.out.println(only14(arr));
    }

    public static boolean only14(int[] nums) {
        return Arrays.stream(nums).filter(t -> t == 1 || t == 4).count() == nums.length;
    }
}
