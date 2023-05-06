package array_2;

import java.util.Arrays;
import java.util.List;

/*
Given an array of ints, return true if it contains no 1's, or it contains no 4's.

no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */
public class CB05_no14 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        System.out.println(no14(arr));
    }

    public static boolean no14(int[] nums) {
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        return !list.contains(1) || !list.contains(4);

//        int one = 0;
//        int four = 0;
//        for (int num : nums) {
//            if (num == 1) one++;
//            if (num == 4) four++;
//        }
//        return one == 0 || four == 0;
    }
}
