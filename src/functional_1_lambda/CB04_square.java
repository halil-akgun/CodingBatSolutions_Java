package functional_1_lambda;

import java.util.List;

/*
Given a list of integers, return a list where each integer is multiplied with itself.

square([1, 2, 3]) → [1, 4, 9]
square([6, 8, -6, -8, 1]) → [36, 64, 36, 64, 1]
square([]) → []
 */
public class CB04_square {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3);
        System.out.println(square(nums));
    }

    public static List<Integer> square(List<Integer> nums) {
        /*nums.replaceAll(t -> t * t);
        return nums;*/
        return nums.stream().map(Math::sqrt).map(Double::intValue).toList();
    }
}
