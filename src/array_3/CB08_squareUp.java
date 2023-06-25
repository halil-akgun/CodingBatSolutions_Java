package array_3;

import java.util.Arrays;

/*
Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to show the 3 groups).

squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
squareUp(2) → [0, 1, 2, 1]
squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
 */
public class CB08_squareUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(4)));
    }

    public static int[] squareUp(int n) {
        int[] result = new int[n * n];
        int fill = n;
        for (int i = result.length - 1; i >= 0; i -= n) {
            for (int j = 1; j <= fill; j++) {
                result[i - j + 1] = j;
            }
            fill--;
        }
        return result;
    }
}
