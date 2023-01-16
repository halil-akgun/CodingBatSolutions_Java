package array_1;

import java.util.Arrays;

/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]
 */
public class CB04_middleWay {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3};
        int[] brr = {1, 2, 3};
        System.out.println(Arrays.toString(middleWay(arr, brr)));
    }

    public static int[] middleWay(int[] a, int[] b) {
        int[] arr = new int[2];
        arr[0] = a[1];
        arr[1] = b[1];
        return arr;
    }

}
