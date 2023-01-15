package array_1;

/*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more.

commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */
public class CB01_commonEnd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int[] brr = {2, 3, 5};
        System.out.println(commonEnd(arr, brr));
    }

    public static boolean commonEnd(int[] a, int[] b) {
        return a[0] == b[0] || a[a.length - 1] == b[b.length - 1];
    }

}
