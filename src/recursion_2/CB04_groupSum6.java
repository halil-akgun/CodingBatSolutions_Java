package recursion_2;

/*
Given an array of ints, is it possible to choose a group of some of the ints,
beginning at the start index, such that the group sums to the given target?
However, with the additional constraint that all 6's must be chosen. (No loops needed.)

groupSum6(0, [5, 6, 2], 8) → true
groupSum6(0, [5, 6, 2], 9) → false
groupSum6(0, [5, 6, 2], 7) → false
 */
public class CB04_groupSum6 {
    public static void main(String[] args) {
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 8));
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 9));
        System.out.println(groupSum6(0, new int[]{5, 6, 2}, 7));
        System.out.println(groupSum6(0, new int[]{3, 2, 4, 6}, 8));
    }

    public static boolean groupSum6(int start, int[] nums, int target) { // chatGPT:
        if (start == nums.length) {
            return target == 0;
        }

        // If the current element is 6, we must include it and reduce the target by 6.
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - 6);
        }

        // If the current element is not 6, we have two choices:
        // 1. Include the current element and reduce the target by the current element's value.
        // 2. Exclude the current element and keep the target as is.
        return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
    }
}
