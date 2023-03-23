package functional_1_lambda;

import java.util.List;

/*
Given a list of integers, return a list where each integer is multiplied by 2.

doubling([1, 2, 3]) → [2, 4, 6]
doubling([6, 8, 6, 8, -1]) → [12, 16, 12, 16, -2]
doubling([]) → []
 */
public class CB01_doubling {
    public static void main(String[] args) {
        List<Integer> nums = List.of(6, 8, 6, 8, -1);
        System.out.println(doubling(nums));
    }

    public static List<Integer> doubling(List<Integer> nums) {
        return nums.stream().map(t -> t * 2).toList();
    }
}