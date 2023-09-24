package recursion_2;

import java.util.Arrays;

/*
Given an array of ints, is it possible to choose a group of some of the ints, such that the group sums
to the given target? This is a classic backtracking recursion problem. Once you understand the recursive
backtracking strategy in this problem, you can use the same pattern for many problems to search
a space of choices. Rather than looking at the whole array, our convention is to consider the part of
the array starting at index start and continuing to the end of the array. The caller can specify the whole
array simply by passing start as 0. No loops are needed -- the recursive calls progress down the array.

groupSum(0, [2, 4, 8], 10) → true
groupSum(0, [2, 4, 8], 14) → true
groupSum(0, [2, 4, 8], 9) → false
 */
public class CB01_groupSum {
    public static void main(String[] args) {
        System.out.println(groupSum(0, new int[]{2, 4, 8}, 10));
    }

    public static boolean groupSum(int start, int[] nums, int target) {

//        if ((start >= nums.length - 1) || nums.length < 2) return false;
//
//        int[] newArray = new int[nums.length - 1];
//        System.arraycopy(nums, 0, newArray, 0, 1);
//        System.arraycopy(nums, 2, newArray, 1, nums.length - 2);
//
//        return (nums[start] + nums[start + 1] == target)
//                || groupSum(start, newArray, target)
//                || groupSum(start, Arrays.copyOfRange(nums, 1, nums.length - 1), target);

        // chatGPT:

        // Temel durumlar
        if (start >= nums.length) {
            return target == 0;
        }

        // Şu anki elemanı dahil etmeyi dene
        if (groupSum(start + 1, nums, target - nums[start])) {
            return true;
        }

        // Şu anki elemanı dahil etmeme seçeneğini dene
        if (groupSum(start + 1, nums, target)) {
            return true;
        }

        return false;
    }
}
