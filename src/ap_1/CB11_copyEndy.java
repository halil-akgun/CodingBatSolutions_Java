package ap_1;

import java.util.Arrays;

/*
We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
Given an array of positive ints, return a new array of length "count" containing
the first endy numbers from the original array. Decompose out a separate isEndy(int n) method
to test if a number is endy. The original array will contain at least "count" endy numbers.

copyEndy([9, 11, 90, 22, 6], 2) → [9, 90]
copyEndy([9, 11, 90, 22, 6], 3) → [9, 90, 6]
copyEndy([12, 1, 1, 13, 0, 20], 2) → [1, 1]
 */
public class CB11_copyEndy {
    public static void main(String[] args) {
        int[] arr = {9, 11, 90, 22, 6};
        System.out.println(Arrays.toString(copyEndy(arr, 2)));
    }

    public static int[] copyEndy(int[] nums, int count) {
        int[] ans = new int[count];
        int idx = 0;

        for (int w : nums) {
            if (isEndy(w)) {
                ans[idx++] = w;
                if (idx == ans.length) break;
            }
        }
        return ans;
    }

    private static boolean isEndy(int w) {
        return w >= 0 && w <= 10 || w >= 90 && w <= 100;
    }
}
