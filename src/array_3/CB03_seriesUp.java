package array_3;

import java.util.Arrays;

/*
Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ... 1, 2, 3 .. n} (spaces added to show the
grouping). Note that the length of the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly n*(n + 1)/2.

seriesUp(3) → [1, 1, 2, 1, 2, 3]
seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
seriesUp(2) → [1, 1, 2]
 */
public class CB03_seriesUp {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(6)));
    }

    public static int[] seriesUp(int n) {
        if (n == 0) return new int[0];
        StringBuilder sb = new StringBuilder();
        boolean isDone = false;
        for (int i = 1; i > 0; i++) {
            if (isDone) break;
            for (int j = 1; j <= i; j++) {
                sb.append(j);
                if (j == n) {
                    isDone = true;
                    break;
                }
                sb.append(" ");
            }
        }
        return Arrays.stream(sb.toString().split(" ")).mapToInt(Integer::parseInt).toArray();
    }
}
