package recursion_2;

/*
Given an array of ints, is it possible to divide the ints into two groups, so that the sum of
one group is a multiple of 10, and the sum of the other group is odd. Every int must be in
one group or the other. Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitOdd10(). (No loops needed.)

splitOdd10([5, 5, 5]) → true
splitOdd10([5, 5, 6]) → false
splitOdd10([5, 5, 6, 1]) → true
 */
public class CB04_splitOdd10 {
    public static void main(String[] args) {
        System.out.println(splitOdd10(new int[]{5, 5, 5}));
    }

    public static boolean splitOdd10(int[] nums) {
        return splitHelper(nums, 0, 0, 0); // chatGPT
    }

    public static boolean splitHelper(int[] nums, int index, int group1Sum, int group2Sum) {
        if (index == nums.length) {
            return (group1Sum % 10 == 0 && group2Sum % 2 == 1) || (group2Sum % 10 == 0 && group1Sum % 2 == 1);
        }

        int number = nums[index];
        // Try adding the current number to the first group
        if (splitHelper(nums, index + 1, group1Sum + number, group2Sum)) {
            return true;
        }

        // Try adding the current number to the second group
        if (splitHelper(nums, index + 1, group1Sum, group2Sum + number)) {
            return true;
        }

        return false;
    }
}
