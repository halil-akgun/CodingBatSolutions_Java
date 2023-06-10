package array_3;

import java.util.Arrays;
import java.util.List;

/*
Consider the leftmost and rightmost appearances of some value in an array. We'll say that the "span" is the number of
elements between the two inclusive. A single value has a span of 1. Returns the largest span found in the given array.
(Efficiency is not a priority.)

maxSpan([1, 2, 1, 1, 3]) → 4
maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
 */
public class CB01_maxSpan {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 1, 3};
        System.out.println(maxSpan(arr));
    }

    public static int maxSpan(int[] nums) {
        int max = 0;
        List<Integer> list = Arrays.stream(nums).boxed().toList();
        for (int i = 0; i < list.size(); i++) {
            int span = list.lastIndexOf(list.get(i)) - i + 1;
            max = Math.max(max, span);
        }
        return max;
    }
}
