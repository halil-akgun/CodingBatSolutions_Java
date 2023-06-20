package array_3;

import java.util.Arrays;

/*
Given two arrays of ints sorted in increasing order, outer and inner, return true if all the numbers
in inner appear in outer. The best solution makes only a single "linear" pass of both arrays,
taking advantage of the fact that both arrays are already in sorted order.

linearIn([1, 2, 4, 6], [2, 4]) → true
linearIn([1, 2, 4, 6], [2, 3, 4]) → false
linearIn([1, 2, 4, 4, 6], [2, 4]) → true
 */
public class CB05_linearIn {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 6};
        int[] arr2 = {2, 4};
        System.out.println(linearIn(arr1, arr2));
    }

    public static boolean linearIn(int[] outer, int[] inner) {
        String outerStr = Arrays.toString(outer);
        int count = 0;
        for (int w : inner) {
            if (outerStr.contains(String.valueOf(w))) count++;
        }
        return count >= inner.length;

//  It doesn't have to be consecutive:
//        String outerStr = Arrays.toString(outer);
//        String innerStr = Arrays.toString(inner);
//        innerStr = innerStr.substring(1, innerStr.length() - 1);
//        return outerStr.contains(innerStr);
    }
}
