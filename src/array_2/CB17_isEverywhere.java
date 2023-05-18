package array_2;

/*
We'll say that a value is "everywhere" in an array if for every pair of adjacent elements in the array,
at least one of the pairs is that value. Return true if the given value is everywhere in the array.

isEverywhere([1, 2, 1, 3], 1) → true
isEverywhere([1, 2, 1, 3], 2) → false
isEverywhere([1, 2, 1, 3, 4], 1) → false
 */
public class CB17_isEverywhere {
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 4};
        System.out.println(isEverywhere(arr, 1));
    }

    public static boolean isEverywhere(int[] nums, int val) {
        for (int i = 1; i < nums.length; i++) {
            if (!(nums[i - 1] == val || nums[i] == val)) return false;
        }
        return true;
    }
}
