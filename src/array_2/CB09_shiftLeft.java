package array_2;

import java.util.Arrays;

/*
Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.

shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */
public class CB09_shiftLeft {
    public static void main(String[] args) {
        int[] arr = {5, 6, 45, 99, 13, 5, 6};
        System.out.println(Arrays.toString(shiftLeft(arr)));
    }

    public static int[] shiftLeft(int[] nums) {
        if (nums.length == 0 || nums.length == 1) return nums;
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            nums[i - 1] = nums[i];
        }
        nums[nums.length - 1] = temp;
        return nums;
    }
}
