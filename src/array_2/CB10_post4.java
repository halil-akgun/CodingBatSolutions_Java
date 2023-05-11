package array_2;

import java.util.Arrays;

/*
Given a non-empty array of ints, return a new array containing the elements from the original array that
come after the last 4 in the original array. The original array will contain at least one 4.
Note that it is valid in java to create an array of length 0.

post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */
public class CB10_post4 {
    public static void main(String[] args) {
        int[] arr = {4, 4, 1, 2, 3};
        System.out.println(Arrays.toString(post4(arr)));
    }

    public static int[] post4(int[] nums) {
        int indexOfLast4 = -1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == 4) {
                indexOfLast4 = i;
                break;
            }
        }
        if (indexOfLast4 == -1) return new int[0];
        int[] result = new int[nums.length - (indexOfLast4 + 1)];

        System.arraycopy(nums, indexOfLast4 + 1, result, 0, nums.length - (indexOfLast4 + 1));

//        for (int i = indexOfLast4 + 1; i < nums.length; i++) {
//            result[i - (indexOfLast4 + 1)] = nums[i];
//        }


        return result;
    }
}
