package ap_1;

import java.util.Arrays;

/*
Given an array of positive ints, return a new array of length "count" containing the first even numbers
from the original array. The original array will contain at least "count" even numbers.

copyEvens([3, 2, 4, 5, 8], 2) → [2, 4]
copyEvens([3, 2, 4, 5, 8], 3) → [2, 4, 8]
copyEvens([6, 1, 2, 4, 5, 8], 3) → [6, 2, 4]
 */
public class CB04_copyEvens {
    public static void main(String[] args) {
        int[] arr = {3, 2, 4, 5, 8};
        System.out.println(Arrays.toString(copyEvens(arr, 1)));
    }

    public static int[] copyEvens(int[] nums, int count) {
        int[] result = new int[count];
        int idx = 0;
        for (int w : nums) {
            if (idx == count) break;
            if (w % 2 == 0) result[idx++] = w;
        }
        return result;
    }
}
