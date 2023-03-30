package functional_2_lambda;

import java.util.List;

/*
Given a list of integers, return a list of those numbers, omitting any that are between 13 and 19 inclusive.

noTeen([12, 13, 19, 20]) → [12, 20]
noTeen([1, 14, 1]) → [1, 1]
noTeen([15]) → []
 */
public class CB07_noTeen {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3);
        System.out.println(noTeen(nums));
    }

    public static List<Integer> noTeen(List<Integer> nums) {
        nums.removeIf(t -> t >= 13 && t <= 19);
        return nums;
    }
}
