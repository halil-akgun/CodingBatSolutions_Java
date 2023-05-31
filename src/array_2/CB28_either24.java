package array_2;

/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.

either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
 */
public class CB28_either24 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2};
        System.out.println(either24(arr));
    }

    public static boolean either24(int[] nums) {
        int count2 = 0;
        int count4 = 0;
        for (int i = 1; i < nums.length; i++) {
            if ((nums[i - 1] == 2 && nums[i] == 2) || (nums[i - 1] == 2 && nums[i] == 4)) count2++;
            if ((nums[i - 1] == 4 && nums[i] == 4)) count4++;
        }
        if (count2 == 0 && count4 > 0) return true;
        return count4 == 0 && count2 > 0;
    }
}
