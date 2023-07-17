package ap_1;

import java.util.Arrays;

/*
Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a multiple of 10,
such as 40 or 90. Return the sum of largest special score in A and the largest special score in B.
To practice decomposition, write a separate helper method which finds the largest special score in an array.
Write your helper method after your scoresSpecial() method in the JavaBat text area.

scoresSpecial([12, 10, 4], [2, 20, 30]) → 40
scoresSpecial([20, 10, 4], [2, 20, 10]) → 40
scoresSpecial([12, 11, 4], [2, 20, 31]) → 20
 */
public class CB19_scoresSpecial {
    public static void main(String[] args) {
        int[] arr1 = {12, 10, 4};
        int[] arr2 = {2, 20, 30};
        System.out.println(scoresSpecial(arr1, arr2));
    }

    public static int scoresSpecial(int[] a, int[] b) {
        return helperMethod(a) + helperMethod(b);
    }

    public static int helperMethod(int[] a) {
        return Arrays.stream(a).filter(t -> t % 10 == 0).max().orElse(0);
    }
}
