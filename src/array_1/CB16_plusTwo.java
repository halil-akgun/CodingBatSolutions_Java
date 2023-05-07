package array_1;

import java.util.Arrays;

/*
Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.

plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
public class CB16_plusTwo {
    public static void main(String[] args) {
        int[] arr = {1, 2};
        int[] brr = {3, 4};
        System.out.println(Arrays.toString(plusTwo(arr, brr)));
    }

    public static int[] plusTwo(int[] a, int[] b) {
        int[] result = new int[a.length + b.length];
        for (int i = 0; i < result.length; i++) {
            if (i < a.length) result[i] = a[i];
            else result[i] = b[i - a.length];
        }
        return result;
    }

}
