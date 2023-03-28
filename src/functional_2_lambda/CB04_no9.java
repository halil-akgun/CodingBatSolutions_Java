package functional_2_lambda;

import java.util.List;

/*
Given a list of non-negative integers, return a list of those numbers except omitting any that end with 9. (Note: % by 10)

no9([1, 2, 19]) → [1, 2]
no9([9, 19, 29, 3]) → [3]
no9([1, 2, 3]) → [1, 2, 3]
 */
public class CB04_no9 {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 19);
        System.out.println(no9(nums));
    }

    public static List<Integer> no9(List<Integer> nums) {
        nums.removeIf(t -> t % 10 == 9);
        return nums;
    }
}
