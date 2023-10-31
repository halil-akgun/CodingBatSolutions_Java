package recursion_2;

/*
Given an array of ints, is it possible to divide the ints into two groups,
so that the sum of the two groups is the same, with these constraints:
all the values that are multiple of 5 must be in one group, and all the values
that are a multiple of 3 (and not a multiple of 5) must be in the other. (No loops needed.)

split53([1, 1]) → true
split53([1, 1, 1]) → false
split53([2, 4, 2]) → true
 */
public class CB07_split53 {
    public static void main(String[] args) {
        System.out.println(split53(new int[]{2, 4, 2}));
    }

    public static boolean split53(int[] nums) {
        return helperMethot(0, nums, 0, 0);
    }

    private static boolean helperMethot(int index, int[] nums, int group1, int group2) {

        if (index == nums.length) return group1 == group2;

        if (nums[index] % 5 == 0) return helperMethot(index + 1, nums, group1 + nums[index], group2);
        else if (nums[index] % 3 == 0) return helperMethot(index + 1, nums, group1, group2 + nums[index]);

        return helperMethot(index + 1, nums, group1 + nums[index], group2)
                || helperMethot(index + 1, nums, group1, group2 + nums[index]);
    }
}
