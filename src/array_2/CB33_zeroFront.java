package array_2;

import java.util.Arrays;

/*
Return an array that contains the exact same numbers as the given array, but rearranged so that all the zeros are
grouped at the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1}
becomes {0 ,0, 1, 1}. You may modify and return the given array or make a new array.

zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
zeroFront([1, 0]) → [0, 1]
 */
public class CB33_zeroFront {
    public static void main(String[] args) {
        int[] arr = {1, 0, 0, 1};
        System.out.println(Arrays.toString(zeroFront(arr)));
    }

    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int countNonZero = (int) Arrays.stream(nums).filter(t -> t != 0).count();
        for (int i = 0; i < result.length; i++) {
            if (nums[i] != 0) {
                result[result.length - countNonZero] = nums[i];
                countNonZero--;
            }
        }
        return result;
    }
}
