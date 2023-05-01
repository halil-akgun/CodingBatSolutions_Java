package array_2;

import java.util.Arrays;

/*
Return the number of even ints in the given array.
Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */
public class CB01_countEvens {
    public static void main(String[] args) {
        int[] arr = {1, 3, 5};
        System.out.println(countEvens(arr));
    }

    public static int countEvens(int[] nums) {
        return (int) Arrays.stream(nums).filter(t -> t % 2 == 0).count();
    }
}
