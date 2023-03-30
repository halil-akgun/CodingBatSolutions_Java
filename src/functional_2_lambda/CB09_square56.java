package functional_2_lambda;

import java.util.List;

/*
Given a list of integers, return a list of those numbers squared and the product added to 10, omitting any of
the resulting numbers that end in 5 or 6.

square56([3, 1, 4]) → [19, 11]
square56([1]) → [11]
square56([2]) → [14]
 */
public class CB09_square56 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(3, 1, 4);
        System.out.println(square56(nums));
    }

    public static List<Integer> square56(List<Integer> nums) {
        return nums.stream().map(t -> (int) Math.pow(t, 2) + 10).filter(t -> !(t % 10 == 5 || t % 10 == 6)).toList();
//        nums.replaceAll(t -> (t * t) + 10);
//        nums.removeIf(t -> t % 10 == 5 || t % 10 == 6);
//        return nums;
    }
}