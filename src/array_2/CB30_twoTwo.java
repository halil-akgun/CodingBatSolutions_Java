package array_2;

/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.

twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */
public class CB30_twoTwo {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2};
        System.out.println(twoTwo(arr));
    }

    public static boolean twoTwo(int[] nums) {
        if (nums.length == 1 && nums[0] == 2) return false;
        if (nums.length == 1 || nums.length == 0) return true;
        if (nums[0] == 2 && nums[1] != 2) return false;
        if (nums[nums.length - 1] == 2 && nums[nums.length - 2] != 2) return false;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 2) {
                if (nums[i - 1] != 2 && nums[i + 1] != 2) return false;
            }
        }
        return true;
    }
}
