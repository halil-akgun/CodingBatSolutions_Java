package functional_1_lambda;

import java.util.List;

/*
Given a list of non-negative integers, return an integer list of the rightmost digits. (Note: use %)

rightDigit([1, 22, 93]) → [1, 2, 3]
rightDigit([16, 8, 886, 8, 1]) → [6, 8, 6, 8, 1]
rightDigit([10, 0]) → [0, 0]
 */
public class CB03_rightDigit {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 22, 93);
        System.out.println(rightDigit(nums));
    }

    public static List<Integer> rightDigit(List<Integer> nums) {
        /*nums.replaceAll(t -> t % 10);
        return nums;*/
        return nums.stream().map(t -> t % 10).toList();
    }
}
