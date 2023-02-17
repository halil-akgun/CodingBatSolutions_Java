package array_1;

/*

Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.

double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */
public class CB23_double23 {
    public static void main(String[] args) {
        System.out.println(double23(new int[]{}));
    }

    public static boolean double23(int[] nums) {
        int count2 = 0;
        int count3 = 0;
        for (int w : nums) {
            if (w == 2) count2++;
            else if (w == 3) count3++;
        }
        return (count2 == 2 || count3 == 2);
    }
}
