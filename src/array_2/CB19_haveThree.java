package array_2;

/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.

haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */
public class CB19_haveThree {
    public static void main(String[] args) {
        int[] arr = {3, 1, 3, 1, 3};
        System.out.println(haveThree(arr));
    }

    public static boolean haveThree(int[] nums) {
        if (nums.length < 4) return false;
        int count = 0;
        if (nums[0] == 3 && nums[1] != 3) count++;
        if (nums[nums.length - 1] == 3 && nums[nums.length - 2] != 3) count++;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == 3 && nums[i - 1] != 3 && nums[i + 1] != 3) count++;
        }
        return count == 3;
    }
}
