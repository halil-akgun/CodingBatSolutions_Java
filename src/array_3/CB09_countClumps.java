package array_3;

import java.util.HashSet;

/*
Say that a "clump" in an array is a series of 2 or more adjacent elements of the same value.
Return the number of clumps in the given array.

countClumps([1, 2, 2, 3, 4, 4]) → 2
countClumps([1, 1, 2, 1, 1]) → 2
countClumps([1, 1, 1, 1, 1]) → 1
 */
public class CB09_countClumps {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4};
        System.out.println(countClumps(arr));
    }

    public static int countClumps(int[] nums) {
        HashSet<Integer> count = new HashSet<>();
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) count.add(temp);
            else temp++;
        }
        return count.size();
    }
}
