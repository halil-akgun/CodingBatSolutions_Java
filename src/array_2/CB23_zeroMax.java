package array_2;

import java.util.Arrays;

/*
Return a version of the given array where each zero value in the array is replaced by the largest odd value to
the right of the zero in the array. If there is no odd value to the right of the zero, leave the zero as a zero.

zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3]
zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
zeroMax([0, 1, 0]) → [1, 1, 0]
 */
public class CB23_zeroMax {
    public static void main(String[] args) {
        int[] arr = {0, 5, 0, 3};
        System.out.println(Arrays.toString(zeroMax(arr)));
    }

    public static int[] zeroMax(int[] nums) {
        int largestOddValue = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] % 2 == 1) {
                        largestOddValue = Math.max(largestOddValue, nums[j]);
                        nums[i] = largestOddValue;
                    }
                }
            }
            largestOddValue = Integer.MIN_VALUE;
        }
        return nums;
    }
}
