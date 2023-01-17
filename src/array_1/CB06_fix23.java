package array_1;

import java.util.Arrays;

/*
Given an int array length 3, if there is a 2 in the array immediately followed by a 3, set the 3 element to 0. Return the changed array.

fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
 */
public class CB06_fix23 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 5};
        System.out.println(Arrays.toString(fix23(a)));
    }

    public static int[] fix23(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == 2 && nums[i] == 3) nums[i] = 0;
        }
        return nums;
    }

}
