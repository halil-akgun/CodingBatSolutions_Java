package array_1;

/*
We'll say that a 1 immediately followed by a 3 in an array is an "unlucky" 1. Return true if the given array contains
an unlucky 1 in the first 2 or last 2 positions in the array.

unlucky1([1, 3, 4, 5]) → true
unlucky1([2, 1, 3, 4, 5]) → true
unlucky1([1, 1, 1]) → false
 */
public class CB09_unlucky1 {
    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 5};
        System.out.println("unlucky1(arr) = " + unlucky1(arr));
    }

    public static boolean unlucky1(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] == 1 && i - 1 < 2) || (nums[i - 1] == 1 && i - 1 > nums.length - 3))
                if (nums[i - 1] == 1 && nums[i] == 3) return true;
        }
        return false;
    }

}
