package array_3;

import java.util.Arrays;
import java.util.HashSet;

/*
(This is a slightly harder version of the fix34 problem.) Return an array that contains exactly
the same numbers as the given array, but rearranged so that every 4 is immediately followed by a 5.
Do not move the 4's, but every other number may move. The array contains the same number of 4's and 5's,
and every 4 has a number after it that is not a 4. In this version, 5's may appear anywhere in the original array.

fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
 */
public class CB07_fix45 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 5, 4, 1};
        System.out.println(Arrays.toString(fix45(arr)));
    }

    public static int[] fix45(int[] nums) {
        HashSet<Integer> indexesToIgnore = new HashSet<>();
        int temp;
        for (int i = 0; i < nums.length; i++) {
            if (i + 1 != nums.length && nums[i] == 4 && nums[i + 1] == 5) {
                indexesToIgnore.add(i);
                indexesToIgnore.add(i + 1);
            } else if (i + 1 != nums.length && nums[i] == 4 && nums[i + 1] != 5) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 5 && !indexesToIgnore.contains(j)) {
                        indexesToIgnore.add(i);
                        indexesToIgnore.add(i + 1);
                        temp = nums[i + 1];
                        nums[i + 1] = 5;
                        nums[j] = temp;
                        break;
                    }
                }
            }
        }
        return nums;
    }
}
