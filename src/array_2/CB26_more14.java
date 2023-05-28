package array_2;

import java.util.Arrays;

/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's

more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
public class CB26_more14 {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1};
        System.out.println(more14(arr));
    }

    public static boolean more14(int[] nums) {
        int one = (int) Arrays.stream(nums).filter(t -> t == 1).count();
        int four = (int) Arrays.stream(nums).filter(t -> t == 4).count();
        return one > four;
    }
}
