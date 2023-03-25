package functional_1_lambda;

import java.util.List;

/*
Given a list of integers, return a list where each integer is added to 1 and the result is multiplied by 10.

math1([1, 2, 3]) → [20, 30, 40]
math1([6, 8, 6, 8, 1]) → [70, 90, 70, 90, 20]
math1([10]) → [110]
 */
public class CB08_math1 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 3);
        System.out.println(math1(nums));
    }

    public static List<Integer> math1(List<Integer> nums) {
//        return nums.stream().map(t -> (t + 1) * 10).toList();
        nums.replaceAll(t -> (t + 1) * 10);
        return nums;
    }
}
