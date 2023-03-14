package logic_2;

import java.util.Arrays;

/*
Given three ints, a b c, one of them is small, one is medium and one is large. Return true if the three values are
evenly spaced, so the difference between small and medium is the same as the difference between medium and large.

evenlySpaced(2, 4, 6) → true
evenlySpaced(4, 6, 2) → true
evenlySpaced(4, 6, 3) → false
 */
public class CB06_evenlySpaced {
    public static void main(String[] args) {
        System.out.println(evenlySpaced(2, 4, 6));
    }

    public static boolean evenlySpaced(int a, int b, int c) {
        int[] arr = {a, b, c};
        Arrays.sort(arr);
        return (Math.abs(arr[0] - arr[1]) == Math.abs(arr[1] - arr[2]));
    }
}
