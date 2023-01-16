package array_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.

reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */
public class CB03_reverse3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(Arrays.toString(reverse3(arr)));
    }

    public static int[] reverse3(int[] nums) {
        int[] numsReverse = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numsReverse[nums.length - 1 - i] = nums[i];
        }
        return numsReverse;
    }

}
