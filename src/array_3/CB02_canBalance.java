package array_3;

import java.util.Arrays;

/*
Given a non-empty array, return true if there is a place to split the array so that
the sum of the numbers on one side is equal to the sum of the numbers on the other side.

canBalance([1, 1, 1, 2, 1]) → true
canBalance([2, 1, 1, 2, 1]) → false
canBalance([10, 10]) → true
 */
public class CB02_canBalance {
    public static void main(String[] args) {
        int[] arr = {2, 1, 1, 2, 1};
        System.out.println(canBalance(arr));
    }

    public static boolean canBalance(int[] nums) {
        double sum = Arrays.stream(nums).reduce(Integer::sum).orElseThrow(() ->
                new RuntimeException("Array is empty."));
        double temp = 0;
        for (int w : nums) {
            temp += w;
            System.out.println(temp);
            if (sum / 2 == temp) return true;
        }
        return false;
    }
}
