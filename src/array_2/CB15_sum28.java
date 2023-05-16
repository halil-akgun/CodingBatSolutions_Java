package array_2;

/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.

sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */
public class CB15_sum28 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 6, 99, 99, 7};
        System.out.println(sum28(arr));
    }

    public static boolean sum28(int[] nums) {
        int sumOf2 = 0;
        for (int w : nums) {
            if (w == 2) sumOf2 += 2;
        }
        return sumOf2 == 8;
    }
}
