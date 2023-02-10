package array_1;
/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.

maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */
public class CB17_maxTriple {
    public static void main(String[] args) {
        int[] a = {1};
        System.out.println(maxTriple(a));
    }

    public static int maxTriple(int[] nums) {
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || i == nums.length - 1 || i == nums.length / 2) {
                max = Math.max(max, nums[i]);
            }
        }
        return max;
    }
}
