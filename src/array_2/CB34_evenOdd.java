package array_2;

import java.util.Arrays;

/*
Return an array that contains the exact same numbers as the given array, but rearranged so that
all the even numbers come before all the odd numbers. Other than that, the numbers can be in any order.
You may modify and return the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
evenOdd([3, 3, 2]) → [2, 3, 3]
evenOdd([2, 2, 2]) → [2, 2, 2]
 */
public class CB34_evenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 1, 1};
        System.out.println(Arrays.toString(evenOdd(arr)));
    }

    public static int[] evenOdd(int[] nums) {
        int[] result = new int[nums.length];
        int amountOfOddNumbers = (int) Arrays.stream(nums).filter(t -> t % 2 == 1).count();
        int evenIdx = 0;
        for (int w : nums) {
            if (w % 2 == 0) result[evenIdx++] = w;
            else result[nums.length - (amountOfOddNumbers--)] = w;
        }
        return result;
    }
}
