package functional_2_lambda;

import java.util.List;

/*
Given a list of integers, return a list of the integers, omitting any that are less than 0.

noNeg([1, -2]) → [1]
noNeg([-3, -3, 3, 3]) → [3, 3]
noNeg([-1, -1, -1]) → []
 */
public class CB01_noNeg {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, -2, 3);
        System.out.println(noNeg(nums));
    }

    public static List<Integer> noNeg(List<Integer> nums) {
        return nums.stream().filter(t -> t >= 0).toList();
//        nums.removeIf(n -> n < 0);
//        return nums;
    }
}