package array_1;

import java.util.Arrays;

/*

Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.

front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]

 */
public class CB27_front11 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(front11(new int[]{1, 2}, new int[]{3, 4})));
    }

    public static int[] front11(int[] a, int[] b) {
        if (a.length == 0 && b.length == 0) return new int[]{};
        if (a.length == 0) return new int[]{b[0]};
        if (b.length == 0) return new int[]{a[0]};
        return new int[]{a[0], b[0]};
    }
}
