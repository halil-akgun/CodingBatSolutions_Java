package array_2;

import java.util.Arrays;

/*
For each multiple of 10 in the given array, change all the values following it to be that multiple of 10,
until encountering another multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.

tenRun([2, 10, 3, 4, 20, 5]) → [2, 10, 10, 10, 20, 20]
tenRun([10, 1, 20, 2]) → [10, 10, 20, 20]
tenRun([10, 1, 9, 20]) → [10, 10, 10, 20]
 */
public class CB21_tenRun {
    public static void main(String[] args) {
        int[] arr = {2, 10, 3, 4, 20, -5};
        System.out.println(Arrays.toString(tenRun(arr)));
    }

    public static int[] tenRun(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 10 == 0) {
                for (int j = i + 1; j < nums.length && !(nums[j] % 10 == 0); j++) nums[j] = nums[i];
            }
        }
        return nums;
    }
}
