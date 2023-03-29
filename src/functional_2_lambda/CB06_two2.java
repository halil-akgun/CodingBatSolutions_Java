package functional_2_lambda;

import java.util.List;

/*
Given a list of non-negative integers, return a list of those numbers multiplied by 2,
omitting any of the resulting numbers that end in 2.

two2([1, 2, 3]) → [4, 6]
two2([2, 6, 11]) → [4]
two2([0]) → [0]
 */
public class CB06_two2 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3);
        System.out.println(two2(nums));
    }

    public static List<Integer> two2(List<Integer> nums) {
        return nums.stream().map(t -> t * 2).filter(t -> t % 10 != 2).toList();
//        nums.replaceAll(t -> t * 2);
//        nums.removeIf(t -> t % 10 == 2);
//        return nums;
    }
}