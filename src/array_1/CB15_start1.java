package array_1;

import java.util.Arrays;

/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.

start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */
public class CB15_start1 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] brr = {1, 3};
        System.out.println(start1(arr, brr));
    }

    public static int start1(int[] a, int[] b) {
        int counter = 0;
        if (a.length > 0 && a[0] == 1) counter++;
        if (b.length > 0 && b[0] == 1) counter++;
        return counter;
    }
}
