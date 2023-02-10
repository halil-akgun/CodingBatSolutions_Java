package array_1;

import java.util.Arrays;

/*
Given 2 int arrays, a and b, return a new array length 2 containing, as much as will fit, the elements from a followed by
the elements from b. The arrays may be any length, including 0, but there will be 2 or more elements available between the 2 arrays.

make2([4, 5], [1, 2, 3]) → [4, 5]
make2([4], [1, 2, 3]) → [4, 1]
make2([], [1, 2]) → [1, 2]
 */
public class CB17_make2 {
    public static void main(String[] args) {
        int[] arr = {};
        int[] brr = {1, 2, 3};
        System.out.println(Arrays.toString(make2(arr, brr)));
    }

    public static int[] make2(int[] a, int[] b) {
        int[] result = new int[2];
        int idx = 0;
        for (int i = 0; i < a.length + b.length; i++) {
            if (i < a.length) {
                result[idx] = a[i];
            } else {
                result[idx] = b[i - a.length];
            }
            idx++;
            if (idx == 2) break;
        }
        return result;
    }
}
