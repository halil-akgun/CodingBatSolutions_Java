package recursion_2;

/*
Given an array of ints, is it possible to divide the ints into two groups,
so that the sums of the two groups are the same. Every int must be in one group or the other.
Write a recursive helper method that takes whatever arguments you like,
and make the initial call to your recursive helper from splitArray(). (No loops needed.)

splitArray([2, 2]) → true
splitArray([2, 3]) → false
splitArray([5, 2, 3]) → true
 */
public class CB08_splitArray {
    public static void main(String[] args) {
        System.out.println(splitArray(new int[]{2, 3}));
    }

    public static boolean splitArray(int[] nums) {
        return helperMethod(0, nums, 0, 0);
    }

    static boolean helperMethod(int index, int[] nums, int group1Sum, int group2Sum) {

        if (index == nums.length) return group1Sum == group2Sum;

        return helperMethod(index + 1, nums, group1Sum + nums[index], group2Sum)
                || helperMethod(index + 1, nums, group1Sum, group2Sum + nums[index]);
    }
}
